/**
 */
package java_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.Modifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link java_.Modifier#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link java_.Modifier#isStatic <em>Static</em>}</li>
 *   <li>{@link java_.Modifier#isTransient <em>Transient</em>}</li>
 *   <li>{@link java_.Modifier#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link java_.Modifier#isNative <em>Native</em>}</li>
 *   <li>{@link java_.Modifier#isStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link java_.Modifier#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link java_.Modifier#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link java_.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link java_.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link java_.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link java_.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see java_.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see java_.Java_Package#getModifier_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link java_.Modifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see java_.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute.
	 * The literals are from the enumeration {@link java_.InheritanceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see java_.InheritanceKind
	 * @see #setInheritance(InheritanceKind)
	 * @see java_.Java_Package#getModifier_Inheritance()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	InheritanceKind getInheritance();

	/**
	 * Sets the value of the '{@link java_.Modifier#getInheritance <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see java_.InheritanceKind
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(InheritanceKind value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see java_.Java_Package#getModifier_Static()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link java_.Modifier#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see java_.Java_Package#getModifier_Transient()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link java_.Modifier#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see java_.Java_Package#getModifier_Volatile()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link java_.Modifier#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see java_.Java_Package#getModifier_Native()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link java_.Modifier#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Strictfp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strictfp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strictfp</em>' attribute.
	 * @see #setStrictfp(boolean)
	 * @see java_.Java_Package#getModifier_Strictfp()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isStrictfp();

	/**
	 * Sets the value of the '{@link java_.Modifier#isStrictfp <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strictfp</em>' attribute.
	 * @see #isStrictfp()
	 * @generated
	 */
	void setStrictfp(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see java_.Java_Package#getModifier_Synchronized()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link java_.Modifier#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.BodyDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declaration</em>' container reference.
	 * @see #setBodyDeclaration(BodyDeclaration)
	 * @see java_.Java_Package#getModifier_BodyDeclaration()
	 * @see java_.BodyDeclaration#getModifier
	 * @model opposite="modifier" transient="false" ordered="false"
	 * @generated
	 */
	BodyDeclaration getBodyDeclaration();

	/**
	 * Sets the value of the '{@link java_.Modifier#getBodyDeclaration <em>Body Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Declaration</em>' container reference.
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	void setBodyDeclaration(BodyDeclaration value);

	/**
	 * Returns the value of the '<em><b>Single Variable Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.SingleVariableDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Variable Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Variable Declaration</em>' container reference.
	 * @see #setSingleVariableDeclaration(SingleVariableDeclaration)
	 * @see java_.Java_Package#getModifier_SingleVariableDeclaration()
	 * @see java_.SingleVariableDeclaration#getModifier
	 * @model opposite="modifier" transient="false" ordered="false"
	 * @generated
	 */
	SingleVariableDeclaration getSingleVariableDeclaration();

	/**
	 * Sets the value of the '{@link java_.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Variable Declaration</em>' container reference.
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	void setSingleVariableDeclaration(SingleVariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.VariableDeclarationStatement#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #setVariableDeclarationStatement(VariableDeclarationStatement)
	 * @see java_.Java_Package#getModifier_VariableDeclarationStatement()
	 * @see java_.VariableDeclarationStatement#getModifier
	 * @model opposite="modifier" transient="false" ordered="false"
	 * @generated
	 */
	VariableDeclarationStatement getVariableDeclarationStatement();

	/**
	 * Sets the value of the '{@link java_.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	void setVariableDeclarationStatement(VariableDeclarationStatement value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link java_.VariableDeclarationExpression#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #setVariableDeclarationExpression(VariableDeclarationExpression)
	 * @see java_.Java_Package#getModifier_VariableDeclarationExpression()
	 * @see java_.VariableDeclarationExpression#getModifier
	 * @model opposite="modifier" transient="false" ordered="false"
	 * @generated
	 */
	VariableDeclarationExpression getVariableDeclarationExpression();

	/**
	 * Sets the value of the '{@link java_.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	void setVariableDeclarationExpression(VariableDeclarationExpression value);

} // Modifier
