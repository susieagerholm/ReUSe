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

import org.xtext.example.mydsl4.myDsl.Collision;
import org.xtext.example.mydsl4.myDsl.MyDslFactory;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.example.mydsl4.myDsl.Collision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollisionItemProvider extends ReUseAbleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollisionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MyDslPackage.Literals.COLLISION__ORIGIN);
			childrenFeatures.add(MyDslPackage.Literals.COLLISION__GEOMETRY);
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
	 * This returns Collision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Collision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Collision)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Collision_type") :
			getString("_UI_Collision_type") + " " + label;
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

		switch (notification.getFeatureID(Collision.class)) {
			case MyDslPackage.COLLISION__ORIGIN:
			case MyDslPackage.COLLISION__GEOMETRY:
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
				(MyDslPackage.Literals.COLLISION__ORIGIN,
				 MyDslFactory.eINSTANCE.createOrigin()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.COLLISION__GEOMETRY,
				 MyDslFactory.eINSTANCE.createGeometry()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.COLLISION__GEOMETRY,
				 MyDslFactory.eINSTANCE.createBox()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.COLLISION__GEOMETRY,
				 MyDslFactory.eINSTANCE.createCylinder()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.COLLISION__GEOMETRY,
				 MyDslFactory.eINSTANCE.createMesh()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.COLLISION__GEOMETRY,
				 MyDslFactory.eINSTANCE.createSphere()));
	}

}
