package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ClassInstanceCreationBase 
extends ExpressionImpl implements ClassInstanceCreation
{
	private AbstractMethodDeclaration _method;
	public AbstractMethodDeclaration getMethod()
	{
		
			return _method;
		
		
	}
	public void setMethod(AbstractMethodDeclaration value){
		if (value != _method) {
			NotificationChain msgs = null;
			if (_method != null){
				msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, AbstractMethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, AbstractMethodDeclaration.class, msgs);
			}
			msgs = basicSetMethod(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD , value, value));
		}
	}
	private Ocllib.OrderedSet<Expression> _arguments;
	
	public Ocllib.OrderedSet<Expression> getArguments()
	{
		if(_arguments==null){
			_arguments = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS);
		}
		return _arguments;
	
	}
	private Ocllib.OrderedSet<TypeAccess> _typeArguments;
	
	public Ocllib.OrderedSet<TypeAccess> getTypeArguments()
	{
		if(_typeArguments==null){
			_typeArguments = new Ocllib.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS);
		}
		return _typeArguments;
	
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
				msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, AnonymousClassDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, AnonymousClassDeclaration.class, msgs);
			}
			msgs = basicSetAnonymousClassDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION , value, value));
		}
	}
	private Expression _expression;
	public Expression getExpression()
	{
		
			return _expression;
		
		
	}
	public void setExpression(Expression value){
		if (value != _expression) {
			NotificationChain msgs = null;
			if (_expression != null){
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION , value, value));
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
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_TYPE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CLASSINSTANCECREATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
				if (_method != null){
					msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, AbstractMethodDeclaration.class, msgs);
				}
				return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
			case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
				if (_anonymousClassDeclaration != null){
					msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, AnonymousClassDeclaration.class, msgs);
				}
				return basicSetAnonymousClassDeclaration((AnonymousClassDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
				return basicSetMethod(null, msgs);
			case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
				return basicSetAnonymousClassDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
		AbstractMethodDeclaration oldobj = _method;
		_method = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_TYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
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
			case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
				return getMethod();
			case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS:
				return getArguments();
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS:
				return getTypeArguments();
			case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
				return getAnonymousClassDeclaration();
			case Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION:
				return getExpression();
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
				setMethod((AbstractMethodDeclaration) newValue);
				return;
			case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration) newValue);
				return;
			case Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPE:
				setType((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
				return getMethod() != null; //single, volatile
			case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS:
				return _arguments != null && !_arguments.isEmpty();
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS:
				return _typeArguments != null && !_typeArguments.isEmpty();
			case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
				return _anonymousClassDeclaration != null; //single != null;
			case Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION:
				return _expression != null; //single != null;
			case Java_PackageImpl.CLASSINSTANCECREATION_TYPE:
				return _type != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.CLASSINSTANCECREATION_METHOD: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD;
				case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS;
				case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD: return Java_PackageImpl.CLASSINSTANCECREATION_METHOD;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS: return Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
