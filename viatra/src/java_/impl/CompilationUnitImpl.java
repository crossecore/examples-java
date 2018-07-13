/**
 */
package java_.impl;

import java.util.Collection;

import java_.AbstractTypeDeclaration;
import java_.Comment;
import java_.CompilationUnit;
import java_.ImportDeclaration;
import java_.Java_Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.CompilationUnitImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_.impl.CompilationUnitImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link java_.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link java_.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link java_.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String originalFilePath = ORIGINAL_FILE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentList;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> imports;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected java_.Package package_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		String oldOriginalFilePath = originalFilePath;
		originalFilePath = newOriginalFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.COMPILATION_UNIT__ORIGINAL_FILE_PATH, oldOriginalFilePath, originalFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentList() {
		if (commentList == null) {
			commentList = new EObjectResolvingEList<Comment>(Comment.class, this, Java_Package.COMPILATION_UNIT__COMMENT_LIST);
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDeclaration> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, Java_Package.COMPILATION_UNIT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java_.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (java_.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_Package.COMPILATION_UNIT__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java_.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(java_.Package newPackage) {
		java_.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.COMPILATION_UNIT__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypeDeclaration> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_Package.COMPILATION_UNIT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.COMPILATION_UNIT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case Java_Package.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_Package.COMPILATION_UNIT__COMMENT_LIST:
				return getCommentList();
			case Java_Package.COMPILATION_UNIT__IMPORTS:
				return getImports();
			case Java_Package.COMPILATION_UNIT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case Java_Package.COMPILATION_UNIT__TYPES:
				return getTypes();
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
			case Java_Package.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				setOriginalFilePath((String)newValue);
				return;
			case Java_Package.COMPILATION_UNIT__COMMENT_LIST:
				getCommentList().clear();
				getCommentList().addAll((Collection<? extends Comment>)newValue);
				return;
			case Java_Package.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
				return;
			case Java_Package.COMPILATION_UNIT__PACKAGE:
				setPackage((java_.Package)newValue);
				return;
			case Java_Package.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
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
			case Java_Package.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				setOriginalFilePath(ORIGINAL_FILE_PATH_EDEFAULT);
				return;
			case Java_Package.COMPILATION_UNIT__COMMENT_LIST:
				getCommentList().clear();
				return;
			case Java_Package.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
			case Java_Package.COMPILATION_UNIT__PACKAGE:
				setPackage((java_.Package)null);
				return;
			case Java_Package.COMPILATION_UNIT__TYPES:
				getTypes().clear();
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
			case Java_Package.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return ORIGINAL_FILE_PATH_EDEFAULT == null ? originalFilePath != null : !ORIGINAL_FILE_PATH_EDEFAULT.equals(originalFilePath);
			case Java_Package.COMPILATION_UNIT__COMMENT_LIST:
				return commentList != null && !commentList.isEmpty();
			case Java_Package.COMPILATION_UNIT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Java_Package.COMPILATION_UNIT__PACKAGE:
				return package_ != null;
			case Java_Package.COMPILATION_UNIT__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (originalFilePath: ");
		result.append(originalFilePath);
		result.append(')');
		return result.toString();
	}

} //CompilationUnitImpl
