/**
 */
package java_.impl;

import java.util.Collection;

import java_.Java_Package;
import java_.Type;
import java_.TypeAccess;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.TypeImpl#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends NamedElementImpl implements Type {
	/**
	 * The cached value of the '{@link #getUsagesInTypeAccess() <em>Usages In Type Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> usagesInTypeAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.eINSTANCE.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAccess> getUsagesInTypeAccess() {
		if (usagesInTypeAccess == null) {
			usagesInTypeAccess = new EObjectWithInverseResolvingEList<TypeAccess>(TypeAccess.class, this, Java_Package.TYPE__USAGES_IN_TYPE_ACCESS, Java_Package.TYPE_ACCESS__TYPE);
		}
		return usagesInTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInTypeAccess()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				return ((InternalEList<?>)getUsagesInTypeAccess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((Collection<? extends TypeAccess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_Package.TYPE__USAGES_IN_TYPE_ACCESS:
				return usagesInTypeAccess != null && !usagesInTypeAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
