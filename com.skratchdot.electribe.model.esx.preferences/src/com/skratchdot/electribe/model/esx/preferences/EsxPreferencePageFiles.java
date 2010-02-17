package com.skratchdot.electribe.model.esx.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class EsxPreferencePageFiles extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.model.esx.preferences.EsxPreferencePageFiles"; //$NON-NLS-1$

	/**
	 * Create the preference page.
	 */
	public EsxPreferencePageFiles() {
		super(FLAT);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(PlatformUI.getPreferenceStore());
		setDescription("The temp directory is used when loading/saving .esx files." +
			"\n\nThe default .esx file is the template used when creating new .esx " +
			"files. The last pattern and song in the default .esx file are used to " +
			"determine whether or not a pattern/song is empty.");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		{
			// Create the field editors
			DirectoryFieldEditor directoryFieldEditor = new DirectoryFieldEditor(EsxPreferenceNames.FILES_TEMP_DIRECTORY, "Temp Directory:", getFieldEditorParent());
			directoryFieldEditor.setEmptyStringAllowed(false);
			addField(directoryFieldEditor);
		}
		{
			FileFieldEditor fileFieldEditor = new FileFieldEditor(EsxPreferenceNames.FILES_DEFAULT_ESX_FILE, "Default .esx file:", getFieldEditorParent());
			fileFieldEditor.setEmptyStringAllowed(false);
			addField(fileFieldEditor);
		}
	}

}
