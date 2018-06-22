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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS, oldValue, value));
		
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
				msgs = ((InternalEObject)_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, null, msgs);
			}
			msgs = basicSetInitializer(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER , value, value));
		}
	}
	private Ocllib.Set<SingleVariableAccess> _usageInVariableAccess;
	
	public Ocllib.Set<SingleVariableAccess> getUsageInVariableAccess()
	{
		if(_usageInVariableAccess==null){
			_usageInVariableAccess = new Ocllib.Set<SingleVariableAccess>(SingleVariableAccess.class, this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE);
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
				msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
			}
			msgs = basicSetAnonymousClassDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION , value, value));
		}
	}
	private Ocllib.OrderedSet<Expression> _arguments;
	
	public Ocllib.OrderedSet<Expression> getArguments()
	{
		if(_arguments==null){
			_arguments = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS);
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
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
				return getUsageInVariableAccess().basicAdd((SingleVariableAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
				return getUsageInVariableAccess().basicRemove((SingleVariableAccess)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetInitializer(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _initializer;
		_initializer = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
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
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
				return getExtraArrayDimensions();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
				return getInitializer();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
				return getUsageInVariableAccess();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
				return getAnonymousClassDeclaration();
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
				return getArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
				setExtraArrayDimensions((int) newValue);
				return;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
				setInitializer((Expression) newValue);
				return;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((java.util.Collection<? extends SingleVariableAccess>) newValue);
				return;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration) newValue);
				return;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
				return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
				return _initializer != null; //single != null;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
				return getUsageInVariableAccess().isEmpty(); //many, volatile
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
				return _anonymousClassDeclaration != null; //single != null;
			case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
				return _arguments != null && !_arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER: return Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS;
				case Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER: return Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER;
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
