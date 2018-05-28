/**
 */
package java_.impl;

import java.util.Collection;

import java_.AbstractTypeDeclaration;
import java_.Java_Package;
import java_.Model;
import java_.PackageAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.PackageImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link java_.impl.PackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link java_.impl.PackageImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link java_.impl.PackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link java_.impl.PackageImpl#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements java_.Package {
	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> ownedElements;

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<java_.Package> ownedPackages;

	/**
	 * The cached value of the '{@link #getUsagesInPackageAccess() <em>Usages In Package Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInPackageAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAccess> usagesInPackageAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeDeclaration> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentWithInverseEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_Package.PACKAGE__OWNED_ELEMENTS, Java_Package.ABSTRACT_TYPE_DECLARATION__PACKAGE);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != Java_Package.PACKAGE__MODEL) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, Java_Package.PACKAGE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != Java_Package.PACKAGE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, Java_Package.MODEL__OWNED_ELEMENTS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.PACKAGE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<java_.Package> getOwnedPackages() {
		if (ownedPackages == null) {
			ownedPackages = new EObjectContainmentWithInverseEList<java_.Package>(java_.Package.class, this, Java_Package.PACKAGE__OWNED_PACKAGES, Java_Package.PACKAGE__PACKAGE);
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java_.Package getPackage() {
		if (eContainerFeatureID() != Java_Package.PACKAGE__PACKAGE) return null;
		return (java_.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(java_.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, Java_Package.PACKAGE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(java_.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != Java_Package.PACKAGE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, Java_Package.PACKAGE__OWNED_PACKAGES, java_.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.PACKAGE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageAccess> getUsagesInPackageAccess() {
		if (usagesInPackageAccess == null) {
			usagesInPackageAccess = new EObjectWithInverseResolvingEList<PackageAccess>(PackageAccess.class, this, Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Java_Package.PACKAGE_ACCESS__PACKAGE);
		}
		return usagesInPackageAccess;
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
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElements()).basicAdd(otherEnd, msgs);
			case Java_Package.PACKAGE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedPackages()).basicAdd(otherEnd, msgs);
			case Java_Package.PACKAGE__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((java_.Package)otherEnd, msgs);
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInPackageAccess()).basicAdd(otherEnd, msgs);
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
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case Java_Package.PACKAGE__MODEL:
				return basicSetModel(null, msgs);
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case Java_Package.PACKAGE__PACKAGE:
				return basicSetPackage(null, msgs);
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return ((InternalEList<?>)getUsagesInPackageAccess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Java_Package.PACKAGE__MODEL:
				return eInternalContainer().eInverseRemove(this, Java_Package.MODEL__OWNED_ELEMENTS, Model.class, msgs);
			case Java_Package.PACKAGE__PACKAGE:
				return eInternalContainer().eInverseRemove(this, Java_Package.PACKAGE__OWNED_PACKAGES, java_.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_Package.PACKAGE__MODEL:
				return getModel();
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages();
			case Java_Package.PACKAGE__PACKAGE:
				return getPackage();
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess();
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
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
				return;
			case Java_Package.PACKAGE__MODEL:
				setModel((Model)newValue);
				return;
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends java_.Package>)newValue);
				return;
			case Java_Package.PACKAGE__PACKAGE:
				setPackage((java_.Package)newValue);
				return;
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
				getUsagesInPackageAccess().addAll((Collection<? extends PackageAccess>)newValue);
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
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java_Package.PACKAGE__MODEL:
				setModel((Model)null);
				return;
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case Java_Package.PACKAGE__PACKAGE:
				setPackage((java_.Package)null);
				return;
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
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
			case Java_Package.PACKAGE__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java_Package.PACKAGE__MODEL:
				return getModel() != null;
			case Java_Package.PACKAGE__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case Java_Package.PACKAGE__PACKAGE:
				return getPackage() != null;
			case Java_Package.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return usagesInPackageAccess != null && !usagesInPackageAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
