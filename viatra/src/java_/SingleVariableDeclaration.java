/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.SingleVariableDeclaration#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link java_.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getSingleVariableDeclaration()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link java_.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(Modifier)
	 * @see java_.Java_Package#getSingleVariableDeclaration_Modifier()
	 * @see java_.Modifier#getSingleVariableDeclaration
	 * @model opposite="singleVariableDeclaration" containment="true" ordered="false"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' attribute.
	 * @see #setVarargs(boolean)
	 * @see java_.Java_Package#getSingleVariableDeclaration_Varargs()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isVarargs();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#isVarargs <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs</em>' attribute.
	 * @see #isVarargs()
	 * @generated
	 */
	void setVarargs(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeAccess)
	 * @see java_.Java_Package#getSingleVariableDeclaration_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TypeAccess getType();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link java_.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see java_.Java_Package#getSingleVariableDeclaration_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Method Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.AbstractMethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Declaration</em>' container reference.
	 * @see #setMethodDeclaration(AbstractMethodDeclaration)
	 * @see java_.Java_Package#getSingleVariableDeclaration_MethodDeclaration()
	 * @see java_.AbstractMethodDeclaration#getParameters
	 * @model opposite="parameters" transient="false" ordered="false"
	 * @generated
	 */
	AbstractMethodDeclaration getMethodDeclaration();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Declaration</em>' container reference.
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	void setMethodDeclaration(AbstractMethodDeclaration value);

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.CatchClause#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Clause</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' container reference.
	 * @see #setCatchClause(CatchClause)
	 * @see java_.Java_Package#getSingleVariableDeclaration_CatchClause()
	 * @see java_.CatchClause#getException
	 * @model opposite="exception" transient="false" ordered="false"
	 * @generated
	 */
	CatchClause getCatchClause();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Clause</em>' container reference.
	 * @see #getCatchClause()
	 * @generated
	 */
	void setCatchClause(CatchClause value);

	/**
	 * Returns the value of the '<em><b>Enhanced For Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.EnhancedForStatement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhanced For Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced For Statement</em>' container reference.
	 * @see #setEnhancedForStatement(EnhancedForStatement)
	 * @see java_.Java_Package#getSingleVariableDeclaration_EnhancedForStatement()
	 * @see java_.EnhancedForStatement#getParameter
	 * @model opposite="parameter" transient="false" ordered="false"
	 * @generated
	 */
	EnhancedForStatement getEnhancedForStatement();

	/**
	 * Sets the value of the '{@link java_.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhanced For Statement</em>' container reference.
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	void setEnhancedForStatement(EnhancedForStatement value);

} // SingleVariableDeclaration
