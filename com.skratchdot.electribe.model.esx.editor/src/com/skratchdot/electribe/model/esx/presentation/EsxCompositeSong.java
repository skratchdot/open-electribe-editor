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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.MuteHold;
import com.skratchdot.electribe.model.esx.NextSongNumber;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongLength;
import com.skratchdot.electribe.model.esx.Tempo;
import com.skratchdot.electribe.model.esx.TempoLock;
import com.skratchdot.electribe.model.esx.editor.util.EsxObjectAdapter;

public class EsxCompositeSong extends EsxComposite {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxCompositeSong"; //$NON-NLS-1$

	private List<Song> songs;

	private ScrolledComposite scrolledComposite;
	private Composite compositeMain;
	private Composite compositeRow1;
	private Composite compositeRow2;
	private Composite compositeRow3;

	private Group groupSelectedSongs;
	private Text textSelectedTotal;
	private Text textSelectedNotEmpty;
	private Text textSelectedEmpty;

	private Group groupSongName;
	private Text textName;
	private Text inputName;
	private Button appendName;

	private Group groupGeneralInfo;
	private Text textTempo;
	private Text inputTempo;
	private Text textTempoLock;
	private Combo comboTempoLock;
	private Text textSongLength;
	private Combo comboSongLength;
	private Text textMuteHold;
	private Combo comboMuteHold;
	private Text textNextSongNumber;
	private Combo comboNextSongNumber;

	/**
	 * @param parent
	 * @param style
	 */
	public EsxCompositeSong(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @param parentPart
	 * @param parentComposite
	 * @param style
	 */
	public EsxCompositeSong(EsxEditorPart parentPart, Composite parentComposite, int style) {
		super(parentPart, parentComposite, style);
		this.parentPart = parentPart;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		compositeMain = new Composite(scrolledComposite, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.wrap = false;
		rowLayout.fill = true;
		compositeMain.setLayout(rowLayout);

		
		/* ======================== */
		/* ROW 1					*/
		/* ======================== */
		compositeRow1 = new Composite(compositeMain, SWT.NONE);
		compositeRow1.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSelectedSongs = new Group(compositeRow1, SWT.NONE);
		groupSelectedSongs.setText("Selected Songs");
		groupSelectedSongs.setLayout(new GridLayout(2, false));

		textSelectedTotal = this.createGridData2ColumnTextLabel(groupSelectedSongs, "Total # Selected");
		textSelectedNotEmpty = this.createGridData2ColumnTextLabel(groupSelectedSongs, "# of Selected (Not Empty)");
		textSelectedEmpty = this.createGridData2ColumnTextLabel(groupSelectedSongs, "# of Selected (Empty)");

		/* ======================== */
		/* ROW 2					*/
		/* ======================== */
		compositeRow2 = new Composite(compositeMain, SWT.NONE);
		compositeRow2.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupSongName = new Group(compositeRow2, SWT.NONE);
		groupSongName.setText("Song Name");
		groupSongName.setLayout(new GridLayout(4, false));

		textName = this.createGridData2ColumnTextLabel(groupSongName, "Name");
		inputName = this.createGridData2ColumnTextInput(groupSongName, "Name", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__NAME, inputName.getText(), appendName.getSelection(), 8);
			}
		});
		appendName = this.createGridData4ColumnCheckButton(groupSongName, "Append # when multiple songs are selected", true);

		/* ======================== */
		/* ROW 3					*/
		/* ======================== */
		compositeRow3 = new Composite(compositeMain, SWT.NONE);
		compositeRow3.setLayout(new FillLayout(SWT.HORIZONTAL));

		groupGeneralInfo = new Group(compositeRow3, SWT.NONE);
		groupGeneralInfo.setText("General Info");
		groupGeneralInfo.setLayout(new GridLayout(4, false));

