package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ManifestAttributeBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements ManifestAttribute
{
	protected static final java.lang.String KEY_EDEFAULT = "";
	private java.lang.String _key = KEY_EDEFAULT;
	public java.lang.String getKey()
	{
		return _key;
	}
	public void setKey(java.lang.String value){
		
		java.lang.String oldValue = _key;
		_key = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MANIFESTATTRIBUTE_KEY, oldValue, value));
		
	}
	
	
	
	protected static final java.lang.String VALUE_EDEFAULT = "";
	private java.lang.String _value = VALUE_EDEFAULT;
	public java.lang.String getValue()
	{
		return _value;
	}
	public void setValue(java.lang.String value){
		
		java.lang.String oldValue = _value;
		_value = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MANIFESTATTRIBUTE_VALUE, oldValue, value));
		
	}
	
	
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MANIFESTATTRIBUTE;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
				return getKey();
			case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
				setKey((java.lang.String) newValue);
				return;
			case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
				setValue((java.lang.String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
				return KEY_EDEFAULT == null ? _key != null : !KEY_EDEFAULT.equals(_key);
			case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
				return VALUE_EDEFAULT == null ? _value != null : !VALUE_EDEFAULT.equals(_value);
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
