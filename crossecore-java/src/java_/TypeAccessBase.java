package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TypeAccessBase 
extends ExpressionImpl implements TypeAccess
{
	private Type _type;
	public Type getType()
	{
		
			return _type;
		
		
	}
	public void setType(Type value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS, Type.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS, Type.class, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TYPE_ACCESS__TYPE , value, value));
		}
	}
	private NamespaceAccess _qualifier;
	public NamespaceAccess getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(NamespaceAccess value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPE_ACCESS__QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPE_ACCESS__QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TYPE_ACCESS__QUALIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TYPEACCESS;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_ACCESS__TYPE:
				if (_type != null){
					msgs = ((InternalEObject)_type).eInverseRemove(this, Java_PackageImpl.TYPE_ACCESS__TYPE, Type.class, msgs);
				}
				return basicSetType((Type)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_ACCESS__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetType(Type newobj, NotificationChain msgs) {
		Type oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TYPE_ACCESS__TYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetQualifier(NamespaceAccess newobj, NotificationChain msgs) {
		NamespaceAccess oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TYPE_ACCESS__QUALIFIER, oldobj, newobj);
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
			case Java_PackageImpl.TYPE_ACCESS__TYPE:
				return getType();
			case Java_PackageImpl.TYPE_ACCESS__QUALIFIER:
				return getQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_ACCESS__TYPE:
				setType((Type) newValue);
				return;
			case Java_PackageImpl.TYPE_ACCESS__QUALIFIER:
				setQualifier((NamespaceAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_ACCESS__TYPE:
				return getType() != null; //single, volatile
			case Java_PackageImpl.TYPE_ACCESS__QUALIFIER:
				return _qualifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamespaceAccess.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamespaceAccess.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