		textTempo = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Tempo");
		inputTempo = this.createGridData2ColumnTextInput(groupGeneralInfo, "Tempo", new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__TEMPO, new EsxObjectAdapter() {
					@Override
					public Object getObject() {
						Tempo newTempo = EsxFactory.eINSTANCE.createTempo();
						newTempo.setValue(newTempo.getValidValue(Float.parseFloat(inputTempo.getText())));
						return newTempo;
					}
				});
			}
		});
		textTempoLock = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Tempo Lock");
		comboTempoLock = this.createGridData2ColumnComboInput(groupGeneralInfo, "Tempo Lock", this.getLiteralStrings(TempoLock.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__TEMPO_LOCK, TempoLock.get(comboTempoLock.getSelectionIndex()), false, -1);
			}
		});
		textSongLength = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Song Length");
		comboSongLength = this.createGridData2ColumnComboInput(groupGeneralInfo, "Song Length", this.getLiteralStrings(SongLength.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__SONG_LENGTH, SongLength.get(comboSongLength.getSelectionIndex()), false, -1);
			}
		});

		textMuteHold = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Mute Hold");
		comboMuteHold = this.createGridData2ColumnComboInput(groupGeneralInfo, "Mute Hold", this.getLiteralStrings(MuteHold.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__MUTE_HOLD, MuteHold.get(comboMuteHold.getSelectionIndex()), false, -1);
			}
		});
		textNextSongNumber = this.createGridData2ColumnTextLabel(groupGeneralInfo, "Next Song Number");
		comboNextSongNumber = this.createGridData2ColumnComboInput(groupGeneralInfo, "Next Song Number", this.getLiteralStrings(NextSongNumber.values()) , new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setFeatureForSelectedItems(songs, EsxPackage.Literals.SONG__NEXT_SONG_NUMBER, NextSongNumber.get(comboNextSongNumber.getSelectionIndex()), false, -1);
			}
		});

		scrolledComposite.setContent(compositeMain);
		scrolledComposite.setMinSize(compositeMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		this.songs = new ArrayList<Song>();

		if(input instanceof List<?>) {
			Iterator<?> it = ((List<?>) input).iterator();
			while (it.hasNext()) {
				Object obj = it.next();
				if(obj instanceof Song) {
					this.songs.add((Song) obj);
				}
			}
		}

		this.refresh();
		this.refreshInputs();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refresh()
	 */
	@Override
	public void refresh() {
		String multipleValueString = "<Multiple Values>";

		this.textSelectedTotal.setText(Integer.toString(this.songs.size()));
		this.textSelectedNotEmpty.setText(Integer.toString(this.getCountInListWithValue(this.songs, EsxPackage.Literals.SONG__EMPTY, false)));
		this.textSelectedEmpty.setText(Integer.toString(this.getCountInListWithValue(this.songs, EsxPackage.Literals.SONG__EMPTY, true)));

		this.textName.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__NAME, multipleValueString));

		this.textTempo.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__TEMPO, multipleValueString, EsxPackage.Literals.TEMPO__VALUE));
		this.textTempoLock.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__TEMPO_LOCK, multipleValueString));
		this.textSongLength.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__SONG_LENGTH, multipleValueString));
		this.textMuteHold.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__MUTE_HOLD, multipleValueString));
		this.textNextSongNumber.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__NEXT_SONG_NUMBER, multipleValueString));
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxComposite#refreshInputs()
	 */
	@Override
	public void refreshInputs() {
		String multipleValueString = "";

		this.inputName.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__NAME, multipleValueString));

		this.inputTempo.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__TEMPO, multipleValueString, EsxPackage.Literals.TEMPO__VALUE));
		this.comboTempoLock.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__TEMPO_LOCK, multipleValueString));
		this.comboSongLength.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__SONG_LENGTH, multipleValueString));
		this.comboMuteHold.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__MUTE_HOLD, multipleValueString));
		this.comboNextSongNumber.setText(getMultiString(this.songs, EsxPackage.Literals.SONG__NEXT_SONG_NUMBER, multipleValueString));
	}

}
