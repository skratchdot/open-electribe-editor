package com.skratchdot.electribe.model.esx.presentation;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class EsxTabSelectionListener implements SelectionListener {

	private void esxTabSelected(SelectionEvent e) {
		if(e.widget instanceof TabFolder) {
			TabFolder tabFolder = (TabFolder) e.widget;

			int selectedIndex = tabFolder.getSelectionIndex();
			
			// Loop through each EsxComposite, setting isActive to false
			// everywhere except for the currently selected tab 
			// which will have it's isActive flag set to true
			for(int i=0; i<tabFolder.getItemCount(); i++) {
				TabItem currentTab = tabFolder.getItem(i);
				Control currentControl = currentTab.getControl();
				if(currentControl instanceof EsxComposite) {
					EsxComposite currentEsxComposite = (EsxComposite) currentControl;
					if(selectedIndex==i) {
						currentEsxComposite.isActive = true;
					}
					else {
						currentEsxComposite.isActive = false;
					}
				}
			}
			
			onTabChange();
		}
	}

	public void widgetSelected(SelectionEvent e) {
		esxTabSelected(e);
	}

	public void widgetDefaultSelected(SelectionEvent e) {
		esxTabSelected(e);
	}
	
	public void onTabChange() {
		// Can be implemented when creating an instance of this class
	}

}
