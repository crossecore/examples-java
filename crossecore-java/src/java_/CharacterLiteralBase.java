package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CharacterLiteralBase 
extends ExpressionImpl implements CharacterLiteral
{
	protected static final java.lang.String ESCAPEDVALUE_EDEFAULT = "";
	private java.lang.String _escapedValue = ESCAPEDVALUE_EDEFAULT;
	public java.lang.String getEscapedValue()
	{
		return _escapedValue;
	}
	public void setEscapedValue(java.lang.String value){
		
		java.lang.String oldValue = _escapedValue;
		_escapedValue = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.CHARACTER_LITERAL__ESCAPED_VALUE, oldValue, value));
		
	}
	
	
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CHARACTERLITERAL;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.CHARACTER_LITERAL__ESCAPED_VALUE:
				return getEscapedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CHARACTER_LITERAL__ESCAPED_VALUE:
				setEscapedValue((java.lang.String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CHARACTER_LITERAL__ESCAPED_VALUE:
				return ESCAPEDVALUE_EDEFAULT == null ? _escapedValue != null : !ESCAPEDVALUE_EDEFAULT.equals(_escapedValue);
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
