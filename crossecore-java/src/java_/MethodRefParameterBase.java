package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class MethodRefParameterBase 
extends ASTNodeImpl implements MethodRefParameter
{
	protected static final java.lang.String NAME_EDEFAULT = "";
	private java.lang.String _name = NAME_EDEFAULT;
	public java.lang.String getName()
	{
		return _name;
	}
	public void setName(java.lang.String value){
		
		java.lang.String oldValue = _name;
		_name = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.METHOD_REF_PARAMETER__NAME, oldValue, value));
		
	}
	
	
	
	protected static final boolean VARARGS_EDEFAULT = false;
	private boolean _varargs = VARARGS_EDEFAULT;
	public boolean isVarargs()
	{
		return _varargs;
	}
	public void setVarargs(boolean value){
		
		boolean oldValue = _varargs;
		_varargs = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.METHOD_REF_PARAMETER__VARARGS, oldValue, value));
		
	}
	
	
	
	private TypeAccess _type;
	public TypeAccess getType()
	{
		
			return _type;
		
		
	}
	public void setType(TypeAccess value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_REF_PARAMETER__TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_REF_PARAMETER__TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHOD_REF_PARAMETER__TYPE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.METHODREFPARAMETER;
	}
	
	
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHOD_REF_PARAMETER__TYPE, oldobj, newobj);
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
			case Java_PackageImpl.METHOD_REF_PARAMETER__NAME:
				return getName();
			case Java_PackageImpl.METHOD_REF_PARAMETER__VARARGS:
				return isVarargs();
			case Java_PackageImpl.METHOD_REF_PARAMETER__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF_PARAMETER__NAME:
				setName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.METHOD_REF_PARAMETER__VARARGS:
				setVarargs((boolean) newValue);
				return;
			case Java_PackageImpl.METHOD_REF_PARAMETER__TYPE:
				setType((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
			case Java_PackageImpl.METHOD_REF_PARAMETER__VARARGS:
				return _varargs != VARARGS_EDEFAULT;
			case Java_PackageImpl.METHOD_REF_PARAMETER__TYPE:
				return _type != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
