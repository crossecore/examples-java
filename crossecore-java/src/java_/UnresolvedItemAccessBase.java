package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class UnresolvedItemAccessBase 
extends ExpressionImpl implements UnresolvedItemAccess
{
	private UnresolvedItem _element;
	public UnresolvedItem getElement()
	{
		
			return _element;
		
		
	}
	public void setElement(UnresolvedItem value){
		UnresolvedItem oldvalue = _element;
		_element = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT , oldvalue, value));
		}
	}
	private ASTNode _qualifier;
	public ASTNode getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(ASTNode value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.UNRESOLVEDITEMACCESS;
	}
	
	
	public NotificationChain basicSetQualifier(ASTNode newobj, NotificationChain msgs) {
		ASTNode oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetElement(UnresolvedItem newobj, NotificationChain msgs) {
		UnresolvedItem oldobj = _element;
		_element = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT:
				return getElement();
			case Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER:
				return getQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT:
				setElement((UnresolvedItem) newValue);
				return;
			case Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER:
				setQualifier((ASTNode) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
