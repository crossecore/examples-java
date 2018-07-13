/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link java_.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getAnonymousClassDeclaration()
 * @model
 * @generated
 */
public interface AnonymousClassDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link java_.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see java_.Java_Package#getAnonymousClassDeclaration_BodyDeclarations()
	 * @see java_.BodyDeclaration#getAnonymousClassDeclarationOwner
	 * @model opposite="anonymousClassDeclarationOwner" containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Class Instance Creation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Instance Creation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #setClassInstanceCreation(ClassInstanceCreation)
	 * @see java_.Java_Package#getAnonymousClassDeclaration_ClassInstanceCreation()
	 * @see java_.ClassInstanceCreation#getAnonymousClassDeclaration
	 * @model opposite="anonymousClassDeclaration" transient="false" ordered="false"
	 * @generated
	 */
	ClassInstanceCreation getClassInstanceCreation();

	/**
	 * Sets the value of the '{@link java_.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	void setClassInstanceCreation(ClassInstanceCreation value);

} // AnonymousClassDeclaration
