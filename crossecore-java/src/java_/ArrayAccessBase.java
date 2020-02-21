package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ArrayAccessBase 
extends ExpressionImpl implements ArrayAccess
{
	private Expression _array;
	public Expression getArray()
	{
		
			return _array;
		
		
	}
	public void setArray(Expression value){
		if (value != _array) {
			NotificationChain msgs = null;
			if (_array != null){
				msgs = ((InternalEObject)_array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_ACCESS__ARRAY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_ACCESS__ARRAY, null, msgs);
			}
			msgs = basicSetArray(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAY_ACCESS__ARRAY , value, value));
		}
	}
	private Expression _index;
	public Expression getIndex()
	{
		
			return _index;
		
		
	}
	public void setIndex(Expression value){
		if (value != _index) {
			NotificationChain msgs = null;
			if (_index != null){
				msgs = ((InternalEObject)_index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_ACCESS__INDEX, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_ACCESS__INDEX, null, msgs);
			}
			msgs = basicSetIndex(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAY_ACCESS__INDEX , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ARRAYACCESS;
	}
	
	
	public NotificationChain basicSetArray(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _array;
		_array = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAY_ACCESS__ARRAY, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetIndex(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _index;
		_index = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAY_ACCESS__INDEX, oldobj, newobj);
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
			case Java_PackageImpl.ARRAY_ACCESS__ARRAY:
				return getArray();
			case Java_PackageImpl.ARRAY_ACCESS__INDEX:
				return getIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_ACCESS__ARRAY:
				setArray((Expression) newValue);
				return;
			case Java_PackageImpl.ARRAY_ACCESS__INDEX:
				setIndex((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_ACCESS__ARRAY:
				return _array != null; //single != null;
			case Java_PackageImpl.ARRAY_ACCESS__INDEX:
				return _index != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
