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
	private boolean _value = false;
	public boolean isValue()
	{
		return _value;
	}
	public void setValue(boolean value){
		
		boolean oldValue = _value;
		_value = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.BOOLEANLITERAL_VALUE, oldValue, value));
		
	}
	
	/*
	@Override
	public boolean isValue() {
		//return this.eGet();
		
		return false;
	}
	*/

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.BOOLEANLITERAL;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.BOOLEANLITERAL_VALUE:
				return isValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.BOOLEANLITERAL_VALUE:
				setValue((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
