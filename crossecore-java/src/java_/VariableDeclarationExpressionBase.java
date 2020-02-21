package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class VariableDeclarationExpressionBase 
extends ExpressionImpl implements VariableDeclarationExpression
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
	private Modifier _modifier;
	public Modifier getModifier()
	{
		
			return _modifier;
		
		
	}
	public void setModifier(Modifier value){
		if (value != _modifier) {
			NotificationChain msgs = null;
			if (_modifier != null){
				msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, Modifier.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, Modifier.class, msgs);
			}
			msgs = basicSetModifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Annotation> _annotations;
	
	public com.crossecore.ocl.OrderedSet<Annotation> getAnnotations()
	{
		if(_annotations==null){
			_annotations = new com.crossecore.ocl.OrderedSet<Annotation>(Annotation.class, this, Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS);
		}
		return _annotations;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.VARIABLEDECLARATIONEXPRESSION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return getFragments().basicAdd((VariableDeclarationFragment)otherEnd, msgs);
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				if (_modifier != null){
					msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, Modifier.class, msgs);
				}
				return basicSetModifier((Modifier)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return getFragments().basicRemove((VariableDeclarationFragment)otherEnd, msgs);
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return basicSetModifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
		Modifier oldobj = _modifier;
		_modifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, oldobj, newobj);
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
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return getType();
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return getFragments();
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return getModifier();
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((java.util.Collection<? extends VariableDeclarationFragment>) newValue);
				return;
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				setModifier((Modifier) newValue);
				return;
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((java.util.Collection<? extends Annotation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return _fragments != null && !_fragments.isEmpty();
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return _modifier != null; //single != null;
			case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				return _annotations != null && !_annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__TYPE: return Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS: return Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__TYPE: return Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__TYPE;
				case Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return Java_PackageImpl.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
