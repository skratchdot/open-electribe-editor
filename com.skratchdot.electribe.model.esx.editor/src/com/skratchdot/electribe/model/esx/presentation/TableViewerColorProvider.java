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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider.ColorProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import com.skratchdot.electribe.model.esx.Pattern;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.Song;

public class TableViewerColorProvider extends ColorProvider {
	private Color backgroundColorWhenBeingUsed;
	private Color backgroundColorWhenNotInUse;
	private Color foregroundColorWhenBeingUsed;
	private Color foregroundColorWhenNotInUse;

	/**
	 * @param adapterFactory
	 * @param viewer
	 * @param backgroundColorWhenBeingUsed
	 * @param backgroundColorWhenNotInUse
	 * @param foregroundColorWhenBeingUsed
	 * @param foregroundColorWhenNotInUse
	 */
	public TableViewerColorProvider(AdapterFactory adapterFactory, Viewer viewer,
			Color backgroundColorWhenBeingUsed,
			Color backgroundColorWhenNotInUse,
			Color foregroundColorWhenBeingUsed,
			Color foregroundColorWhenNotInUse) {
		super(adapterFactory, viewer);
		this.backgroundColorWhenBeingUsed = backgroundColorWhenBeingUsed;
		this.backgroundColorWhenNotInUse = backgroundColorWhenNotInUse;
		this.foregroundColorWhenBeingUsed = foregroundColorWhenBeingUsed;
		this.foregroundColorWhenNotInUse = foregroundColorWhenNotInUse;
	}

