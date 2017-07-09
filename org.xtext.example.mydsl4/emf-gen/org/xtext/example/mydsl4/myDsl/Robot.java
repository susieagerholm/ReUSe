/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Robot#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Robot#getLinks <em>Links</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Robot#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Robot#getTopologies <em>Topologies</em>}</li>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Robot#getAddto <em>Addto</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.mydsl4.myDsl.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.mydsl4.myDsl.Joint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

	/**
	 * Returns the value of the '<em><b>Topologies</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.mydsl4.myDsl.Topology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topologies</em>' containment reference list.
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot_Topologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topology> getTopologies();

	/**
	 * Returns the value of the '<em><b>Addto</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.example.mydsl4.myDsl.AddTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addto</em>' containment reference list.
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getRobot_Addto()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddTo> getAddto();

} // Robot
