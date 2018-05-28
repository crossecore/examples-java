package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class NumberLiteralBase 
extends ExpressionImpl implements NumberLiteral
{
	private java.lang.String _tokenValue = "";
	public java.lang.String getTokenValue()
	{
		return _tokenValue;
	}
	public void setTokenValue(java.lang.String value){
		
		java.lang.String oldValue = _tokenValue;
		_tokenValue = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.NUMBERLITERAL_TOKENVALUE, oldValue, value));
		
	}
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.NUMBERLITERAL;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.NUMBERLITERAL_TOKENVALUE:
				return getTokenValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.NUMBERLITERAL_TOKENVALUE:
				setTokenValue((java.lang.String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
