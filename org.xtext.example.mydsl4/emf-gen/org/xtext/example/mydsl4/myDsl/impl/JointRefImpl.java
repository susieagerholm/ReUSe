/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl4.myDsl.JointRef;
import org.xtext.example.mydsl4.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointRefImpl#getFix <em>Fix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointRefImpl#getRev <em>Rev</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointRefImpl#getPris <em>Pris</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.JointRefImpl#getCont <em>Cont</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointRefImpl extends MinimalEObjectImpl.Container implements JointRef {
	/**
	 * The default value of the '{@link #getFix() <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix()
	 * @generated
	 * @ordered
	 */
	protected static final String FIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFix() <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix()
	 * @generated
	 * @ordered
	 */
	protected String fix = FIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected static final String REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected String rev = REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPris() <em>Pris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPris()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPris() <em>Pris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPris()
	 * @generated
	 * @ordered
	 */
	protected String pris = PRIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCont()
	 * @generated
	 * @ordered
	 */
	protected static final String CONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCont()
	 * @generated
	 * @ordered
	 */
	protected String cont = CONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyDslPackage.Literals.JOINT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFix() {
		return fix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFix(String newFix) {
		String oldFix = fix;
		fix = newFix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT_REF__FIX, oldFix, fix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRev() {
		return rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRev(String newRev) {
		String oldRev = rev;
		rev = newRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT_REF__REV, oldRev, rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPris() {
		return pris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPris(String newPris) {
		String oldPris = pris;
		pris = newPris;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT_REF__PRIS, oldPris, pris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCont() {
		return cont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCont(String newCont) {
		String oldCont = cont;
		cont = newCont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOINT_REF__CONT, oldCont, cont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyDslPackage.JOINT_REF__FIX:
				return getFix();
			case MyDslPackage.JOINT_REF__REV:
				return getRev();
			case MyDslPackage.JOINT_REF__PRIS:
				return getPris();
			case MyDslPackage.JOINT_REF__CONT:
				return getCont();
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
			case MyDslPackage.JOINT_REF__FIX:
				setFix((String)newValue);
				return;
			case MyDslPackage.JOINT_REF__REV:
				setRev((String)newValue);
				return;
			case MyDslPackage.JOINT_REF__PRIS:
				setPris((String)newValue);
				return;
			case MyDslPackage.JOINT_REF__CONT:
				setCont((String)newValue);
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
			case MyDslPackage.JOINT_REF__FIX:
				setFix(FIX_EDEFAULT);
				return;
			case MyDslPackage.JOINT_REF__REV:
				setRev(REV_EDEFAULT);
				return;
			case MyDslPackage.JOINT_REF__PRIS:
				setPris(PRIS_EDEFAULT);
				return;
			case MyDslPackage.JOINT_REF__CONT:
				setCont(CONT_EDEFAULT);
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
			case MyDslPackage.JOINT_REF__FIX:
				return FIX_EDEFAULT == null ? fix != null : !FIX_EDEFAULT.equals(fix);
			case MyDslPackage.JOINT_REF__REV:
				return REV_EDEFAULT == null ? rev != null : !REV_EDEFAULT.equals(rev);
			case MyDslPackage.JOINT_REF__PRIS:
				return PRIS_EDEFAULT == null ? pris != null : !PRIS_EDEFAULT.equals(pris);
			case MyDslPackage.JOINT_REF__CONT:
				return CONT_EDEFAULT == null ? cont != null : !CONT_EDEFAULT.equals(cont);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fix: ");
		result.append(fix);
		result.append(", rev: ");
		result.append(rev);
		result.append(", pris: ");
		result.append(pris);
		result.append(", cont: ");
		result.append(cont);
		result.append(')');
		return result.toString();
	}

} //JointRefImpl
