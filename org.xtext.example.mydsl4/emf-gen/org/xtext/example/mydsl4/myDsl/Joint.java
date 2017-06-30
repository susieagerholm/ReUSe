/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Joint#getIsReuseOf <em>Is Reuse Of</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Joint#getChildOf <em>Child Of</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Joint#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Joint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends ReUseAble {
	/**
	 * Returns the value of the '<em><b>Is Reuse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reuse Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reuse Of</em>' reference.
	 * @see #setIsReuseOf(Joint)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getJoint_IsReuseOf()
	 * @model
	 * @generated
	 */
	Joint getIsReuseOf();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Joint#getIsReuseOf <em>Is Reuse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reuse Of</em>' reference.
	 * @see #getIsReuseOf()
	 * @generated
	 */
	void setIsReuseOf(Joint value);

	/**
	 * Returns the value of the '<em><b>Child Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Of</em>' reference.
	 * @see #setChildOf(Link)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getJoint_ChildOf()
	 * @model required="true"
	 * @generated
	 */
	Link getChildOf();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Joint#getChildOf <em>Child Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Of</em>' reference.
	 * @see #getChildOf()
	 * @generated
	 */
	void setChildOf(Link value);

	/**
	 * Returns the value of the '<em><b>Parent Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Of</em>' reference.
	 * @see #setParentOf(Link)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getJoint_ParentOf()
	 * @model required="true"
	 * @generated
	 */
	Link getParentOf();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Joint#getParentOf <em>Parent Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Of</em>' reference.
	 * @see #getParentOf()
	 * @generated
	 */
	void setParentOf(Link value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.example.mydsl4.myDsl.JointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.xtext.example.mydsl4.myDsl.JointType
	 * @see #setType(JointType)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getJoint_Type()
	 * @model required="true"
	 * @generated
	 */
	JointType getType();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Joint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.xtext.example.mydsl4.myDsl.JointType
	 * @see #getType()
	 * @generated
	 */
	void setType(JointType value);

} // Joint
