/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.AssertStatement#getMessage <em>Message</em>}</li>
 *   <li>{@link java_.AssertStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getAssertStatement()
 * @model
 * @generated
 */
public interface AssertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Expression)
	 * @see java_.Java_Package#getAssertStatement_Message()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getMessage();

	/**
	 * Sets the value of the '{@link java_.AssertStatement#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see java_.Java_Package#getAssertStatement_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link java_.AssertStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // AssertStatement
