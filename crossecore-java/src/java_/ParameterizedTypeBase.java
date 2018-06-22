package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ParameterizedTypeBase 
extends TypeImpl implements ParameterizedType
{
	private TypeAccess _type;
	public TypeAccess getType()
	{
		
			return _type;
		
		
	}
	public void setType(TypeAccess value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PARAMETERIZEDTYPE_TYPE , value, value));
		}
	}
	private Ocllib.OrderedSet<TypeAccess> _typeArguments;
	
	public Ocllib.OrderedSet<TypeAccess> getTypeArguments()
	{
		if(_typeArguments==null){
			_typeArguments = new Ocllib.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS);
		}
		return _typeArguments;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.PARAMETERIZEDTYPE;
	}
	
	
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, oldobj, newobj);
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
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPE:
				return getType();
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS:
				return getTypeArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS:
				return _typeArguments != null && !_typeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
