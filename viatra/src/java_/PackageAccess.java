/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.PackageAccess#getPackage <em>Package</em>}</li>
 *   <li>{@link java_.PackageAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getPackageAccess()
 * @model
 * @generated
 */
public interface PackageAccess extends NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link java_.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(java_.Package)
	 * @see java_.Java_Package#getPackageAccess_Package()
	 * @see java_.Package#getUsagesInPackageAccess
	 * @model opposite="usagesInPackageAccess" required="true" ordered="false"
	 * @generated
	 */
	java_.Package getPackage();

	/**
	 * Sets the value of the '{@link java_.PackageAccess#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(java_.Package value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(PackageAccess)
	 * @see java_.Java_Package#getPackageAccess_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PackageAccess getQualifier();

	/**
	 * Sets the value of the '{@link java_.PackageAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(PackageAccess value);

} // PackageAccess
