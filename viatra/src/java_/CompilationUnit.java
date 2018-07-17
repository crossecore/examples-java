/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_.CompilationUnit#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link java_.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link java_.CompilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link java_.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute.
	 * @see #setOriginalFilePath(String)
	 * @see java_.Java_Package#getCompilationUnit_OriginalFilePath()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOriginalFilePath();

	/**
	 * Sets the value of the '{@link java_.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Path</em>' attribute.
	 * @see #getOriginalFilePath()
	 * @generated
	 */
	void setOriginalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' reference list.
	 * The list contents are of type {@link java_.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' reference list.
	 * @see java_.Java_Package#getCompilationUnit_CommentList()
	 * @model
	 * @generated
	 */
	EList<Comment> getCommentList();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link java_.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see java_.Java_Package#getCompilationUnit_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportDeclaration> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(java_.Package)
	 * @see java_.Java_Package#getCompilationUnit_Package()
	 * @model ordered="false"
	 * @generated
	 */
	java_.Package getPackage();

	/**
	 * Sets the value of the '{@link java_.CompilationUnit#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(java_.Package value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link java_.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see java_.Java_Package#getCompilationUnit_Types()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getTypes();

} // CompilationUnit
