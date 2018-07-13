/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Item Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.UnresolvedItemAccess#getElement <em>Element</em>}</li>
 *   <li>{@link java_.UnresolvedItemAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getUnresolvedItemAccess()
 * @model
 * @generated
 */
public interface UnresolvedItemAccess extends Expression, NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(UnresolvedItem)
	 * @see java_.Java_Package#getUnresolvedItemAccess_Element()
	 * @model ordered="false"
	 * @generated
	 */
	UnresolvedItem getElement();

	/**
	 * Sets the value of the '{@link java_.UnresolvedItemAccess#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(UnresolvedItem value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(ASTNode)
	 * @see java_.Java_Package#getUnresolvedItemAccess_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ASTNode getQualifier();

	/**
	 * Sets the value of the '{@link java_.UnresolvedItemAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(ASTNode value);

} // UnresolvedItemAccess
