/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Reuse#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Reuse#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getReuse()
 * @model
 * @generated
 */
public interface Reuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(ReUseAble)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getReuse_Add()
	 * @model containment="true"
	 * @generated
	 */
	ReUseAble getAdd();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Reuse#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(ReUseAble value);

	/**
	 * Returns the value of the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit</em>' containment reference.
	 * @see #setEdit(AssignNewValue)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getReuse_Edit()
	 * @model containment="true"
	 * @generated
	 */
	AssignNewValue getEdit();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Reuse#getEdit <em>Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit</em>' containment reference.
	 * @see #getEdit()
	 * @generated
	 */
	void setEdit(AssignNewValue value);

} // Reuse
