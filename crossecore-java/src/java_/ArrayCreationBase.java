package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ArrayCreationBase 
extends ExpressionImpl implements ArrayCreation
{
	private com.crossecore.ocl.OrderedSet<Expression> _dimensions;
	
	public com.crossecore.ocl.OrderedSet<Expression> getDimensions()
	{
		if(_dimensions==null){
			_dimensions = new com.crossecore.ocl.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ARRAY_CREATION__DIMENSIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_CREATION__DIMENSIONS);
		}
		return _dimensions;
	
	}
	private ArrayInitializer _initializer;
	public ArrayInitializer getInitializer()
	{
		
			return _initializer;
		
		
	}
	public void setInitializer(ArrayInitializer value){
		if (value != _initializer) {
			NotificationChain msgs = null;
			if (_initializer != null){
				msgs = ((InternalEObject)_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_CREATION__INITIALIZER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_CREATION__INITIALIZER, null, msgs);
			}
			msgs = basicSetInitializer(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAY_CREATION__INITIALIZER , value, value));
		}
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
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_CREATION__TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_CREATION__TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAY_CREATION__TYPE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ARRAYCREATION;
	}
	
	
	public NotificationChain basicSetInitializer(ArrayInitializer newobj, NotificationChain msgs) {
		ArrayInitializer oldobj = _initializer;
		_initializer = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAY_CREATION__INITIALIZER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAY_CREATION__TYPE, oldobj, newobj);
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
			case Java_PackageImpl.ARRAY_CREATION__DIMENSIONS:
				return getDimensions();
			case Java_PackageImpl.ARRAY_CREATION__INITIALIZER:
				return getInitializer();
			case Java_PackageImpl.ARRAY_CREATION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_CREATION__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
			case Java_PackageImpl.ARRAY_CREATION__INITIALIZER:
				setInitializer((ArrayInitializer) newValue);
				return;
			case Java_PackageImpl.ARRAY_CREATION__TYPE:
				setType((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_CREATION__DIMENSIONS:
				return _dimensions != null && !_dimensions.isEmpty();
			case Java_PackageImpl.ARRAY_CREATION__INITIALIZER:
				return _initializer != null; //single != null;
			case Java_PackageImpl.ARRAY_CREATION__TYPE:
				return _type != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
