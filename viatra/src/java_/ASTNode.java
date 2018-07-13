/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.ASTNode#getComments <em>Comments</em>}</li>
 *   <li>{@link java_.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link java_.ASTNode#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getASTNode()
 * @model abstract="true"
 * @generated
 */
public interface ASTNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link java_.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see java_.Java_Package#getASTNode_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Compilation Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Compilation Unit</em>' reference.
	 * @see #setOriginalCompilationUnit(CompilationUnit)
	 * @see java_.Java_Package#getASTNode_OriginalCompilationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	CompilationUnit getOriginalCompilationUnit();

	/**
	 * Sets the value of the '{@link java_.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Compilation Unit</em>' reference.
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 */
	void setOriginalCompilationUnit(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Class File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Class File</em>' reference.
	 * @see #setOriginalClassFile(ClassFile)
	 * @see java_.Java_Package#getASTNode_OriginalClassFile()
	 * @model ordered="false"
	 * @generated
	 */
	ClassFile getOriginalClassFile();

	/**
	 * Sets the value of the '{@link java_.ASTNode#getOriginalClassFile <em>Original Class File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Class File</em>' reference.
	 * @see #getOriginalClassFile()
	 * @generated
	 */
	void setOriginalClassFile(ClassFile value);

} // ASTNode
