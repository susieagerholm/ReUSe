/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.example.mydsl4.myDsl.Limit;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;
import org.xtext.example.mydsl4.myDsl.URDFAttrSignedNumeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.LimitImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.LimitImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.LimitImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.LimitImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends ReUseAbleImpl implements Limit {
	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric effort;
	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric velocity;
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric lower;
	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSignedNumeric upper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyDslPackage.Literals.LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffort(URDFAttrSignedNumeric newEffort, NotificationChain msgs) {
		URDFAttrSignedNumeric oldEffort = effort;
		effort = newEffort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__EFFORT, oldEffort, newEffort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffort(URDFAttrSignedNumeric newEffort) {
		if (newEffort != effort) {
			NotificationChain msgs = null;
			if (effort != null)
				msgs = ((InternalEObject)effort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__EFFORT, null, msgs);
			if (newEffort != null)
				msgs = ((InternalEObject)newEffort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__EFFORT, null, msgs);
			msgs = basicSetEffort(newEffort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__EFFORT, newEffort, newEffort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocity(URDFAttrSignedNumeric newVelocity, NotificationChain msgs) {
		URDFAttrSignedNumeric oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__VELOCITY, oldVelocity, newVelocity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(URDFAttrSignedNumeric newVelocity) {
		if (newVelocity != velocity) {
			NotificationChain msgs = null;
			if (velocity != null)
				msgs = ((InternalEObject)velocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__VELOCITY, null, msgs);
			if (newVelocity != null)
				msgs = ((InternalEObject)newVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__VELOCITY, null, msgs);
			msgs = basicSetVelocity(newVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__VELOCITY, newVelocity, newVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(URDFAttrSignedNumeric newLower, NotificationChain msgs) {
		URDFAttrSignedNumeric oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(URDFAttrSignedNumeric newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSignedNumeric getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(URDFAttrSignedNumeric newUpper, NotificationChain msgs) {
		URDFAttrSignedNumeric oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(URDFAttrSignedNumeric newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LIMIT__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LIMIT__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyDslPackage.LIMIT__EFFORT:
				return basicSetEffort(null, msgs);
			case MyDslPackage.LIMIT__VELOCITY:
				return basicSetVelocity(null, msgs);
			case MyDslPackage.LIMIT__LOWER:
				return basicSetLower(null, msgs);
			case MyDslPackage.LIMIT__UPPER:
				return basicSetUpper(null, msgs);
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
			case MyDslPackage.LIMIT__EFFORT:
				return getEffort();
			case MyDslPackage.LIMIT__VELOCITY:
				return getVelocity();
			case MyDslPackage.LIMIT__LOWER:
				return getLower();
			case MyDslPackage.LIMIT__UPPER:
				return getUpper();
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
			case MyDslPackage.LIMIT__EFFORT:
				setEffort((URDFAttrSignedNumeric)newValue);
				return;
			case MyDslPackage.LIMIT__VELOCITY:
				setVelocity((URDFAttrSignedNumeric)newValue);
				return;
			case MyDslPackage.LIMIT__LOWER:
				setLower((URDFAttrSignedNumeric)newValue);
				return;
			case MyDslPackage.LIMIT__UPPER:
				setUpper((URDFAttrSignedNumeric)newValue);
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
			case MyDslPackage.LIMIT__EFFORT:
				setEffort((URDFAttrSignedNumeric)null);
				return;
			case MyDslPackage.LIMIT__VELOCITY:
				setVelocity((URDFAttrSignedNumeric)null);
				return;
			case MyDslPackage.LIMIT__LOWER:
				setLower((URDFAttrSignedNumeric)null);
				return;
			case MyDslPackage.LIMIT__UPPER:
				setUpper((URDFAttrSignedNumeric)null);
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
			case MyDslPackage.LIMIT__EFFORT:
				return effort != null;
			case MyDslPackage.LIMIT__VELOCITY:
				return velocity != null;
			case MyDslPackage.LIMIT__LOWER:
				return lower != null;
			case MyDslPackage.LIMIT__UPPER:
				return upper != null;
		}
		return super.eIsSet(featureID);
	}

} //LimitImpl
