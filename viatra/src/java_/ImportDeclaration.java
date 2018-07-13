/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.ImportDeclaration#isStatic <em>Static</em>}</li>
 *   <li>{@link java_.ImportDeclaration#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see java_.Java_Package#getImportDeclaration_Static()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link java_.ImportDeclaration#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link java_.NamedElement#getUsagesInImports <em>Usages In Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(NamedElement)
	 * @see java_.Java_Package#getImportDeclaration_ImportedElement()
	 * @see java_.NamedElement#getUsagesInImports
	 * @model opposite="usagesInImports" required="true" ordered="false"
	 * @generated
	 */
	NamedElement getImportedElement();

	/**
	 * Sets the value of the '{@link java_.ImportDeclaration#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(NamedElement value);

} // ImportDeclaration
