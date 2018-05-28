package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TextElementBase 
extends ASTNodeImpl implements TextElement
{
	private java.lang.String _text = "";
	public java.lang.String getText()
	{
		return _text;
	}
	public void setText(java.lang.String value){
		
		java.lang.String oldValue = _text;
		_text = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.TEXTELEMENT_TEXT, oldValue, value));
		
	}
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TEXTELEMENT;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TEXTELEMENT_TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TEXTELEMENT_TEXT:
				setText((java.lang.String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
