/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.EnumConstantDeclaration#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link java_.EnumConstantDeclaration#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getEnumConstantDeclaration()
 * @model
 * @generated
 */
public interface EnumConstantDeclaration extends BodyDeclaration, VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Class Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' containment reference.
	 * @see #setAnonymousClassDeclaration(AnonymousClassDeclaration)
	 * @see java_.Java_Package#getEnumConstantDeclaration_AnonymousClassDeclaration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AnonymousClassDeclaration getAnonymousClassDeclaration();

	/**
	 * Sets the value of the '{@link java_.EnumConstantDeclaration#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Class Declaration</em>' containment reference.
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link java_.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see java_.Java_Package#getEnumConstantDeclaration_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // EnumConstantDeclaration
