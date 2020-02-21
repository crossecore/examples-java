package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EnumConstantDeclarationBase 
extends BodyDeclarationImpl implements EnumConstantDeclaration
{
	protected static final int EXTRAARRAYDIMENSIONS_EDEFAULT = 0;
	private int _extraArrayDimensions = EXTRAARRAYDIMENSIONS_EDEFAULT;
	public int getExtraArrayDimensions()
	{
		return _extraArrayDimensions;
	}
	public void setExtraArrayDimensions(int value){
		
		int oldValue = _extraArrayDimensions;
		_extraArrayDimensions = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS, oldValue, value));
		
	}
	
	
	
	private Expression _initializer;
	public Expression getInitializer()
	{
		
			return _initializer;
		
		
	}
	public void setInitializer(Expression value){
		if (value != _initializer) {
			NotificationChain msgs = null;
			if (_initializer != null){
				msgs = ((InternalEObject)_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			}
			msgs = basicSetInitializer(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER , value, value));
		}
	}
	private com.crossecore.ocl.Set<SingleVariableAccess> _usageInVariableAccess;
	
	public com.crossecore.ocl.Set<SingleVariableAccess> getUsageInVariableAccess()
	{
		if(_usageInVariableAccess==null){
			_usageInVariableAccess = new com.crossecore.ocl.Set<SingleVariableAccess>(SingleVariableAccess.class, this, Java_PackageImpl.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS, Java_PackageImpl.SINGLE_VARIABLE_ACCESS__VARIABLE);
		}
		return _usageInVariableAccess;
	
	}
	private AnonymousClassDeclaration _anonymousClassDeclaration;
	public AnonymousClassDeclaration getAnonymousClassDeclaration()
	{
		
			return _anonymousClassDeclaration;
		
		
	}
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration value){
		if (value != _anonymousClassDeclaration) {
			NotificationChain msgs = null;
			if (_anonymousClassDeclaration != null){
				msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, null, msgs);
			}
			msgs = basicSetAnonymousClassDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Expression> _arguments;
	
	public com.crossecore.ocl.OrderedSet<Expression> getArguments()
	{
		if(_arguments==null){
			_arguments = new com.crossecore.ocl.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ARGUMENTS);
		}
		return _arguments;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ENUMCONSTANTDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess().basicAdd((SingleVariableAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess().basicRemove((SingleVariableAccess)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetInitializer(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _initializer;
		_initializer = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newobj, NotificationChain msgs) {
		AnonymousClassDeclaration oldobj = _anonymousClassDeclaration;
		_anonymousClassDeclaration = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION, oldobj, newobj);
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
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				return getInitializer();
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return getArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions((int) newValue);
				return;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				setInitializer((Expression) newValue);
				return;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((java.util.Collection<? extends SingleVariableAccess>) newValue);
				return;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration) newValue);
				return;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__INITIALIZER:
				return _initializer != null; //single != null;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess().isEmpty(); //many, volatile
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION:
				return _anonymousClassDeclaration != null; //single != null;
			case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__ARGUMENTS:
				return _arguments != null && !_arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return Java_PackageImpl.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__INITIALIZER: return Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER;
				case Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return Java_PackageImpl.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS: return Java_PackageImpl.ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS;
				case Java_PackageImpl.VARIABLE_DECLARATION__INITIALIZER: return Java_PackageImpl.ENUM_CONSTANT_DECLARATION__INITIALIZER;
				case Java_PackageImpl.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS: return Java_PackageImpl.ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
