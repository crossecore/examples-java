/**
 */
package java_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_.Manifest#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link java_.Manifest#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @see java_.Java_Package#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link java_.ManifestAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Attributes</em>' containment reference list.
	 * @see java_.Java_Package#getManifest_MainAttributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ManifestAttribute> getMainAttributes();

	/**
	 * Returns the value of the '<em><b>Entry Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link java_.ManifestEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Attributes</em>' containment reference list.
	 * @see java_.Java_Package#getManifest_EntryAttributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ManifestEntry> getEntryAttributes();

} // Manifest
