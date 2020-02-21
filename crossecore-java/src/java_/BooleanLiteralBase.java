package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class BooleanLiteralBase 
extends ExpressionImpl implements BooleanLiteral
{
	protected static final boolean VALUE_EDEFAULT = false;
	private boolean _value = VALUE_EDEFAULT;
	public boolean isValue()
	{
		return _value;
	}
	public void setValue(boolean value){
		
		boolean oldValue = _value;
		_value = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.BOOLEAN_LITERAL__VALUE, oldValue, value));
		
	}
	
	
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.BOOLEANLITERAL;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.BOOLEAN_LITERAL__VALUE:
				return isValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.BOOLEAN_LITERAL__VALUE:
				setValue((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.BOOLEAN_LITERAL__VALUE:
				return _value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
