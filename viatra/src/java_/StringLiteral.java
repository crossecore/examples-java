/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.StringLiteral#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Escaped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escaped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escaped Value</em>' attribute.
	 * @see #setEscapedValue(String)
	 * @see java_.Java_Package#getStringLiteral_EscapedValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEscapedValue();

	/**
	 * Sets the value of the '{@link java_.StringLiteral#getEscapedValue <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escaped Value</em>' attribute.
	 * @see #getEscapedValue()
	 * @generated
	 */
	void setEscapedValue(String value);

} // StringLiteral
