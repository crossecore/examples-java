package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CommentBase 
extends ASTNodeImpl implements Comment
{
	protected static final java.lang.String CONTENT_EDEFAULT = "";
	private java.lang.String _content = CONTENT_EDEFAULT;
	public java.lang.String getContent()
	{
		return _content;
	}
	public void setContent(java.lang.String value){
		
		java.lang.String oldValue = _content;
		_content = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.COMMENT_CONTENT, oldValue, value));
		
	}
	
	
	
	protected static final boolean ENCLOSEDBYPARENT_EDEFAULT = false;
	private boolean _enclosedByParent = ENCLOSEDBYPARENT_EDEFAULT;
	public boolean isEnclosedByParent()
	{
		return _enclosedByParent;
	}
	public void setEnclosedByParent(boolean value){
		
		boolean oldValue = _enclosedByParent;
		_enclosedByParent = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT, oldValue, value));
		
	}
	
	
	
	protected static final boolean PREFIXOFPARENT_EDEFAULT = false;
	private boolean _prefixOfParent = PREFIXOFPARENT_EDEFAULT;
	public boolean isPrefixOfParent()
	{
		return _prefixOfParent;
	}
	public void setPrefixOfParent(boolean value){
		
		boolean oldValue = _prefixOfParent;
		_prefixOfParent = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.COMMENT_PREFIXOFPARENT, oldValue, value));
		
	}
	
	
	

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.COMMENT;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.COMMENT_CONTENT:
				return getContent();
			case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
				return isEnclosedByParent();
			case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
				return isPrefixOfParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.COMMENT_CONTENT:
				setContent((java.lang.String) newValue);
				return;
			case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
				setEnclosedByParent((boolean) newValue);
				return;
			case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
				setPrefixOfParent((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.COMMENT_CONTENT:
				return CONTENT_EDEFAULT == null ? _content != null : !CONTENT_EDEFAULT.equals(_content);
			case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
				return _enclosedByParent != ENCLOSEDBYPARENT_EDEFAULT;
			case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
				return _prefixOfParent != PREFIXOFPARENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
