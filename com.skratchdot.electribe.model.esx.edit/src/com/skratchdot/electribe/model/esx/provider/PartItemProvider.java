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

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.MotionSequenceStatus;
import com.skratchdot.electribe.model.esx.Part;
import com.skratchdot.electribe.model.esx.PartKeyboard;
import com.skratchdot.electribe.model.esx.PartWithCommon;
import com.skratchdot.electribe.model.esx.PartWithPitch;
import com.skratchdot.electribe.model.esx.PartWithSample;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.Part} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addLevelPropertyDescriptor(object);
			addMotionSequenceStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Part_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Part_label_feature", "_UI_Part_type"),
				 EsxPackage.Literals.PART__LABEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Part_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Part_level_feature", "_UI_Part_type"),
				 EsxPackage.Literals.PART__LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Motion Sequence Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotionSequenceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Part_motionSequenceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Part_motionSequenceStatus_feature", "_UI_Part_type"),
				 EsxPackage.Literals.PART__MOTION_SEQUENCE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Part.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Part"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Part)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_Part_type") :
			getString("_UI_Part_type") + " " + label;
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch(columnIndex) {
			// Part Label
			case 0: return ((Part) object).getLabel();
			// Level
			case 1: return Byte.toString(((Part) object).getLevel());
			// Motion Sequence Status
			case 2: {
				MotionSequenceStatus motionSequenceStatus = MotionSequenceStatus.get(((Part) object).getMotionSequenceStatus());
				return motionSequenceStatus==null?"unknown":motionSequenceStatus.getLiteral();
			}
			// PartWithSample: Sample Label
			case 3: {
				if(object instanceof PartWithSample) {
					return ((PartWithSample) object).getSampleLabel();
				}
				else {
					return "";
				}
			}
			// PartWithPitch: Pitch
			// PartKeyboard: Glide
			case 4: {
				if(object instanceof PartWithPitch) {
					return Byte.toString(((PartWithPitch) object).getPitch());
				}
				else if(object instanceof PartKeyboard) {
					return Byte.toString(((PartKeyboard) object).getGlide());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Pan
			case 5: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getPan());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Eg Time
			case 6: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getEgTime());
				}
				else {
					return "";
				}
			}			
			// PartWithSample: Start Point
			case 7: {
				if(object instanceof PartWithSample) {
					return Byte.toString(((PartWithSample) object).getStartPoint());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Amp Eg
			case 8: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getAmpEg().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Roll
			case 9: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getRoll().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithSample: Reverse
			case 10: {
				if(object instanceof PartWithSample) {
					return ((PartWithSample) object).getReverse().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: FX Select
			case 11: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getFxSelect().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: FX Send
			case 12: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getFxSend().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Mod Type
			case 13: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getModType().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Mod Dest
			case 14: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getModDest().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Mod Speed
			case 15: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getModSpeed());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Mod Depth
			case 16: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getModDepth());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: BPM Sync
			case 17: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getBpmSync().getLiteral();
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Cutoff
			case 18: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getCutoff());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Resonance
			case 19: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getResonance());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Eg Intensity
			case 20: {
				if(object instanceof PartWithCommon) {
					return Byte.toString(((PartWithCommon) object).getEgIntensity());
				}
				else {
					return "";
				}
			}
			// PartWithCommon: Filter Type
			case 21: {
				if(object instanceof PartWithCommon) {
					return ((PartWithCommon) object).getFilterType().getLiteral();
				}
				else {
					return "";
				}
			}
			default: return "";
		}
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

		switch (notification.getFeatureID(Part.class)) {
			case EsxPackage.PART__LABEL:
			case EsxPackage.PART__LEVEL:
			case EsxPackage.PART__MOTION_SEQUENCE_STATUS:
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
