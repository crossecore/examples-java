/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.NumberLiteral#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Token Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Value</em>' attribute.
	 * @see #setTokenValue(String)
	 * @see java_.Java_Package#getNumberLiteral_TokenValue()
	 * @model unique="false" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_!NumberLiteral!tokenValue'"
	 * @generated
	 */
	String getTokenValue();

	/**
	 * Sets the value of the '{@link java_.NumberLiteral#getTokenValue <em>Token Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Value</em>' attribute.
	 * @see #getTokenValue()
	 * @generated
	 */
	void setTokenValue(String value);

} // NumberLiteral
