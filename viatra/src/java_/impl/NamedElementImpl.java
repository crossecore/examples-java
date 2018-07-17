/**
 */
package java_.impl;

import java.util.Collection;

import java_.ImportDeclaration;
import java_.Java_Package;
import java_.NamedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link java_.impl.NamedElementImpl#isProxy <em>Proxy</em>}</li>
 *   <li>{@link java_.impl.NamedElementImpl#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends ASTNodeImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROXY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProxy()
	 * @generated
	 * @ordered
	 */
	protected boolean proxy = PROXY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsagesInImports() <em>Usages In Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> usagesInImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(boolean newProxy) {
		boolean oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.NAMED_ELEMENT__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDeclaration> getUsagesInImports() {
		if (usagesInImports == null) {
			usagesInImports = new EObjectWithInverseResolvingEList<ImportDeclaration>(ImportDeclaration.class, this, Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS, Java_Package.IMPORT_DECLARATION__IMPORTED_ELEMENT);
		}
		return usagesInImports;
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
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInImports()).basicAdd(otherEnd, msgs);
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
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return ((InternalEList<?>)getUsagesInImports()).basicRemove(otherEnd, msgs);
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
			case Java_Package.NAMED_ELEMENT__NAME:
				return getName();
			case Java_Package.NAMED_ELEMENT__PROXY:
				return isProxy();
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return getUsagesInImports();
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
			case Java_Package.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Java_Package.NAMED_ELEMENT__PROXY:
				setProxy((Boolean)newValue);
				return;
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
				getUsagesInImports().addAll((Collection<? extends ImportDeclaration>)newValue);
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
			case Java_Package.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Java_Package.NAMED_ELEMENT__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
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
			case Java_Package.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Java_Package.NAMED_ELEMENT__PROXY:
				return proxy != PROXY_EDEFAULT;
			case Java_Package.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return usagesInImports != null && !usagesInImports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", proxy: ");
		result.append(proxy);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
