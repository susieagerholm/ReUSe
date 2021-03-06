/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl4.myDsl.Dynamics;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;
import org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.DynamicsImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.DynamicsImpl#getDamping <em>Damping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicsImpl extends ReUseAbleImpl implements Dynamics {
	/**
	 * The cached value of the '{@link #getFriction() <em>Friction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric friction;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric damping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyDslPackage.Literals.DYNAMICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getFriction() {
		return friction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFriction(URDFAttrSignedNumeric newFriction, NotificationChain msgs) {
		URDFAttrSignedNumeric oldFriction = friction;
		friction = newFriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DYNAMICS__FRICTION, oldFriction, newFriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(URDFAttrSignedNumeric newFriction) {
		if (newFriction != friction) {
			NotificationChain msgs = null;
			if (friction != null)
				msgs = ((InternalEObject)friction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DYNAMICS__FRICTION, null, msgs);
			if (newFriction != null)
				msgs = ((InternalEObject)newFriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DYNAMICS__FRICTION, null, msgs);
			msgs = basicSetFriction(newFriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DYNAMICS__FRICTION, newFriction, newFriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getDamping() {
		return damping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamping(URDFAttrSignedNumeric newDamping, NotificationChain msgs) {
		URDFAttrSignedNumeric oldDamping = damping;
		damping = newDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DYNAMICS__DAMPING, oldDamping, newDamping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamping(URDFAttrSignedNumeric newDamping) {
		if (newDamping != damping) {
			NotificationChain msgs = null;
			if (damping != null)
				msgs = ((InternalEObject)damping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DYNAMICS__DAMPING, null, msgs);
			if (newDamping != null)
				msgs = ((InternalEObject)newDamping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DYNAMICS__DAMPING, null, msgs);
			msgs = basicSetDamping(newDamping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DYNAMICS__DAMPING, newDamping, newDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyDslPackage.DYNAMICS__FRICTION:
				return basicSetFriction(null, msgs);
			case MyDslPackage.DYNAMICS__DAMPING:
				return basicSetDamping(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyDslPackage.DYNAMICS__FRICTION:
				return getFriction();
			case MyDslPackage.DYNAMICS__DAMPING:
				return getDamping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyDslPackage.DYNAMICS__FRICTION:
				setFriction((URDFAttrSignedNumeric)newValue);
				return;
			case MyDslPackage.DYNAMICS__DAMPING:
				setDamping((URDFAttrSignedNumeric)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MyDslPackage.DYNAMICS__FRICTION:
				setFriction((URDFAttrSignedNumeric)null);
				return;
			case MyDslPackage.DYNAMICS__DAMPING:
				setDamping((URDFAttrSignedNumeric)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MyDslPackage.DYNAMICS__FRICTION:
				return friction != null;
			case MyDslPackage.DYNAMICS__DAMPING:
				return damping != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicsImpl
