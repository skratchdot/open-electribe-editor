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

import com.skratchdot.electribe.model.esx.EsxFactory;
import com.skratchdot.electribe.model.esx.EsxPackage;
import com.skratchdot.electribe.model.esx.Song;

/**
 * This is the item provider adapter for a {@link com.skratchdot.electribe.model.esx.Song} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SongItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongItemProvider(AdapterFactory adapterFactory) {
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
			addTempoLockPropertyDescriptor(object);
			addSongLengthPropertyDescriptor(object);
			addMuteHoldPropertyDescriptor(object);
			addNextSongNumberPropertyDescriptor(object);
			addNumberOfSongEventsCurrentPropertyDescriptor(object);
			addNumberOfSongEventsOriginalPropertyDescriptor(object);
			addEmptyPropertyDescriptor(object);
			addSongNumberOriginalPropertyDescriptor(object);
			addSongNumberCurrentPropertyDescriptor(object);
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
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_name_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tempo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_tempo_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_tempo_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__TEMPO, false, false, false, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Tempo Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempoLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_tempoLock_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_tempoLock_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__TEMPO_LOCK, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Song Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSongLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_songLength_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_songLength_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__SONG_LENGTH, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mute Hold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMuteHoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_muteHold_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_muteHold_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__MUTE_HOLD, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Next Song Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextSongNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_nextSongNumber_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_nextSongNumber_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__NEXT_SONG_NUMBER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Song Events Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfSongEventsCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_numberOfSongEventsCurrent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_numberOfSongEventsCurrent_feature",
						"_UI_Song_type"),
				EsxPackage.Literals.SONG__NUMBER_OF_SONG_EVENTS_CURRENT, false,
				false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Song Events Original feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfSongEventsOriginalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_numberOfSongEventsOriginal_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_numberOfSongEventsOriginal_feature",
						"_UI_Song_type"),
				EsxPackage.Literals.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL,
				false, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Empty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_empty_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_empty_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__EMPTY, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Song Number Original feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSongNumberOriginalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Song_songNumberOriginal_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Song_songNumberOriginal_feature",
								"_UI_Song_type"),
						EsxPackage.Literals.SONG__SONG_NUMBER_ORIGINAL, false,
						false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Song Number Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSongNumberCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Song_songNumberCurrent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Song_songNumberCurrent_feature", "_UI_Song_type"),
				EsxPackage.Literals.SONG__SONG_NUMBER_CURRENT, false, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsxPackage.Literals.SONG__SONG_PATTERNS);
			childrenFeatures.add(EsxPackage.Literals.SONG__SONG_EVENTS);
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
	 * This returns Song.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Song"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Song) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Song_type")
				: getString("_UI_Song_type") + " " + label;
	}

	/**
	 * This returns the column text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		switch (columnIndex) {
		// Esx#
		case 0:
			return ((Song) object).getSongNumberCurrent().toString();
			// Orig#
		case 1:
			return ((Song) object).getSongNumberOriginal().toString();
			// Name
		case 2:
			return ((Song) object).getName();
			// Tempo
		case 3:
			return Float.toString(((Song) object).getTempo().getValue());
			// TempoLock
		case 4:
			return ((Song) object).getTempoLock().getLiteral();
			// Length
		case 5:
			return ((Song) object).getSongLength().getLiteral();
			// MuteHold
		case 6:
			return ((Song) object).getMuteHold().getLiteral();
			// NextSong
		case 7:
			return ((Song) object).getNextSongNumber().getLiteral();
			// NumOfEvents
		case 8:
			return Short.toString(((Song) object)
					.getNumberOfSongEventsCurrent());
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

		switch (notification.getFeatureID(Song.class)) {
		case EsxPackage.SONG__NAME:
		case EsxPackage.SONG__TEMPO:
		case EsxPackage.SONG__TEMPO_LOCK:
		case EsxPackage.SONG__SONG_LENGTH:
		case EsxPackage.SONG__MUTE_HOLD:
		case EsxPackage.SONG__NEXT_SONG_NUMBER:
		case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_CURRENT:
		case EsxPackage.SONG__NUMBER_OF_SONG_EVENTS_ORIGINAL:
		case EsxPackage.SONG__EMPTY:
		case EsxPackage.SONG__SONG_NUMBER_ORIGINAL:
		case EsxPackage.SONG__SONG_NUMBER_CURRENT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case EsxPackage.SONG__SONG_PATTERNS:
		case EsxPackage.SONG__SONG_EVENTS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_PATTERNS,
				EsxFactory.eINSTANCE.createSongPattern()));

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_EVENTS,
				EsxFactory.eINSTANCE.createSongEventControl()));

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_EVENTS,
				EsxFactory.eINSTANCE.createSongEventDrumNote()));

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_EVENTS,
				EsxFactory.eINSTANCE.createSongEventKeyboardNote()));

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_EVENTS,
				EsxFactory.eINSTANCE.createSongEventMuteStatus()));

		newChildDescriptors.add(createChildParameter(
				EsxPackage.Literals.SONG__SONG_EVENTS,
				EsxFactory.eINSTANCE.createSongEventTempo()));
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
		if (feature == EsxPackage.Literals.SONG__NAME) {
			value = StringUtils.left((String) value, 8);
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

}
