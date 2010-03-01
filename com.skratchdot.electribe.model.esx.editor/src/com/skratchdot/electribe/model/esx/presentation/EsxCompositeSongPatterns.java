/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PatternNumber;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongPattern;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class EsxCompositeSongPatterns extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSongPatterns"; //$NON-NLS-1$

	private Song selectedSong;
	private List<SongPattern> selectedSongPatterns;
	private TableViewer tableViewer;

	private Text textPatternNumber;
	private Combo comboPatternNumber;
	private Text textNoteOffset;
	private Text inputNoteOffset;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSongPatterns(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSongPatterns(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new GridLayout(4, false));

		textPatternNumber = this.createGridData2ColumnTextLabel(this, "Pattern Number");
		comboPatternNumber = this.createGridData2ColumnComboInput(this, "Pattern Number", this.getLiteralStrings(PatternNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__PATTERN_NUMBER, PatternNumber.get(comboPatternNumber.getSelectionIndex()), false, -1);
			}
		});

		textNoteOffset = this.createGridData2ColumnTextLabel(this, "Note Offset");
		inputNoteOffset = this.createGridData2ColumnTextInput(this, "Note Offset", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__NOTE_OFFSET, Byte.parseByte(inputNoteOffset.getText()), false, -1);
			}
		});

		this.tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();
	}

	/**
	 * 
	 */
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));

		// Create our columns
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Current Position", 50);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Original Position", 50);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Pattern Number", 100);
		this.parentPart.addColumnToTableViewer(this.tableViewer, "Offset", 100);

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(this.getAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return selectedSong.getSongPatterns().toArray();
			}
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}			
		});

		// Label Provider		
		this.tableViewer.setLabelProvider(new TableViewerColorProvider(
			this.getAdapterFactory(),
			this.tableViewer,
			EsxPreferenceStore.getSongsBackgroundColorWhenNotEmpty(),
			EsxPreferenceStore.getSongsBackgroundColorWhenEmpty(),
			EsxPreferenceStore.getSongsForegroundColorWhenNotEmpty(),
			EsxPreferenceStore.getSongsForegroundColorWhenEmpty()
		));

		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
		        IStructuredSelection selection = (IStructuredSelection) event.getSelection();

		        Object[] objects = ((IStructuredSelection) selection).toArray();
		        selectedSongPatterns = new ArrayList<SongPattern>();
				for (Object obj : objects) {
					if(obj instanceof SongPattern) {
						selectedSongPatterns.add((SongPattern) obj);
					}
				}
				refresh();
				refreshInputs();
			}
		});
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if(input instanceof List<?>) {
			if( ((List<?>) input).size()>1 ) {
				this.selectedSong = null;
			}
			else {
				boolean isIterating = true;
				Iterator<?> it = ((List<?>) input).iterator();
				while (it.hasNext() && isIterating==true) {
					Object obj = it.next();
					if(obj instanceof Song) {
						this.selectedSong = (Song) obj;
						isIterating = false;
					}
				}
			}
		}

		this.tableViewer.setInput(this.selectedSong);
		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";

		this.textPatternNumber.setText(StringUtils.trim(getMultiString(this.selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__PATTERN_NUMBER, multipleValueString)));
		this.textNoteOffset.setText(StringUtils.trim(getMultiString(this.selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__NOTE_OFFSET, multipleValueString)));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		String multipleValueString = "";

		this.comboPatternNumber.setText(StringUtils.trim(getMultiString(this.selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__PATTERN_NUMBER, multipleValueString)));
		this.inputNoteOffset.setText(StringUtils.trim(getMultiString(this.selectedSongPatterns, EsxPackage.Literals.SONG_PATTERN__NOTE_OFFSET, multipleValueString)));		
	}

}
