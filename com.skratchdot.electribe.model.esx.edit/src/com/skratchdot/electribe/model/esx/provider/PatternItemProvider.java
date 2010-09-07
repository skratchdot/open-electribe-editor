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


import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
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

import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Pattern;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.Pattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addTempoPropertyDescriptor(object);
			addSwingPropertyDescriptor(object);
			addPatternLengthPropertyDescriptor(object);
			addBeatPropertyDescriptor(object);
			addRollTypePropertyDescriptor(object);
			addFxChainPropertyDescriptor(object);
			addLastStepPropertyDescriptor(object);
			addArpeggiatorScalePropertyDescriptor(object);
			addArpeggiatorCenterNotePropertyDescriptor(object);
			addEmptyPropertyDescriptor(object);
			addPatternNumberOriginalPropertyDescriptor(object);
			addPatternNumberCurrentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_name_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tempo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_tempo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_tempo_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__TEMPO,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_swing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_swing_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__SWING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_patternLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_patternLength_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__PATTERN_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_beat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_beat_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__BEAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roll Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_rollType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_rollType_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__ROLL_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fx Chain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFxChainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_fxChain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_fxChain_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__FX_CHAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_lastStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_lastStep_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__LAST_STEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arpeggiator Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArpeggiatorScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_arpeggiatorScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_arpeggiatorScale_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__ARPEGGIATOR_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arpeggiator Center Note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArpeggiatorCenterNotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_arpeggiatorCenterNote_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_arpeggiatorCenterNote_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__ARPEGGIATOR_CENTER_NOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Empty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_empty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_empty_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__EMPTY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Number Original feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternNumberOriginalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_patternNumberOriginal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_patternNumberOriginal_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__PATTERN_NUMBER_ORIGINAL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Number Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternNumberCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pattern_patternNumberCurrent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pattern_patternNumberCurrent_feature", "_UI_Pattern_type"),
				 EsxPackage.Literals.PATTERN__PATTERN_NUMBER_CURRENT,
				 false,
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
			childrenFeatures.add(EsxPackage.Literals.PATTERN__TEMPO);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__DRUM_PARTS);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__KEYBOARD_PARTS);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__STRETCH_SLICE_PARTS);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__AUDIO_IN_PART);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__ACCENT_PART);
			childrenFeatures.add(EsxPackage.Literals.PATTERN__MOTION_PARAMETERS);
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
	 * This returns Pattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Pattern_type") :
			getString("_UI_Pattern_type") + " " + label;
	}

	/**
	 * This returns the column text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch(columnIndex) {
			// Esx#
			case 0: return ((Pattern) object).getPatternNumberCurrent().toString();
			// Orig#
			case 1: return ((Pattern) object).getPatternNumberOriginal().toString();
			// Name
			case 2: return ((Pattern) object).getName();
			// Tempo
			case 3: return Float.toString(((Pattern) object).getTempo().getValue());
			// Swing
			case 4: return ((Pattern) object).getSwing().getLiteral();
			// Length
			case 5: return ((Pattern) object).getPatternLength().getLiteral();
			// Beat
			case 6: return ((Pattern) object).getBeat().getLiteral();
			// Roll
			case 7: return ((Pattern) object).getRollType().getLiteral();
			// FxChain
			case 8: return ((Pattern) object).getFxChain().getLiteral();
			// LastStep
			case 9: return ((Pattern) object).getLastStep().getLiteral();
			// ArpScale
			case 10: return ((Pattern) object).getArpeggiatorScale().getLiteral();
			// CenterNote
			case 11: return ((Pattern) object).getArpeggiatorCenterNote().getLiteral();
			// Fx1 Type
			case 12: return ((Pattern) object).getFxParameters().get(0).getEffectType().getLiteral();
			// Fx2 Type
			case 13: return ((Pattern) object).getFxParameters().get(1).getEffectType().getLiteral();
			// Fx3 Type
			case 14: return ((Pattern) object).getFxParameters().get(2).getEffectType().getLiteral();
			// Part 1
			case 15: return ((Pattern) object).getDrumParts().get(0).getSampleLabel();
			// Part 2
			case 16: return ((Pattern) object).getDrumParts().get(1).getSampleLabel();
			// Part 3
			case 17: return ((Pattern) object).getDrumParts().get(2).getSampleLabel();
			// Part 4
			case 18: return ((Pattern) object).getDrumParts().get(3).getSampleLabel();
			// Part 5
			case 19: return ((Pattern) object).getDrumParts().get(4).getSampleLabel();
			// Part 6a
			case 20: return ((Pattern) object).getDrumParts().get(5).getSampleLabel();
			// Part 6b
			case 21: return ((Pattern) object).getDrumParts().get(6).getSampleLabel();
			// Part 7a
			case 22: return ((Pattern) object).getDrumParts().get(7).getSampleLabel();
			// Part 7b
			case 23: return ((Pattern) object).getDrumParts().get(8).getSampleLabel();
			// Key 1
			case 24: return ((Pattern) object).getKeyboardParts().get(0).getSampleLabel();
			// Key 2
			case 25: return ((Pattern) object).getKeyboardParts().get(1).getSampleLabel();
			// Stretch 1
			case 26: return ((Pattern) object).getStretchSliceParts().get(0).getSampleLabel();
			// Stretch 2
			case 27: return ((Pattern) object).getStretchSliceParts().get(1).getSampleLabel();
			// Slice
			case 28: return ((Pattern) object).getStretchSliceParts().get(2).getSampleLabel();
			default: return getText(object);
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

		switch (notification.getFeatureID(Pattern.class)) {
			case EsxPackage.PATTERN__NAME:
			case EsxPackage.PATTERN__SWING:
			case EsxPackage.PATTERN__PATTERN_LENGTH:
			case EsxPackage.PATTERN__RESERVED_BIT_AFTER_PATTERN_LENGTH:
			case EsxPackage.PATTERN__BEAT:
			case EsxPackage.PATTERN__ROLL_TYPE:
			case EsxPackage.PATTERN__FX_CHAIN:
			case EsxPackage.PATTERN__LAST_STEP:
			case EsxPackage.PATTERN__ARPEGGIATOR_SCALE:
			case EsxPackage.PATTERN__RESERVED_BITS_AFTER_ARPEGGIATOR_SCALE:
			case EsxPackage.PATTERN__ARPEGGIATOR_CENTER_NOTE:
			case EsxPackage.PATTERN__MUTE_STATUS:
			case EsxPackage.PATTERN__SWING_STATUS:
			case EsxPackage.PATTERN__OUTPUT_BUS_STATUS:
			case EsxPackage.PATTERN__ACCENT_STATUS:
			case EsxPackage.PATTERN__EMPTY:
			case EsxPackage.PATTERN__PATTERN_NUMBER_ORIGINAL:
			case EsxPackage.PATTERN__PATTERN_NUMBER_CURRENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsxPackage.PATTERN__TEMPO:
			case EsxPackage.PATTERN__DRUM_PARTS:
			case EsxPackage.PATTERN__KEYBOARD_PARTS:
			case EsxPackage.PATTERN__STRETCH_SLICE_PARTS:
			case EsxPackage.PATTERN__AUDIO_IN_PART:
			case EsxPackage.PATTERN__ACCENT_PART:
			case EsxPackage.PATTERN__MOTION_PARAMETERS:
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
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {

		// When setting name, only allow 8 characters
		if(feature == EsxPackage.Literals.PATTERN__NAME) {
			value = StringUtils.left((String)value, 8);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
