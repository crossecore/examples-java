/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_.MethodDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link java_.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link java_.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends AbstractMethodDeclaration {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Array Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #setExtraArrayDimensions(int)
	 * @see java_.Java_Package#getMethodDeclaration_ExtraArrayDimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getExtraArrayDimensions();

	/**
	 * Sets the value of the '{@link java_.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #getExtraArrayDimensions()
	 * @generated
	 */
	void setExtraArrayDimensions(int value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeAccess)
	 * @see java_.Java_Package#getMethodDeclaration_ReturnType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TypeAccess getReturnType();

	/**
	 * Sets the value of the '{@link java_.MethodDeclaration#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Redefined Method Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link java_.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Method Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Method Declaration</em>' reference.
	 * @see #setRedefinedMethodDeclaration(MethodDeclaration)
	 * @see java_.Java_Package#getMethodDeclaration_RedefinedMethodDeclaration()
	 * @see java_.MethodDeclaration#getRedefinitions
	 * @model opposite="redefinitions" ordered="false"
	 * @generated
	 */
	MethodDeclaration getRedefinedMethodDeclaration();

	/**
	 * Sets the value of the '{@link java_.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Method Declaration</em>' reference.
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 */
	void setRedefinedMethodDeclaration(MethodDeclaration value);

	/**
	 * Returns the value of the '<em><b>Redefinitions</b></em>' reference list.
	 * The list contents are of type {@link java_.MethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefinitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinitions</em>' reference list.
	 * @see java_.Java_Package#getMethodDeclaration_Redefinitions()
	 * @see java_.MethodDeclaration#getRedefinedMethodDeclaration
	 * @model opposite="redefinedMethodDeclaration" ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration> getRedefinitions();

} // MethodDeclaration
