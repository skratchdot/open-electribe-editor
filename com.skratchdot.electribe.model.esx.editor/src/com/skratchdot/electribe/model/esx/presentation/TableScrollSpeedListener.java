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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class TableScrollSpeedListener implements Listener {
	private final Display display;
	private final Table table;
	private final Runnable heartbeat;
	private boolean tracking;
	private int scrollSpeed = 40; // In milliseconds

	/**
	 * @param table
	 */
	public TableScrollSpeedListener(Table table) {
		super();
		this.display = null;
		this.table = table;
		this.heartbeat = initHeartbeat();
	}

	/**
	 * @param table
	 * @param scrollSpeed
	 */
	public TableScrollSpeedListener(Table table, int scrollSpeed) {
		super();
		this.display = table.getDisplay();
		this.table = table;
		this.heartbeat = initHeartbeat();
		this.scrollSpeed = scrollSpeed;
	}

	/**
	 * @return
	 */
	private Runnable initHeartbeat() {
		return new Runnable() {
			public void run() {
				if (!tracking || table.isDisposed() || !table.getDragDetect()) return;				
				Point cursor = display.getCursorLocation();
				cursor = display.map(null, table, cursor);
				Scroll(table, cursor.x, cursor.y);
				display.timerExec(scrollSpeed, heartbeat);
			}
		};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	public void handleEvent(Event event) {
		switch (event.type) {
		case SWT.MouseDown:
			tracking = true;
			display.timerExec(0, heartbeat);
			break;
		case SWT.MouseUp:
		case SWT.MouseExit:
			if(tracking) table.redraw();
			tracking = false;
			break;
		}
	}

	/**
	 * @param table
	 * @param x
	 * @param y
	 */
	static void Scroll(Table table, int x, int y) {
		TableItem item = table.getItem(new Point(x, y));
		if (item == null) return;
		Rectangle area = table.getClientArea();
		int headerHeight = table.getHeaderHeight();
		int itemHeight= table.getItemHeight();
		TableItem nextItem = null;
		if (y < area.y + headerHeight + 2 * itemHeight) {
			nextItem = PreviousItem(table, item);
		}
		if (y > area.y + area.height - 2 * itemHeight) {
			nextItem = NextItem(table, item);
		}
		if (nextItem != null) table.showItem(nextItem);
	}

	/**
	 * @param table
	 * @param item
	 * @return
	 */
	static TableItem PreviousItem(Table table, TableItem item) {
		if (item == null) return null;
		int previousIndex = table.indexOf(item)-1;
		if(previousIndex>=0) {
			return table.getItem(previousIndex);
		}
		else {
			return item;
		}
	}

	/**
	 * @param table
	 * @param item
	 * @return
	 */
	static TableItem NextItem(Table table, TableItem item) {
		if (item == null) return null;
		int nextIndex = table.indexOf(item)+1;
		if(nextIndex<table.getItemCount()) {
			return table.getItem(nextIndex);
		}
		else {
			return item;
		}
	}	

}
