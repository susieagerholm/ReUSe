/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl4.myDsl.MyDslPackage;
import org.xtext.example.mydsl4.myDsl.Texture;
import org.xtext.example.mydsl4.myDsl.URDFAttrSTRING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.impl.TextureImpl#getPathToFile <em>Path To File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextureImpl extends MaterialImpl implements Texture {
	/**
	 * The cached value of the '{@link #getPathToFile() <em>Path To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFile()
	 * @generated
	 * @ordered
	 */
	protected URDFAttrSTRING pathToFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyDslPackage.Literals.TEXTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URDFAttrSTRING getPathToFile() {
		return pathToFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathToFile(URDFAttrSTRING newPathToFile, NotificationChain msgs) {
		URDFAttrSTRING oldPathToFile = pathToFile;
		pathToFile = newPathToFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TEXTURE__PATH_TO_FILE, oldPathToFile, newPathToFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathToFile(URDFAttrSTRING newPathToFile) {
		if (newPathToFile != pathToFile) {
			NotificationChain msgs = null;
			if (pathToFile != null)
				msgs = ((InternalEObject)pathToFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TEXTURE__PATH_TO_FILE, null, msgs);
			if (newPathToFile != null)
				msgs = ((InternalEObject)newPathToFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TEXTURE__PATH_TO_FILE, null, msgs);
			msgs = basicSetPathToFile(newPathToFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TEXTURE__PATH_TO_FILE, newPathToFile, newPathToFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyDslPackage.TEXTURE__PATH_TO_FILE:
				return basicSetPathToFile(null, msgs);
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
			case MyDslPackage.TEXTURE__PATH_TO_FILE:
				return getPathToFile();
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
			case MyDslPackage.TEXTURE__PATH_TO_FILE:
				setPathToFile((URDFAttrSTRING)newValue);
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
			case MyDslPackage.TEXTURE__PATH_TO_FILE:
				setPathToFile((URDFAttrSTRING)null);
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
			case MyDslPackage.TEXTURE__PATH_TO_FILE:
				return pathToFile != null;
		}
		return super.eIsSet(featureID);
	}

} //TextureImpl
