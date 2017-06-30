/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl4.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl4.myDsl.Texture#getPathToFile <em>Path To File</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getTexture()
 * @model
 * @generated
 */
public interface Texture extends Material {
	/**
	 * Returns the value of the '<em><b>Path To File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path To File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To File</em>' containment reference.
	 * @see #setPathToFile(URDFAttrSTRING)
	 * @see org.xtext.example.mydsl4.myDsl.MyDslPackage#getTexture_PathToFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URDFAttrSTRING getPathToFile();

	/**
	 * Sets the value of the '{@link org.xtext.example.mydsl4.myDsl.Texture#getPathToFile <em>Path To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To File</em>' containment reference.
	 * @see #getPathToFile()
	 * @generated
	 */
	void setPathToFile(URDFAttrSTRING value);

} // Texture
