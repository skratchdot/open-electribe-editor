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
package com.skratchdot.electribe.model.esx.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Sample;
import com.skratchdot.electribe.model.esx.SampleMono;
import com.skratchdot.electribe.model.esx.SampleStereo;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.EsxFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EsxFileItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxFileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOriginalNonAudioDataPropertyDescriptor(object);
			addMemUsedInBytesPropertyDescriptor(object);
			addMemFreeInBytesPropertyDescriptor(object);
			addNumPatternsUsedPropertyDescriptor(object);
			addNumSamplesUsedPropertyDescriptor(object);
			addNumSamplesMonoUsedPropertyDescriptor(object);
			addNumSamplesStereoUsedPropertyDescriptor(object);
			addNumSongsUsedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Original Non Audio Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalNonAudioDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_originalNonAudioData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_originalNonAudioData_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__ORIGINAL_NON_AUDIO_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mem Used In Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemUsedInBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_memUsedInBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_memUsedInBytes_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__MEM_USED_IN_BYTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mem Free In Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemFreeInBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_memFreeInBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_memFreeInBytes_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__MEM_FREE_IN_BYTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Patterns Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumPatternsUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_numPatternsUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_numPatternsUsed_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__NUM_PATTERNS_USED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Samples Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumSamplesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_numSamplesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_numSamplesUsed_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_USED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Samples Mono Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumSamplesMonoUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_numSamplesMonoUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_numSamplesMonoUsed_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_MONO_USED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Samples Stereo Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumSamplesStereoUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_numSamplesStereoUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_numSamplesStereoUsed_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__NUM_SAMPLES_STEREO_USED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Songs Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumSongsUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EsxFile_numSongsUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EsxFile_numSongsUsed_feature", "_UI_EsxFile_type"),
				 EsxPackage.Literals.ESX_FILE__NUM_SONGS_USED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__GLOBAL_PARAMETERS);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__PATTERNS);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__SONGS);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__SAMPLES);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__BLANK_PATTERN);
			childrenFeatures.add(EsxPackage.Literals.ESX_FILE__BLANK_SONG);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EsxFile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EsxFile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		byte[] labelValue = ((EsxFile)object).getOriginalNonAudioData();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EsxFile_type") :
			getString("_UI_EsxFile_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EsxFile.class)) {
			case EsxPackage.ESX_FILE__ORIGINAL_NON_AUDIO_DATA:
			case EsxPackage.ESX_FILE__MEM_USED_IN_BYTES:
			case EsxPackage.ESX_FILE__MEM_FREE_IN_BYTES:
			case EsxPackage.ESX_FILE__NUM_PATTERNS_USED:
			case EsxPackage.ESX_FILE__NUM_SAMPLES_USED:
			case EsxPackage.ESX_FILE__NUM_SAMPLES_MONO_USED:
			case EsxPackage.ESX_FILE__NUM_SAMPLES_STEREO_USED:
			case EsxPackage.ESX_FILE__NUM_SONGS_USED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsxPackage.ESX_FILE__GLOBAL_PARAMETERS:
			case EsxPackage.ESX_FILE__PATTERNS:
			case EsxPackage.ESX_FILE__SONGS:
			case EsxPackage.ESX_FILE__SAMPLES:
			case EsxPackage.ESX_FILE__BLANK_PATTERN:
			case EsxPackage.ESX_FILE__BLANK_SONG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EsxEditPlugin.INSTANCE;
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {

		// Replace with blank samples
		if(feature == EsxPackage.Literals.ESX_FILE__SAMPLES && collection.size()>0) {
			return this.createRemoveSampleCommand(domain, owner, feature, collection);
		}
		// Replace with blank patterns
		else if(feature == EsxPackage.Literals.ESX_FILE__PATTERNS && collection.size()>0) {
			return UnexecutableCommand.INSTANCE;
		}
		// Replace with blank songs
		else if(feature == EsxPackage.Literals.ESX_FILE__SONGS && collection.size()>0) {
			return UnexecutableCommand.INSTANCE;
		}
		// Do nothing
		else {
			return UnexecutableCommand.INSTANCE;
		}
	}

	protected Command createRemoveSampleCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if(feature == EsxPackage.Literals.ESX_FILE__SAMPLES && collection.size()>0) {
			Sample blankSample;
			ArrayList<Sample> blankSamples;
			Object[] removedSamples = (Object[]) collection.toArray();
			CompoundCommand cmd = new CompoundCommand();

			// Loop through our list creating blank samples, and setting the correct
			// original sample number
			for(int i=0; i<removedSamples.length; i++) {
				// Prepare blankSample in this loop
				blankSample = null;

				// Create the blankSample and make sure it has the correct Original Number
				if(removedSamples[i] instanceof SampleMono) {
					blankSample = EsxFactory.eINSTANCE.createSampleMono();
					blankSample.setSampleNumberOriginal(((SampleMono) removedSamples[i]).getSampleNumberOriginal());
				}
				else if(removedSamples[i] instanceof SampleStereo) {
					blankSample = EsxFactory.eINSTANCE.createSampleStereo();
					blankSample.setSampleNumberOriginal(((SampleStereo) removedSamples[i]).getSampleNumberOriginal());
				}

				// We can create a replace command
				if(blankSample!=null) {
					// Create a temp collection that contains one blankSample
					blankSamples = new ArrayList<Sample>();
					blankSamples.add(blankSample);
					cmd.append(super.createReplaceCommand(domain, owner, feature, (Sample) removedSamples[i], blankSamples));
				}
			}
			
			return cmd;
		}
		else {
			return UnexecutableCommand.INSTANCE;
		}
	}
	
}
