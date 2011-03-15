/**
 * Copyright (c) 2009-2011 SKRATCHDOT.COM
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

import java.io.File;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceInitializer;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;


/**
 * Customized {@link WorkbenchAdvisor} for the RCP application.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EsxEditorAdvisor extends WorkbenchAdvisor {
	/**
	 * RCP's application
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Application implements IApplication {
		/**
		 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Object start(IApplicationContext context) throws Exception {
			WorkbenchAdvisor workbenchAdvisor = new EsxEditorAdvisor();
			Display display = PlatformUI.createDisplay();
			try {
				int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
				if (returnCode == PlatformUI.RETURN_RESTART) {
					return IApplication.EXIT_RESTART;
				}
				else {
					return IApplication.EXIT_OK;
				}
			}
			finally {
				display.dispose();
			}
		}

		/**
		 * @see org.eclipse.equinox.app.IApplication#stop()
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void stop() {
			// Do nothing.
		}
	}

	/**
	 * RCP's perspective
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Perspective implements IPerspectiveFactory {
		/**
		 * Perspective ID
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final String ID_PERSPECTIVE = "com.skratchdot.electribe.model.esx.presentation.EsxEditorAdvisorPerspective";

		/**
		 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public void createInitialLayout(IPageLayout layout) {
			layout.setEditorAreaVisible(true);
			layout.addPerspectiveShortcut(ID_PERSPECTIVE);

			layout.addView("com.skratchdot.electribe.fileexplorer.views.TableView", IPageLayout.BOTTOM, 0.60f, IPageLayout.ID_EDITOR_AREA);
			layout.addView("com.skratchdot.electribe.fileexplorer.views.TreeView", IPageLayout.LEFT, 0.25f, IPageLayout.ID_EDITOR_AREA);
			//layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.RIGHT, 0.66f, IPageLayout.ID_EDITOR_AREA);
			layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.RIGHT, 0.75f, "com.skratchdot.electribe.fileexplorer.views.TableView");
		}
	}
	
	/**
	 * RCP's window advisor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class WindowAdvisor extends WorkbenchWindowAdvisor {
		/**
		 * @see WorkbenchWindowAdvisor#WorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public WindowAdvisor(IWorkbenchWindowConfigurer configurer) {
			super(configurer);
		}
		
		/**
		 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		@Override
		public void preWindowOpen() {
			IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
			configurer.setInitialSize(new Point(800, 600));
			configurer.setShowCoolBar(true);
			configurer.setShowStatusLine(true);
	        configurer.setShowProgressIndicator(true);
			configurer.setTitle(EsxEditorUtil.getString("_UI_Application_title"));
			configurer.addEditorAreaTransfer(FileTransfer.getInstance());
			configurer.configureEditorAreaDropListener(new EsxEditorDropTargetAdapter());

			// Make sure our preferences are initialized with default values
			EsxPreferenceInitializer preferenceInitializer = new EsxPreferenceInitializer();
			preferenceInitializer.initializeDefaultPreferences();
		}

		/**
		 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
			return new WindowActionBarAdvisor(configurer);
		}
	}

	/**
	 * RCP's action bar advisor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class WindowActionBarAdvisor extends ActionBarAdvisor {
		/**
		 * @see ActionBarAdvisor#ActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public WindowActionBarAdvisor(IActionBarConfigurer configurer) {
			super(configurer);
		}

		@Override
		protected void makeActions(IWorkbenchWindow window) {
			super.makeActions(window);
			register(ActionFactory.CLOSE.create(window));
			register(ActionFactory.CLOSE_ALL.create(window));
			register(ActionFactory.COPY.create(window));
			register(ActionFactory.CUT.create(window));
			register(ActionFactory.DELETE.create(window));
			register(ActionFactory.PASTE.create(window));
			register(ActionFactory.QUIT.create(window));
			register(ActionFactory.REDO.create(window));
			register(ActionFactory.SAVE.create(window));
			register(ActionFactory.SAVE_ALL.create(window));
			register(ActionFactory.SAVE_AS.create(window));
			// For some reason when SELECT_ALL is registered, it stops working
			//register(ActionFactory.SELECT_ALL.create(window));
			register(ActionFactory.UNDO.create(window));
		}
	
	}
	
	/**
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId()
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public String getInitialWindowPerspectiveId() {
		return Perspective.ID_PERSPECTIVE;
	}

	/**
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui.application.IWorkbenchConfigurer)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
	}

	/**
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#createWorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new WindowAdvisor(configurer);
	}

	/**
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#postShutdown()
	 * <!-- begin-user-doc -->
	 * After shutting down, we try to clear out the "temp" folder.
	 * <!-- end-user-doc -->
	 */
		@Override
	public void postShutdown() {
		super.postShutdown();

		// Attempt to clear up space in the temp folder
		String tempDirectoryString = EsxPreferenceStore.getString(
				EsxPreferenceNames.FILES_TEMP_DIRECTORY);
		File tempDirectory = new File(tempDirectoryString);
		EsxEditorUtil.clearTempDirectory(tempDirectory);
	}

}
