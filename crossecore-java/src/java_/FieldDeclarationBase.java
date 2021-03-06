package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class FieldDeclarationBase 
extends BodyDeclarationImpl implements FieldDeclaration
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
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<VariableDeclarationFragment> _fragments;
	
	public com.crossecore.ocl.OrderedSet<VariableDeclarationFragment> getFragments()
	{
		if(_fragments==null){
			_fragments = new com.crossecore.ocl.OrderedSet<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER);
		}
		return _fragments;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.FIELDDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS:
				return getFragments().basicAdd((VariableDeclarationFragment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS:
				return getFragments().basicRemove((VariableDeclarationFragment)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE, oldobj, newobj);
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
			case Java_PackageImpl.FIELD_DECLARATION__TYPE:
				return getType();
			case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS:
				return getFragments();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.FIELD_DECLARATION__TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((java.util.Collection<? extends VariableDeclarationFragment>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.FIELD_DECLARATION__TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS:
				return _fragments != null && !_fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.FIELD_DECLARATION__TYPE: return Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS: return Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE: return Java_PackageImpl.FIELD_DECLARATION__TYPE;
				case Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return Java_PackageImpl.FIELD_DECLARATION__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
