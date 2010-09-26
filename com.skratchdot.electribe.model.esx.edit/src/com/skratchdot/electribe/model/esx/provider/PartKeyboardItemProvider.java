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


import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartKeyboard;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.PartKeyboard} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartKeyboardItemProvider
	extends PartItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartKeyboardItemProvider(AdapterFactory adapterFactory) {
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

			addAmpEgPropertyDescriptor(object);
			addBpmSyncPropertyDescriptor(object);
			addCutoffPropertyDescriptor(object);
			addEgIntensityPropertyDescriptor(object);
			addEgTimePropertyDescriptor(object);
			addFilterTypePropertyDescriptor(object);
			addFxSelectPropertyDescriptor(object);
			addFxSendPropertyDescriptor(object);
			addModDepthPropertyDescriptor(object);
			addModDestPropertyDescriptor(object);
			addModSpeedPropertyDescriptor(object);
			addModTypePropertyDescriptor(object);
			addPanPropertyDescriptor(object);
			addReservedBitAfterModDepthPropertyDescriptor(object);
			addResonancePropertyDescriptor(object);
			addRollPropertyDescriptor(object);
			addReversePropertyDescriptor(object);
			addSampleLabelPropertyDescriptor(object);
			addSamplePointerPropertyDescriptor(object);
			addStartPointPropertyDescriptor(object);
			addReservedBitsAfterReversePropertyDescriptor(object);
			addReservedBytePropertyDescriptor(object);
			addSliceNumberPropertyDescriptor(object);
			addGlidePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Amp Eg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmpEgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_ampEg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_ampEg_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__AMP_EG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bpm Sync feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBpmSyncPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_bpmSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_bpmSync_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__BPM_SYNC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cutoff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCutoffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_cutoff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_cutoff_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__CUTOFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eg Intensity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEgIntensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_egIntensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_egIntensity_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__EG_INTENSITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eg Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEgTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_egTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_egTime_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__EG_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_filterType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_filterType_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__FILTER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fx Select feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFxSelectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_fxSelect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_fxSelect_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__FX_SELECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fx Send feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFxSendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_fxSend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_fxSend_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__FX_SEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mod Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_modDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_modDepth_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__MOD_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mod Dest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModDestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_modDest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_modDest_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__MOD_DEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mod Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_modSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_modSpeed_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__MOD_SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mod Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_modType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_modType_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__MOD_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_pan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_pan_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__PAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reserved Bit After Mod Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedBitAfterModDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_reservedBitAfterModDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_reservedBitAfterModDepth_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resonance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResonancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_resonance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_resonance_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__RESONANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roll feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithCommon_roll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithCommon_roll_feature", "_UI_PartWithCommon_type"),
				 EsxPackage.Literals.PART_WITH_COMMON__ROLL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSample_reverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSample_reverse_feature", "_UI_PartWithSample_type"),
				 EsxPackage.Literals.PART_WITH_SAMPLE__REVERSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sample Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSampleLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSample_sampleLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSample_sampleLabel_feature", "_UI_PartWithSample_type"),
				 EsxPackage.Literals.PART_WITH_SAMPLE__SAMPLE_LABEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sample Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplePointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSample_samplePointer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSample_samplePointer_feature", "_UI_PartWithSample_type"),
				 EsxPackage.Literals.PART_WITH_SAMPLE__SAMPLE_POINTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSample_startPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSample_startPoint_feature", "_UI_PartWithSample_type"),
				 EsxPackage.Literals.PART_WITH_SAMPLE__START_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reserved Bits After Reverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedBitsAfterReversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSample_reservedBitsAfterReverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSample_reservedBitsAfterReverse_feature", "_UI_PartWithSample_type"),
				 EsxPackage.Literals.PART_WITH_SAMPLE__RESERVED_BITS_AFTER_REVERSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reserved Byte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedBytePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSlice_reservedByte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSlice_reservedByte_feature", "_UI_PartWithSlice_type"),
				 EsxPackage.Literals.PART_WITH_SLICE__RESERVED_BYTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slice Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliceNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartWithSlice_sliceNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartWithSlice_sliceNumber_feature", "_UI_PartWithSlice_type"),
				 EsxPackage.Literals.PART_WITH_SLICE__SLICE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glide feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PartKeyboard_glide_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PartKeyboard_glide_feature", "_UI_PartKeyboard_type"),
				 EsxPackage.Literals.PART_KEYBOARD__GLIDE,
				 true,
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
			childrenFeatures.add(EsxPackage.Literals.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE);
			childrenFeatures.add(EsxPackage.Literals.PART_KEYBOARD__SEQUENCE_DATA_NOTE);
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
	 * This returns PartKeyboard.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PartKeyboard"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PartKeyboard partKeyboard = (PartKeyboard)object;
		return getString("_UI_PartKeyboard_type") + " " + partKeyboard.getLevel();
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

		switch (notification.getFeatureID(PartKeyboard.class)) {
			case EsxPackage.PART_KEYBOARD__AMP_EG:
			case EsxPackage.PART_KEYBOARD__BPM_SYNC:
			case EsxPackage.PART_KEYBOARD__CUTOFF:
			case EsxPackage.PART_KEYBOARD__EG_INTENSITY:
			case EsxPackage.PART_KEYBOARD__EG_TIME:
			case EsxPackage.PART_KEYBOARD__FILTER_TYPE:
			case EsxPackage.PART_KEYBOARD__FX_SELECT:
			case EsxPackage.PART_KEYBOARD__FX_SEND:
			case EsxPackage.PART_KEYBOARD__MOD_DEPTH:
			case EsxPackage.PART_KEYBOARD__MOD_DEST:
			case EsxPackage.PART_KEYBOARD__MOD_SPEED:
			case EsxPackage.PART_KEYBOARD__MOD_TYPE:
			case EsxPackage.PART_KEYBOARD__PAN:
			case EsxPackage.PART_KEYBOARD__RESERVED_BIT_AFTER_MOD_DEPTH:
			case EsxPackage.PART_KEYBOARD__RESONANCE:
			case EsxPackage.PART_KEYBOARD__ROLL:
			case EsxPackage.PART_KEYBOARD__REVERSE:
			case EsxPackage.PART_KEYBOARD__SAMPLE_LABEL:
			case EsxPackage.PART_KEYBOARD__SAMPLE_POINTER:
			case EsxPackage.PART_KEYBOARD__START_POINT:
			case EsxPackage.PART_KEYBOARD__RESERVED_BITS_AFTER_REVERSE:
			case EsxPackage.PART_KEYBOARD__RESERVED_BYTE:
			case EsxPackage.PART_KEYBOARD__SLICE_NUMBER:
			case EsxPackage.PART_KEYBOARD__GLIDE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsxPackage.PART_KEYBOARD__SEQUENCE_DATA_GATE:
			case EsxPackage.PART_KEYBOARD__SEQUENCE_DATA_NOTE:
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

		newChildDescriptors.add
			(createChildParameter
				(EsxPackage.Literals.PART_WITH_SEQUENCE_DATA_GATE__SEQUENCE_DATA_GATE,
				 EsxFactory.eINSTANCE.createSequenceDataGate()));

		newChildDescriptors.add
			(createChildParameter
				(EsxPackage.Literals.PART_KEYBOARD__SEQUENCE_DATA_NOTE,
				 EsxFactory.eINSTANCE.createSequenceDataNote()));
	}

}
