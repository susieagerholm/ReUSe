/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.example.mydsl4.myDsl.Limit;
import org.xtext.example.mydsl4.myDsl.MyDslFactory;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.example.mydsl4.myDsl.Limit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LimitItemProvider extends ReUseAbleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(MyDslPackage.Literals.LIMIT__EFFORT);
			childrenFeatures.add(MyDslPackage.Literals.LIMIT__VELOCITY);
			childrenFeatures.add(MyDslPackage.Literals.LIMIT__LOWER);
			childrenFeatures.add(MyDslPackage.Literals.LIMIT__UPPER);
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
	 * This returns Limit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Limit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Limit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Limit_type") :
			getString("_UI_Limit_type") + " " + label;
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

		switch (notification.getFeatureID(Limit.class)) {
			case MyDslPackage.LIMIT__EFFORT:
			case MyDslPackage.LIMIT__VELOCITY:
			case MyDslPackage.LIMIT__LOWER:
			case MyDslPackage.LIMIT__UPPER:
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
				(MyDslPackage.Literals.LIMIT__EFFORT,
				 MyDslFactory.eINSTANCE.createURDFAttrSignedNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.LIMIT__VELOCITY,
				 MyDslFactory.eINSTANCE.createURDFAttrSignedNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.LIMIT__LOWER,
				 MyDslFactory.eINSTANCE.createURDFAttrSignedNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.LIMIT__UPPER,
				 MyDslFactory.eINSTANCE.createURDFAttrSignedNumeric()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MyDslPackage.Literals.LIMIT__EFFORT ||
			childFeature == MyDslPackage.Literals.LIMIT__VELOCITY ||
			childFeature == MyDslPackage.Literals.LIMIT__LOWER ||
			childFeature == MyDslPackage.Literals.LIMIT__UPPER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
