/**
 * Copyright (c) 2009, 2012 SKRATCHDOT.COM
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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.ColorProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.SongPattern;

public class TableViewerColorProvider extends ColorProvider {
	private Color backgroundColorWhenNotEmpty;
	private Color backgroundColorWhenEmpty;
	private Color foregroundColorWhenNotEmpty;
	private Color foregroundColorWhenEmpty;

	/**
	 * @param adapterFactory
	 * @param viewer
	 * @param backgroundColorWhenNotEmpty
	 * @param backgroundColorWhenEmpty
	 * @param foregroundColorWhenNotEmpty
	 * @param foregroundColorWhenEmpty
	 */
	public TableViewerColorProvider(AdapterFactory adapterFactory, Viewer viewer,
			Color backgroundColorWhenNotEmpty,
			Color backgroundColorWhenEmpty,
			Color foregroundColorWhenNotEmpty,
			Color foregroundColorWhenEmpty) {
		super(adapterFactory, viewer);
		this.backgroundColorWhenNotEmpty = backgroundColorWhenNotEmpty;
		this.backgroundColorWhenEmpty = backgroundColorWhenEmpty;
		this.foregroundColorWhenNotEmpty = foregroundColorWhenNotEmpty;
		this.foregroundColorWhenEmpty = foregroundColorWhenEmpty;
	}

	/**
	 * @param adapterFactory
	 * @param viewer
	 * @param backgroundColorWhenNotEmpty
	 * @param backgroundColorWhenEmpty
	 * @param foregroundColorWhenNotEmpty
	 * @param foregroundColorWhenEmpty
	 */
	public TableViewerColorProvider(AdapterFactory adapterFactory, Viewer viewer,
			RGB backgroundColorWhenNotEmpty,
			RGB backgroundColorWhenEmpty,
			RGB foregroundColorWhenNotEmpty,
			RGB foregroundColorWhenEmpty) {
		super(adapterFactory, viewer);
		this.backgroundColorWhenNotEmpty = new Color(null,
				backgroundColorWhenNotEmpty);
		this.backgroundColorWhenEmpty = new Color(null,
				backgroundColorWhenEmpty);
		this.foregroundColorWhenNotEmpty = new Color(null,
				foregroundColorWhenNotEmpty);
		this.foregroundColorWhenEmpty = new Color(null,
				foregroundColorWhenEmpty);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#getBackground(java.lang.Object, int)
	 */
	@Override
	public Color getBackground(Object object, int columnIndex) {
		if (object instanceof Sample) {
			return ((Sample) object).isEmpty() ? backgroundColorWhenEmpty
					: backgroundColorWhenNotEmpty;
		} else if (object instanceof Pattern) {
			return ((Pattern) object).isEmpty() ? backgroundColorWhenEmpty
					: backgroundColorWhenNotEmpty;
		} else if (object instanceof Song) {
			return ((Song) object).isEmpty() ? backgroundColorWhenEmpty
					: backgroundColorWhenNotEmpty;
		} else if (object instanceof SongPattern) {
			return ((SongPattern) object).isEmpty() ? backgroundColorWhenEmpty
					: backgroundColorWhenNotEmpty;
		}
		return super.getBackground(object, columnIndex);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#getForeground(java.lang.Object, int)
	 */
	@Override
	public Color getForeground(Object object, int columnIndex) {
		if (object instanceof Sample) {
			return ((Sample) object).isEmpty() ? foregroundColorWhenEmpty
					: foregroundColorWhenNotEmpty;
		} else if (object instanceof Pattern) {
			return ((Pattern) object).isEmpty() ? foregroundColorWhenEmpty
					: foregroundColorWhenNotEmpty;
		} else if (object instanceof Song) {
			return ((Song) object).isEmpty() ? foregroundColorWhenEmpty
					: foregroundColorWhenNotEmpty;
		} else if (object instanceof SongPattern) {
			return ((SongPattern) object).isEmpty() ? foregroundColorWhenEmpty
					: foregroundColorWhenNotEmpty;
		}
		return super.getForeground(object, columnIndex);
	}

	/**
	 * @param backgroundColorWhenNotEmpty
	 * @param backgroundColorWhenEmpty
	 * @param foregroundColorWhenNotEmpty
	 * @param foregroundColorWhenEmpty
	 */
	public void setAllColors(
		Color backgroundColorWhenNotEmpty,
		Color backgroundColorWhenEmpty,
		Color foregroundColorWhenNotEmpty,
		Color foregroundColorWhenEmpty) {
		this.backgroundColorWhenNotEmpty = backgroundColorWhenNotEmpty;
		this.backgroundColorWhenEmpty = backgroundColorWhenEmpty;
		this.foregroundColorWhenNotEmpty = foregroundColorWhenNotEmpty;
		this.foregroundColorWhenEmpty = foregroundColorWhenEmpty;
	}
	
	/**
	 * @param backgroundColorWhenNotEmpty
	 * @param backgroundColorWhenEmpty
	 * @param foregroundColorWhenNotEmpty
	 * @param foregroundColorWhenEmpty
	 */
	public void setAllColors(
		RGB backgroundColorWhenNotEmpty,
		RGB backgroundColorWhenEmpty,
		RGB foregroundColorWhenNotEmpty,
		RGB foregroundColorWhenEmpty) {
		this.backgroundColorWhenNotEmpty = new Color(null,
				backgroundColorWhenNotEmpty);
		this.backgroundColorWhenEmpty = new Color(null,
				backgroundColorWhenEmpty);
		this.foregroundColorWhenNotEmpty = new Color(null,
				foregroundColorWhenNotEmpty);
		this.foregroundColorWhenEmpty = new Color(null,
				foregroundColorWhenEmpty);
	}

	/**
	 * @param backgroundColorWhenNotEmpty
	 */
	public void setBackgroundColorWhenNotEmpty(
			Color backgroundColorWhenNotEmpty) {
		this.backgroundColorWhenNotEmpty = backgroundColorWhenNotEmpty;
	}

	/**
	 * @param backgroundColorWhenNotEmpty
	 */
	public void setBackgroundColorWhenNotEmpty(RGB backgroundColorWhenNotEmpty) {
		this.backgroundColorWhenNotEmpty = new Color(null,
				backgroundColorWhenNotEmpty);
	}

	/**
	 * @param backgroundColorWhenEmpty
	 */
	public void setBackgroundColorWhenEmpty(Color backgroundColorWhenEmpty) {
		this.backgroundColorWhenEmpty = backgroundColorWhenEmpty;
	}

	/**
	 * @param backgroundColorWhenEmpty
	 */
	public void setBackgroundColorWhenEmpty(RGB backgroundColorWhenEmpty) {
		this.backgroundColorWhenEmpty = new Color(null,
				backgroundColorWhenEmpty);
	}

	/**
	 * @param foregroundColorWhenNotEmpty
	 */
	public void setForegroundColorWhenNotEmpty(
			Color foregroundColorWhenNotEmpty) {
		this.foregroundColorWhenNotEmpty = foregroundColorWhenNotEmpty;
	}

	/**
	 * @param foregroundColorWhenNotEmpty
	 */
	public void setForegroundColorWhenNotEmpty(RGB foregroundColorWhenNotEmpty) {
		this.foregroundColorWhenNotEmpty = new Color(null,
				foregroundColorWhenNotEmpty);
	}

	/**
	 * @param foregroundColorWhenEmpty
	 */
	public void setForegroundColorWhenEmpty(Color foregroundColorWhenEmpty) {
		this.foregroundColorWhenEmpty = foregroundColorWhenEmpty;
	}

	/**
	 * @param foregroundColorWhenEmpty
	 */
	public void setForegroundColorWhenEmpty(RGB foregroundColorWhenEmpty) {
		this.foregroundColorWhenEmpty = new Color(null,
				foregroundColorWhenEmpty);
	}

}
