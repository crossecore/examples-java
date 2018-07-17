/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getVariableDeclarationFragment()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Variables Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.AbstractVariablesContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Container</em>' container reference.
	 * @see #setVariablesContainer(AbstractVariablesContainer)
	 * @see java_.Java_Package#getVariableDeclarationFragment_VariablesContainer()
	 * @see java_.AbstractVariablesContainer#getFragments
	 * @model opposite="fragments" transient="false" ordered="false"
	 * @generated
	 */
	AbstractVariablesContainer getVariablesContainer();

	/**
	 * Sets the value of the '{@link java_.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables Container</em>' container reference.
	 * @see #getVariablesContainer()
	 * @generated
	 */
	void setVariablesContainer(AbstractVariablesContainer value);

} // VariableDeclarationFragment
