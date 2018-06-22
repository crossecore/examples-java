package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SuperFieldAccessBase 
extends AbstractTypeQualifiedExpressionImpl implements SuperFieldAccess
{
	private SingleVariableAccess _field;
	public SingleVariableAccess getField()
	{
		
			return _field;
		
		
	}
	public void setField(SingleVariableAccess value){
		if (value != _field) {
			NotificationChain msgs = null;
			if (_field != null){
				msgs = ((InternalEObject)_field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERFIELDACCESS_FIELD, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERFIELDACCESS_FIELD, null, msgs);
			}
			msgs = basicSetField(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SUPERFIELDACCESS_FIELD , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SUPERFIELDACCESS;
	}
	
	
	public NotificationChain basicSetField(SingleVariableAccess newobj, NotificationChain msgs) {
		SingleVariableAccess oldobj = _field;
		_field = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SUPERFIELDACCESS_FIELD, oldobj, newobj);
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
			case Java_PackageImpl.SUPERFIELDACCESS_FIELD:
				return getField();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SUPERFIELDACCESS_FIELD:
				setField((SingleVariableAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.SUPERFIELDACCESS_FIELD:
				return _field != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
