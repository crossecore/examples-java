/**
 */
package java_.impl;

import java_.Comment;
import java_.Java_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.CommentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link java_.impl.CommentImpl#isEnclosedByParent <em>Enclosed By Parent</em>}</li>
 *   <li>{@link java_.impl.CommentImpl#isPrefixOfParent <em>Prefix Of Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommentImpl extends ASTNodeImpl implements Comment {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnclosedByParent() <em>Enclosed By Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnclosedByParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCLOSED_BY_PARENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnclosedByParent() <em>Enclosed By Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnclosedByParent()
	 * @generated
	 * @ordered
	 */
	protected boolean enclosedByParent = ENCLOSED_BY_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrefixOfParent() <em>Prefix Of Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrefixOfParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFIX_OF_PARENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrefixOfParent() <em>Prefix Of Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrefixOfParent()
	 * @generated
	 * @ordered
	 */
	protected boolean prefixOfParent = PREFIX_OF_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.COMMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnclosedByParent() {
		return enclosedByParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosedByParent(boolean newEnclosedByParent) {
		boolean oldEnclosedByParent = enclosedByParent;
		enclosedByParent = newEnclosedByParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.COMMENT__ENCLOSED_BY_PARENT, oldEnclosedByParent, enclosedByParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrefixOfParent() {
		return prefixOfParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixOfParent(boolean newPrefixOfParent) {
		boolean oldPrefixOfParent = prefixOfParent;
		prefixOfParent = newPrefixOfParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.COMMENT__PREFIX_OF_PARENT, oldPrefixOfParent, prefixOfParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.COMMENT__CONTENT:
				return getContent();
			case Java_Package.COMMENT__ENCLOSED_BY_PARENT:
				return isEnclosedByParent();
			case Java_Package.COMMENT__PREFIX_OF_PARENT:
				return isPrefixOfParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_Package.COMMENT__CONTENT:
				setContent((String)newValue);
				return;
			case Java_Package.COMMENT__ENCLOSED_BY_PARENT:
				setEnclosedByParent((Boolean)newValue);
				return;
			case Java_Package.COMMENT__PREFIX_OF_PARENT:
				setPrefixOfParent((Boolean)newValue);
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
			case Java_Package.COMMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Java_Package.COMMENT__ENCLOSED_BY_PARENT:
				setEnclosedByParent(ENCLOSED_BY_PARENT_EDEFAULT);
				return;
			case Java_Package.COMMENT__PREFIX_OF_PARENT:
				setPrefixOfParent(PREFIX_OF_PARENT_EDEFAULT);
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
			case Java_Package.COMMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Java_Package.COMMENT__ENCLOSED_BY_PARENT:
				return enclosedByParent != ENCLOSED_BY_PARENT_EDEFAULT;
			case Java_Package.COMMENT__PREFIX_OF_PARENT:
				return prefixOfParent != PREFIX_OF_PARENT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(", enclosedByParent: ");
		result.append(enclosedByParent);
		result.append(", prefixOfParent: ");
		result.append(prefixOfParent);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
