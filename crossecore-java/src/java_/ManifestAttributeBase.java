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
	private java.lang.String _key = "";
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
	
	private java.lang.String _value = "";
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
	
	
}
