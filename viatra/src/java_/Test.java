/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.Test#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * The list contents are of type {@link java_.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' reference list.
	 * @see java_.Java_Package#getTest_ThrownExceptions()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Sequence{}'"
	 * @generated
	 */
	EList<TypeAccess> getThrownExceptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ClassDeclaration.allInstances()-&gt;collect(bodyDeclarations)-&gt;select(each | each.oclIsTypeOf(MethodDeclaration))-&gt;select(each | (not each.modifier.oclIsUndefined()) and (not each.modifier.visibility.oclIsUndefined()) and (each.modifier.visibility = VisibilityKind::private or each.modifier.visibility = VisibilityKind::protected))-&gt;asSequence()'"
	 * @generated
	 */
	EList<BodyDeclaration> thrownExceptions2();

} // Test
