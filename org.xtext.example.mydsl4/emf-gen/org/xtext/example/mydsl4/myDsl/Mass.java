/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Mass#getMassKilogram <em>Mass Kilogram</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getMass()
 * @model
 * @generated
 */
public interface Mass extends ReUseAble {
	/**
	 * Returns the value of the '<em><b>Mass Kilogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Kilogram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Kilogram</em>' containment reference.
	 * @see #setMassKilogram(URDFAttrSignedNumeric)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getMass_MassKilogram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSignedNumeric getMassKilogram();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Mass#getMassKilogram <em>Mass Kilogram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Kilogram</em>' containment reference.
	 * @see #getMassKilogram()
	 * @generated
	 */
	void setMassKilogram(URDFAttrSignedNumeric value);

} // Mass
