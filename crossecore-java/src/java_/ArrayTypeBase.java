package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ArrayTypeBase 
extends TypeImpl implements ArrayType
{
	protected static final int DIMENSIONS_EDEFAULT = 0;
	private int _dimensions = DIMENSIONS_EDEFAULT;
	public int getDimensions()
	{
		return _dimensions;
	}
	public void setDimensions(int value){
		
		int oldValue = _dimensions;
		_dimensions = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.ARRAY_TYPE__DIMENSIONS, oldValue, value));
		
	}
	
	
	
	private TypeAccess _elementType;
	public TypeAccess getElementType()
	{
		
			return _elementType;
		
		
	}
	public void setElementType(TypeAccess value){
		if (value != _elementType) {
			NotificationChain msgs = null;
			if (_elementType != null){
				msgs = ((InternalEObject)_elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
			}
			msgs = basicSetElementType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ARRAYTYPE;
	}
	
	
	public NotificationChain basicSetElementType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _elementType;
		_elementType = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE, oldobj, newobj);
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
			case Java_PackageImpl.ARRAY_TYPE__DIMENSIONS:
				return getDimensions();
			case Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE:
				return getElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_TYPE__DIMENSIONS:
				setDimensions((int) newValue);
				return;
			case Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE:
				setElementType((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_TYPE__DIMENSIONS:
				return _dimensions != DIMENSIONS_EDEFAULT;
			case Java_PackageImpl.ARRAY_TYPE__ELEMENT_TYPE:
				return _elementType != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
