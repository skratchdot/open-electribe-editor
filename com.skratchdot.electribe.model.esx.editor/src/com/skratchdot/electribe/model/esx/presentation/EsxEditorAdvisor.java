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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import net.javazoom.jlayer.skratchdot.AudioUtil;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.util.EditUIUtil;

import com.skratchdot.electribe.model.esx.preferences.EsxEditorPreferenceInitializer;
import com.skratchdot.electribe.model.esx.presentation.EsxEditorPlugin;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.util.EsxException;
import com.skratchdot.electribe.model.esx.util.EsxUtil;


/**
 * Customized {@link WorkbenchAdvisor} for the RCP application.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EsxEditorAdvisor extends WorkbenchAdvisor {
	/**
	 * The default file extension filters for use in dialogs.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final String[] FILE_EXTENSION_FILTERS = EsxEditor.FILE_EXTENSION_FILTERS.toArray(new String[0]); 

	/**
	 * The default audio file extension filters for use in dialogs.
	 */
	private static final String[] AUDIO_FILE_EXTENSION_FILTERS = EsxEditor.AUDIO_FILE_EXTENSION_FILTERS.toArray(new String[0]); 

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key) {
		return EsxEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return com.skratchdot.electribe.model.esx.presentation.EsxEditorPlugin.INSTANCE.getString(key, new Object [] { s1 });
	}

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
			layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.RIGHT, 0.66f, IPageLayout.ID_EDITOR_AREA);
			layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.RIGHT, 0.75f, "com.skratchdot.electribe.fileexplorer.views.TableView");
		}

		/**
		 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createInitialLayoutGen(IPageLayout layout) {
			layout.setEditorAreaVisible(true);
			layout.addPerspectiveShortcut(ID_PERSPECTIVE);

			IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float)0.66, layout.getEditorArea());
			right.addView(IPageLayout.ID_OUTLINE);

			IFolderLayout bottonRight = layout.createFolder("bottonRight", IPageLayout.BOTTOM, (float)0.60, "right");
			bottonRight.addView(IPageLayout.ID_PROP_SHEET);
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
			configurer.setTitle(getString("_UI_Application_title"));
			configurer.addEditorAreaTransfer(FileTransfer.getInstance());
			configurer.configureEditorAreaDropListener(new EsxEditorDropTargetAdapter());

			// Make sure our preferences are initialized with default values
			EsxEditorPreferenceInitializer preferenceInitializer = new EsxEditorPreferenceInitializer();
			preferenceInitializer.initializeDefaultPreferences();
		}

		/**
		 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void preWindowOpenGen() {
			IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
			configurer.setInitialSize(new Point(600, 450));
			configurer.setShowCoolBar(false);
			configurer.setShowStatusLine(true);
			configurer.setTitle(getString("_UI_Application_title"));
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
		
		/**
		 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected void fillMenuBar(IMenuManager menuBar) {
			IWorkbenchWindow window = getActionBarConfigurer().getWindowConfigurer().getWindow();
			menuBar.add(createFileMenu(window));
			menuBar.add(createEditMenu(window));
			menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menuBar.add(createWindowMenu(window));
			menuBar.add(createHelpMenu(window));					
		}
		
		/**
		 * Creates the 'File' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected IMenuManager createFileMenu(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_File_label"),
			IWorkbenchActionConstants.M_FILE);    
			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
	
			IMenuManager newMenu = new MenuManager(getString("_UI_Menu_New_label"), "new");
			newMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));	
			menu.add(newMenu);
			menu.add(new Separator());

			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(new Separator());

			IMenuManager importMenu = new MenuManager(getString("_UI_Menu_Import_label"), "import");
			importMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));	
			menu.add(importMenu);
			menu.add(new Separator());

			addToMenuAndRegister(menu, ActionFactory.CLOSE.create(window));
			addToMenuAndRegister(menu, ActionFactory.CLOSE_ALL.create(window));
			menu.add(new Separator());

			addToMenuAndRegister(menu, ActionFactory.SAVE.create(window));
			addToMenuAndRegister(menu, ActionFactory.SAVE_AS.create(window));
			addToMenuAndRegister(menu, ActionFactory.SAVE_ALL.create(window));
			menu.add(new Separator());

			addToMenuAndRegister(menu, ActionFactory.QUIT.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
			return menu;
		}

		/**
		 * Creates the 'File' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected IMenuManager createFileMenuGen(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_File_label"),
			IWorkbenchActionConstants.M_FILE);    
			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
	
			IMenuManager newMenu = new MenuManager(getString("_UI_Menu_New_label"), "new");
			newMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
	
			menu.add(newMenu);
			menu.add(new Separator());
			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(new Separator());
			addToMenuAndRegister(menu, ActionFactory.CLOSE.create(window));
			addToMenuAndRegister(menu, ActionFactory.CLOSE_ALL.create(window));
			menu.add(new Separator());
			addToMenuAndRegister(menu, ActionFactory.SAVE.create(window));
			addToMenuAndRegister(menu, ActionFactory.SAVE_AS.create(window));
			addToMenuAndRegister(menu, ActionFactory.SAVE_ALL.create(window));
			menu.add(new Separator());
			addToMenuAndRegister(menu, ActionFactory.QUIT.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
			return menu;
		}

		/**
		 * Creates the 'Edit' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected IMenuManager createEditMenu(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_Edit_label"),
			IWorkbenchActionConstants.M_EDIT);
			menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));
	
			addToMenuAndRegister(menu, ActionFactory.UNDO.create(window));
			addToMenuAndRegister(menu, ActionFactory.REDO.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
			menu.add(new Separator());
	
			addToMenuAndRegister(menu, ActionFactory.CUT.create(window));
			addToMenuAndRegister(menu, ActionFactory.COPY.create(window));
			addToMenuAndRegister(menu, ActionFactory.PASTE.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
			menu.add(new Separator());
	
			addToMenuAndRegister(menu, ActionFactory.DELETE.create(window));
			addToMenuAndRegister(menu, ActionFactory.SELECT_ALL.create(window));
			menu.add(new Separator());
	
			menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));
	
			menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
			menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
			return menu;
		}
	
		/**
		 * Creates the 'Window' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected IMenuManager createWindowMenu(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_Window_label"),
					IWorkbenchActionConstants.M_WINDOW);

			IMenuManager showView = new MenuManager(getString("_UI_Menu_Window_ShowView_label"),
				"showView");
			menu.add(showView);
			menu.add(ActionFactory.PREFERENCES.create(window));

			/*
			addToMenuAndRegister(menu, ActionFactory.OPEN_NEW_WINDOW.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(ContributionItemFactory.OPEN_WINDOWS.create(window));
			*/
			
			return menu;
		}

		/**
		 * Creates the 'Window' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected IMenuManager createWindowMenuGen(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_Window_label"),
			IWorkbenchActionConstants.M_WINDOW);
	
			addToMenuAndRegister(menu, ActionFactory.OPEN_NEW_WINDOW.create(window));
			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(ContributionItemFactory.OPEN_WINDOWS.create(window));
	
			return menu;
		}

		/**
		 * Creates the 'Help' menu.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected IMenuManager createHelpMenu(IWorkbenchWindow window) {
			IMenuManager menu = new MenuManager(getString("_UI_Menu_Help_label"), IWorkbenchActionConstants.M_HELP);
			// Welcome or intro page would go here
			// Help contents would go here
			// Tips and tricks page would go here
			menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
			menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
			return menu;
		}
		
		/**
		 * Adds the specified action to the given menu and also registers the action with the
		 * action bar configurer, in order to activate its key binding.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected void addToMenuAndRegister(IMenuManager menuManager, IAction action) {
			menuManager.add(action);
			getActionBarConfigurer().registerGlobalAction(action);
		}
	}
	
	/**
	 * About action for the RCP application.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class AboutAction extends WorkbenchWindowActionDelegate {
		/**
		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void run(IAction action) {
			MessageDialog.openInformation(getWindow().getShell(), getString("_UI_About_title"),
			getString("_UI_About_text"));
		}
	}

	/**
	 * Open action for the objects from the Esx model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class OpenAction extends WorkbenchWindowActionDelegate {
		/**
		 * Opens the editors for the files selected using the file dialog.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void run(IAction action) {
			String[] filePaths = openFilePathDialog(getWindow().getShell(), SWT.OPEN, null);
			if (filePaths.length > 0) {
				openEditor(getWindow().getWorkbench(), URI.createFileURI(filePaths[0]));
			}
		}
	}

	/**
	 * Open URI action for the objects from the Esx model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class OpenURIAction extends WorkbenchWindowActionDelegate {
		/**
		 * Opens the editors for the files selected using the LoadResourceDialog.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void run(IAction action) {
			LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(getWindow().getShell());
			if (Window.OK == loadResourceDialog.open()) {
				for (URI uri : loadResourceDialog.getURIs()) {
					openEditor(getWindow().getWorkbench(), uri);
				}
			}
		}
	}

	/**
	 * New file action for the RCP application.
	 * This will pop open a "Save" dialog, allowing a user to select a path
	 * in which a copy of "default.esx" will be saved.
	 */
	public static class NewAction extends WorkbenchWindowActionDelegate {
		public void run(IAction action) {
			try {
				String[] filePaths = openFilePathDialog(getWindow().getShell(), SWT.SAVE, null);
				if (filePaths.length > 0) {
					URI newDefaultURI = EsxUtil.createNewDefaultURI(filePaths[0]);
					openEditor(getWindow().getWorkbench(), newDefaultURI);
				}
			} catch (IOException e) {
				MessageDialog.openError(
					getWindow().getShell(),
					getString("_UI_NewActionError_label"),
					e.getMessage()
				);
			}
		}
	}

	/**
	 * Import audio files action for the RCP application.
	 * This will pop open a "Load" dialog, allowing a user to select 
	 * multiple files which will be loaded into the esx workspace if there
	 * are available/unused sample slots.
	 */
	public static class ImportAudioFileAction extends WorkbenchWindowActionDelegate {
		public void run(IAction action) {
			String[] filePaths = openFilePathDialog(getWindow().getShell(), SWT.OPEN | SWT.MULTI, AUDIO_FILE_EXTENSION_FILTERS);
			importAudioFiles(getWindow().getWorkbench(), filePaths);
		}
	}

	/**
	 * Attempts to add audio files specified by filePaths to the esx editor
	 * workspace.  It will only load files if there are empty/unused sample
	 * slots.
	 */
	public static void importAudioFiles(IWorkbench workbench, String[] filePaths) {
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		
		// We've chosen to load a few audio files into the active editor
		if(filePaths.length>0) {
			// If the active editor is an EsxEditor
			if(editor!=null && editor instanceof EsxEditor) {
				
				// Get our EsxFile
				EditingDomain editingDomain = ((EsxEditor) editor).getEditingDomain();
				Resource resource =
					(Resource)editingDomain.getResourceSet().getResources().get(0);
				Object rootObject = resource.getContents().get(0);
				if(rootObject instanceof EsxFile) {
					EsxFile esxFile = (EsxFile) rootObject;
					
					// Since we are using a CompoundCommand, we need to remember
					// which SampleNumbers to ignore when we call the findFirstUnusedSample()
					ArrayList<Integer> skipSampleNumbers = new ArrayList<Integer>();

					CompoundCommand cmd = new CompoundCommand();

					// Now we can loop through our selected
					// Audio Files, trying to import them
					for(int i=0; i<filePaths.length; i++) {
						try {
							File file = new File(filePaths[i]);

							// We can only import audio files
							if(AudioUtil.isAudioFile(file)) {
								int firstUnusedSampleNumber = -1;
								Sample sample;

								if(!AudioUtil.isStereo(file)) {
									firstUnusedSampleNumber = esxFile.findFirstUnusedSample(true, true, 0, skipSampleNumbers);
									sample = EsxFactory.eINSTANCE.createSampleMonoFromAudioFile(file);
									sample.setSampleNumberOriginal(esxFile.getSamples().get(firstUnusedSampleNumber).getSampleNumberOriginal());
								}
								else {
									firstUnusedSampleNumber = esxFile.findFirstUnusedSample(true, true, EsxUtil.NUM_SAMPLES_MONO, skipSampleNumbers);
									sample = EsxFactory.eINSTANCE.createSampleStereoFromAudioFile(file);
									sample.setSampleNumberOriginal(esxFile.getSamples().get(firstUnusedSampleNumber).getSampleNumberOriginal());
								}

								if(firstUnusedSampleNumber>=0 && firstUnusedSampleNumber<EsxUtil.NUM_SAMPLES) {
									skipSampleNumbers.add(firstUnusedSampleNumber);
									cmd.append(new ReplaceCommand(
										editingDomain,
										esxFile,
										EsxPackage.eINSTANCE.getEsxFile_Samples(),
										esxFile.getSamples().get(firstUnusedSampleNumber),
										sample
									));
								}
							}
						} catch (EsxException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

					// We've finished looping through our fileList adding ReplaceCommands
					// to our CompoundCommand.  Now we can execute our CompoundCommand.
					if(cmd.canExecute()) {
						editingDomain.getCommandStack().execute(cmd);
					}
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters) {
		return openFilePathDialog(shell, style, fileExtensionFilters, (style & SWT.OPEN) != 0, (style & SWT.OPEN) != 0, (style & SWT.SAVE) != 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters, boolean includeGroupFilter, boolean includeAllFilter, boolean addExtension) {
		FileDialog fileDialog = new FileDialog(shell, style);
		if (fileExtensionFilters == null) {
			fileExtensionFilters = FILE_EXTENSION_FILTERS;
		}
		
		// If requested, augment the file extension filters by adding a group of all the other filters (*.ext1;*.ext2;...)
		// at the beginning and/or an all files wildcard (*.*) at the end.
		//
		includeGroupFilter &= fileExtensionFilters.length > 1;
		int offset = includeGroupFilter ? 1 : 0;
		
		if (includeGroupFilter || includeAllFilter) {
			int size = fileExtensionFilters.length + offset + (includeAllFilter ? 1 : 0);
			String[] allFilters = new String[size];
			StringBuilder group = includeGroupFilter ? new StringBuilder() : null;
			
			for (int i = 0; i < fileExtensionFilters.length; i++) {
				if (includeGroupFilter) {
					if (i != 0) {
						group.append(';');
					}
					group.append(fileExtensionFilters[i]);
				}
				allFilters[i + offset] = fileExtensionFilters[i];
			}
			
			if (includeGroupFilter) {
				allFilters[0] = group.toString();
			}
			if (includeAllFilter) {
				allFilters[allFilters.length - 1] = "*.*";
			}
			
			fileDialog.setFilterExtensions(allFilters);
		}
		else {
			fileDialog.setFilterExtensions(fileExtensionFilters);
		}
		fileDialog.open();
		
		String[] filenames = fileDialog.getFileNames();
		String[] result = new String[filenames.length];
		String path = fileDialog.getFilterPath() + File.separator;
		String extension = null;
		
		// If extension adding requested, get the dotted extension corresponding to the selected filter.
		//
		if (addExtension) {
			int i = fileDialog.getFilterIndex();
			if (i != -1 && (!includeAllFilter || i != fileExtensionFilters.length)) {
				i = includeGroupFilter && i == 0 ? 0 : i - offset;
				String filter = fileExtensionFilters[i];
				int dot = filter.lastIndexOf('.');
				if (dot == 1 && filter.charAt(0) == '*') {
					extension = filter.substring(dot);
				}
			}
		}
		
		// Build the result by adding the selected path and, if needed, auto-appending the extension.
		//
		for (int i = 0; i < filenames.length; i++) {
			String filename = path + filenames[i];
			if (extension != null) {
				int dot = filename.lastIndexOf('.');
				if (dot == -1 || !Arrays.asList(fileExtensionFilters).contains("*" + filename.substring(dot))) {
					filename += extension;
				}
			}
			result[i] = filename;
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean openEditor(IWorkbench workbench, URI uri) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(
				workbenchWindow.getShell(),
				getString("_UI_Error_title"),
				getString("_WARN_No_Editor", uri.lastSegment()));
			return false;
		}
		else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(
					workbenchWindow.getShell(),
					getString("_UI_OpenEditorError_label"),
					exception.getMessage());
				return false;
			}
		}
		return true;
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
		EsxUtil.clearTempFolder();
	}

}