	/**
	 * @param adapterFactory
	 * @param viewer
	 * @param backgroundColorWhenBeingUsed
	 * @param backgroundColorWhenNotInUse
	 * @param foregroundColorWhenBeingUsed
	 * @param foregroundColorWhenNotInUse
	 */
	public TableViewerColorProvider(AdapterFactory adapterFactory, Viewer viewer,
			RGB backgroundColorWhenBeingUsed,
			RGB backgroundColorWhenNotInUse,
			RGB foregroundColorWhenBeingUsed,
			RGB foregroundColorWhenNotInUse) {
		super(adapterFactory, viewer);
		this.backgroundColorWhenBeingUsed = new Color(null,
				backgroundColorWhenBeingUsed);
		this.backgroundColorWhenNotInUse = new Color(null,
				backgroundColorWhenNotInUse);
		this.foregroundColorWhenBeingUsed = new Color(null,
				foregroundColorWhenBeingUsed);
		this.foregroundColorWhenNotInUse = new Color(null,
				foregroundColorWhenNotInUse);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#getBackground(java.lang.Object, int)
	 */
	@Override
	public Color getBackground(Object object, int columnIndex) {
		if (object instanceof Sample) {
			return ((Sample) object).isBeingUsed() ? backgroundColorWhenBeingUsed
					: backgroundColorWhenNotInUse;
		} else if (object instanceof Pattern) {
			return ((Pattern) object).isBeingUsed() ? backgroundColorWhenBeingUsed
					: backgroundColorWhenNotInUse;
		} else if (object instanceof Song) {
			return ((Song) object).isBeingUsed() ? backgroundColorWhenBeingUsed
					: backgroundColorWhenNotInUse;
		}
		return super.getBackground(object, columnIndex);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#getForeground(java.lang.Object, int)
	 */
	@Override
	public Color getForeground(Object object, int columnIndex) {
		if (object instanceof Sample) {
			return ((Sample) object).isBeingUsed() ? foregroundColorWhenBeingUsed
					: foregroundColorWhenNotInUse;
		} else if (object instanceof Pattern) {
			return ((Pattern) object).isBeingUsed() ? foregroundColorWhenBeingUsed
					: foregroundColorWhenNotInUse;
		} else if (object instanceof Song) {
			return ((Song) object).isBeingUsed() ? foregroundColorWhenBeingUsed
					: foregroundColorWhenNotInUse;
		}
		return super.getForeground(object, columnIndex);
	}

	/**
	 * @param backgroundColorWhenBeingUsed
	 * @param backgroundColorWhenNotInUse
	 * @param foregroundColorWhenBeingUsed
	 * @param foregroundColorWhenNotInUse
	 */
	public void setAllColors(
		Color backgroundColorWhenBeingUsed,
		Color backgroundColorWhenNotInUse,
		Color foregroundColorWhenBeingUsed,
		Color foregroundColorWhenNotInUse) {
		this.backgroundColorWhenBeingUsed = backgroundColorWhenBeingUsed;
		this.backgroundColorWhenNotInUse = backgroundColorWhenNotInUse;
		this.foregroundColorWhenBeingUsed = foregroundColorWhenBeingUsed;
		this.foregroundColorWhenNotInUse = foregroundColorWhenNotInUse;
	}
	
	/**
	 * @param backgroundColorWhenBeingUsed
	 * @param backgroundColorWhenNotInUse
	 * @param foregroundColorWhenBeingUsed
	 * @param foregroundColorWhenNotInUse
	 */
	public void setAllColors(
		RGB backgroundColorWhenBeingUsed,
		RGB backgroundColorWhenNotInUse,
		RGB foregroundColorWhenBeingUsed,
		RGB foregroundColorWhenNotInUse) {
		this.backgroundColorWhenBeingUsed = new Color(null,
				backgroundColorWhenBeingUsed);
		this.backgroundColorWhenNotInUse = new Color(null,
				backgroundColorWhenNotInUse);
		this.foregroundColorWhenBeingUsed = new Color(null,
				foregroundColorWhenBeingUsed);
		this.foregroundColorWhenNotInUse = new Color(null,
				foregroundColorWhenNotInUse);
	}

	/**
	 * @param backgroundColorWhenBeingUsed
	 */
	public void setBackgroundColorWhenBeingUsed(
			Color backgroundColorWhenBeingUsed) {
		this.backgroundColorWhenBeingUsed = backgroundColorWhenBeingUsed;
	}

	/**
	 * @param backgroundColorWhenBeingUsed
	 */
	public void setBackgroundColorWhenBeingUsed(RGB backgroundColorWhenBeingUsed) {
		this.backgroundColorWhenBeingUsed = new Color(null,
				backgroundColorWhenBeingUsed);
	}

	/**
	 * @param backgroundColorWhenNotInUse
	 */
	public void setBackgroundColorWhenNotInUse(Color backgroundColorWhenNotInUse) {
		this.backgroundColorWhenNotInUse = backgroundColorWhenNotInUse;
	}

	/**
	 * @param backgroundColorWhenNotInUse
	 */
	public void setBackgroundColorWhenNotInUse(RGB backgroundColorWhenNotInUse) {
		this.backgroundColorWhenNotInUse = new Color(null,
				backgroundColorWhenNotInUse);
	}

	/**
	 * @param foregroundColorWhenBeingUsed
	 */
	public void setForegroundColorWhenBeingUsed(
			Color foregroundColorWhenBeingUsed) {
		this.foregroundColorWhenBeingUsed = foregroundColorWhenBeingUsed;
	}

	/**
	 * @param foregroundColorWhenBeingUsed
	 */
	public void setForegroundColorWhenBeingUsed(RGB foregroundColorWhenBeingUsed) {
		this.foregroundColorWhenBeingUsed = new Color(null,
				foregroundColorWhenBeingUsed);
	}

	/**
	 * @param foregroundColorWhenNotInUse
	 */
	public void setForegroundColorWhenNotInUse(Color foregroundColorWhenNotInUse) {
		this.foregroundColorWhenNotInUse = foregroundColorWhenNotInUse;
	}

	/**
	 * @param foregroundColorWhenNotInUse
	 */
	public void setForegroundColorWhenNotInUse(RGB foregroundColorWhenNotInUse) {
		this.foregroundColorWhenNotInUse = new Color(null,
				foregroundColorWhenNotInUse);
	}

}
