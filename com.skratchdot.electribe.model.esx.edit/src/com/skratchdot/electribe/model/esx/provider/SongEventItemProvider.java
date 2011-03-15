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
import com.skratchdot.electribe.model.esx.SongEvent;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.SongEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SongEventItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongEventItemProvider(AdapterFactory adapterFactory) {
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

			addCurrentPositionPropertyDescriptor(object);
			addEventInfoPropertyDescriptor(object);
			addEventTypePropertyDescriptor(object);
			addMeasurePropertyDescriptor(object);
			addOperationNumberPropertyDescriptor(object);
			addPositionNumberPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Current Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_currentPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_currentPosition_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__CURRENT_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_eventInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_eventInfo_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__EVENT_INFO,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_eventType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_eventType_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__EVENT_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_measure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_measure_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__MEASURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_operationNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_operationNumber_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__OPERATION_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_positionNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_positionNumber_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__POSITION_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SongEvent_step_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SongEvent_step_feature", "_UI_SongEvent_type"),
				 EsxPackage.Literals.SONG_EVENT__STEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
		SongEvent songEvent = (SongEvent)object;
		return getString("_UI_SongEvent_type") + " " + songEvent.getCurrentPosition();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getColumnText(java.lang.Object, int)
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch(columnIndex) {
			// Current Position
			case 0: return Integer.toString(((SongEvent) object).getCurrentPosition());
			// Position Number
			case 1: return Byte.toString(((SongEvent) object).getPositionNumber());
			// Measure
			case 2: return Byte.toString(((SongEvent) object).getMeasure());
			// Step
			case 3: return Byte.toString(((SongEvent) object).getStep());
			// EventType
			case 4: return ((SongEvent) object).getEventType();
			// EventInfo
			case 5: return ((SongEvent) object).getEventInfo();
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

		switch (notification.getFeatureID(SongEvent.class)) {
			case EsxPackage.SONG_EVENT__CURRENT_POSITION:
			case EsxPackage.SONG_EVENT__EVENT_INFO:
			case EsxPackage.SONG_EVENT__EVENT_TYPE:
			case EsxPackage.SONG_EVENT__MEASURE:
			case EsxPackage.SONG_EVENT__OPERATION_NUMBER:
			case EsxPackage.SONG_EVENT__POSITION_NUMBER:
			case EsxPackage.SONG_EVENT__STEP:
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
