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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.skratchdot.electribe.model.esx.EnabledFlag;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.GlobalParameters;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.GlobalParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalParametersItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalParametersItemProvider(AdapterFactory adapterFactory) {
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

			addMemoryProtectEnabledPropertyDescriptor(object);
			addReservedBytePropertyDescriptor(object);
			addArpeggiatorControlPropertyDescriptor(object);
			addAudioInModePropertyDescriptor(object);
			addMidiClockPropertyDescriptor(object);
			addNoteMessageEnabledPropertyDescriptor(object);
			addSystemExEnabledPropertyDescriptor(object);
			addControlChangeEnabledPropertyDescriptor(object);
			addProgramChangeEnabledPropertyDescriptor(object);
			addReservedBitsAfterProgramChangeEnabledPropertyDescriptor(object);
			addPitchBendRangePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Memory Protect Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryProtectEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_memoryProtectEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_memoryProtectEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_GlobalParameters_reservedByte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_reservedByte_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__RESERVED_BYTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arpeggiator Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArpeggiatorControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_arpeggiatorControl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_arpeggiatorControl_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Audio In Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAudioInModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_audioInMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_audioInMode_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__AUDIO_IN_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_midiClock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_midiClock_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__MIDI_CLOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Note Message Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoteMessageEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_noteMessageEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_noteMessageEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Ex Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemExEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_systemExEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_systemExEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Change Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlChangeEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_controlChangeEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_controlChangeEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Change Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramChangeEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_programChangeEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_programChangeEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reserved Bits After Program Change Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReservedBitsAfterProgramChangeEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_reservedBitsAfterProgramChangeEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_reservedBitsAfterProgramChangeEnabled_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pitch Bend Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPitchBendRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlobalParameters_pitchBendRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalParameters_pitchBendRange_feature", "_UI_GlobalParameters_type"),
				 EsxPackage.Literals.GLOBAL_PARAMETERS__PITCH_BEND_RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(EsxPackage.Literals.GLOBAL_PARAMETERS__MIDI_CHANNELS);
			childrenFeatures.add(EsxPackage.Literals.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS);
			childrenFeatures.add(EsxPackage.Literals.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS);
			childrenFeatures.add(EsxPackage.Literals.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS);
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
	 * This returns GlobalParameters.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GlobalParameters"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EnabledFlag labelValue = ((GlobalParameters)object).getMemoryProtectEnabled();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GlobalParameters_type") :
			getString("_UI_GlobalParameters_type") + " " + label;
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

		switch (notification.getFeatureID(GlobalParameters.class)) {
			case EsxPackage.GLOBAL_PARAMETERS__MEMORY_PROTECT_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BYTE:
			case EsxPackage.GLOBAL_PARAMETERS__ARPEGGIATOR_CONTROL:
			case EsxPackage.GLOBAL_PARAMETERS__AUDIO_IN_MODE:
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CLOCK:
			case EsxPackage.GLOBAL_PARAMETERS__NOTE_MESSAGE_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__SYSTEM_EX_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__CONTROL_CHANGE_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__PROGRAM_CHANGE_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_BITS_AFTER_PROGRAM_CHANGE_ENABLED:
			case EsxPackage.GLOBAL_PARAMETERS__PITCH_BEND_RANGE:
			case EsxPackage.GLOBAL_PARAMETERS__RESERVED_LONG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CHANNELS:
			case EsxPackage.GLOBAL_PARAMETERS__PART_NOTE_NUMBERS:
			case EsxPackage.GLOBAL_PARAMETERS__MIDI_CONTROL_CHANGE_ASSIGNMENTS:
			case EsxPackage.GLOBAL_PARAMETERS__PATTERN_SET_PARAMETERS:
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

}
