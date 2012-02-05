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
package com.skratchdot.electribe.model.esx.provider;


import com.skratchdot.electribe.model.esx.AmpEg;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PartWithCommon;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.PartWithCommon} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartWithCommonItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartWithCommonItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AmpEg labelValue = ((PartWithCommon)object).getAmpEg();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PartWithCommon_type") :
			getString("_UI_PartWithCommon_type") + " " + label;
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

		switch (notification.getFeatureID(PartWithCommon.class)) {
			case EsxPackage.PART_WITH_COMMON__AMP_EG:
			case EsxPackage.PART_WITH_COMMON__BPM_SYNC:
			case EsxPackage.PART_WITH_COMMON__CUTOFF:
			case EsxPackage.PART_WITH_COMMON__EG_INTENSITY:
			case EsxPackage.PART_WITH_COMMON__EG_TIME:
			case EsxPackage.PART_WITH_COMMON__FILTER_TYPE:
			case EsxPackage.PART_WITH_COMMON__FX_SELECT:
			case EsxPackage.PART_WITH_COMMON__FX_SEND:
			case EsxPackage.PART_WITH_COMMON__MOD_DEPTH:
			case EsxPackage.PART_WITH_COMMON__MOD_DEST:
			case EsxPackage.PART_WITH_COMMON__MOD_SPEED:
			case EsxPackage.PART_WITH_COMMON__MOD_TYPE:
			case EsxPackage.PART_WITH_COMMON__PAN:
			case EsxPackage.PART_WITH_COMMON__RESERVED_BIT_AFTER_MOD_DEPTH:
			case EsxPackage.PART_WITH_COMMON__RESONANCE:
			case EsxPackage.PART_WITH_COMMON__ROLL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

}
