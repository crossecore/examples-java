/**
 */
package java_.impl;

import java_.Java_Package;
import java_.NumberLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.NumberLiteralImpl#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberLiteralImpl extends ExpressionImpl implements NumberLiteral {
	/**
	 * The default value of the '{@link #getTokenValue() <em>Token Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenValue() <em>Token Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenValue()
	 * @generated
	 * @ordered
	 */
	protected String tokenValue = TOKEN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.NUMBER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenValue() {
		return tokenValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenValue(String newTokenValue) {
		String oldTokenValue = tokenValue;
		tokenValue = newTokenValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.NUMBER_LITERAL__TOKEN_VALUE, oldTokenValue, tokenValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.NUMBER_LITERAL__TOKEN_VALUE:
				return getTokenValue();
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
			case Java_Package.NUMBER_LITERAL__TOKEN_VALUE:
				setTokenValue((String)newValue);
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
			case Java_Package.NUMBER_LITERAL__TOKEN_VALUE:
				setTokenValue(TOKEN_VALUE_EDEFAULT);
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
			case Java_Package.NUMBER_LITERAL__TOKEN_VALUE:
				return TOKEN_VALUE_EDEFAULT == null ? tokenValue != null : !TOKEN_VALUE_EDEFAULT.equals(tokenValue);
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
		result.append(" (tokenValue: ");
		result.append(tokenValue);
		result.append(')');
		return result.toString();
	}

} //NumberLiteralImpl
