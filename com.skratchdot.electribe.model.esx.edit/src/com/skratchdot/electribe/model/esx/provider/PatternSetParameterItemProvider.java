/*******************************************************************************
 * Copyright (c) 2009-2013 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *******************************************************************************/
package com.skratchdot.electribe.model.esx.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.resource.Resource;
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

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.PatternSetParameter;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.PatternSetParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternSetParameterItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternSetParameterItemProvider(AdapterFactory adapterFactory) {
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

			addPositionCurrentPropertyDescriptor(object);
			addPatternPointerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Position Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PatternSetParameter_positionCurrent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PatternSetParameter_positionCurrent_feature",
						"_UI_PatternSetParameter_type"),
				EsxPackage.Literals.PATTERN_SET_PARAMETER__POSITION_CURRENT,
				false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pattern Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PatternSetParameter_patternPointer_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PatternSetParameter_patternPointer_feature",
						"_UI_PatternSetParameter_type"),
				EsxPackage.Literals.PATTERN_SET_PARAMETER__PATTERN_POINTER,
				true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PatternSetParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/PatternSetParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PatternSetParameter patternSetParameter = (PatternSetParameter) object;
		return getString("_UI_PatternSetParameter_type") + " "
				+ patternSetParameter.getPositionCurrent();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getColumnText(java.lang.Object, int)
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch (columnIndex) {
		// Current Position
		case 0:
			return Integer.toString(((PatternSetParameter) object)
					.getPositionCurrent() + 1);
			// Pattern Number
		case 1: {
			if (((PatternSetParameter) object).eResource() != null) {
				Resource resource = (Resource) ((PatternSetParameter) object)
						.eResource();
				Object rootObject = resource.getContents().get(0);
				if (rootObject instanceof EsxFile) {
					try {
						return ((EsxFile) rootObject).getPatternFromPointer(
								((PatternSetParameter) object)
										.getPatternPointer()).getLabel();
					} catch (Exception e) {
					}
				}
			}
		}
		default:
			return getText(object);
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

		switch (notification.getFeatureID(PatternSetParameter.class)) {
		case EsxPackage.PATTERN_SET_PARAMETER__POSITION_CURRENT:
		case EsxPackage.PATTERN_SET_PARAMETER__PATTERN_POINTER:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
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
