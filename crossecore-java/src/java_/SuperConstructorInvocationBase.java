package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SuperConstructorInvocationBase 
extends StatementImpl implements SuperConstructorInvocation
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
				msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES, AbstractMethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES, AbstractMethodDeclaration.class, msgs);
			}
			msgs = basicSetMethod(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Expression> _arguments;
	
	public com.crossecore.ocl.OrderedSet<Expression> getArguments()
	{
		if(_arguments==null){
			_arguments = new com.crossecore.ocl.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__ARGUMENTS);
		}
		return _arguments;
	
	}
	private com.crossecore.ocl.OrderedSet<TypeAccess> _typeArguments;
	
	public com.crossecore.ocl.OrderedSet<TypeAccess> getTypeArguments()
	{
		if(_typeArguments==null){
			_typeArguments = new com.crossecore.ocl.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS);
		}
		return _typeArguments;
	
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SUPERCONSTRUCTORINVOCATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				if (_method != null){
					msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD, AbstractMethodDeclaration.class, msgs);
				}
				return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return basicSetMethod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
		AbstractMethodDeclaration oldobj = _method;
		_method = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION, oldobj, newobj);
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
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return getMethod();
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return getArguments();
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				return getTypeArguments();
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				setMethod((AbstractMethodDeclaration) newValue);
				return;
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				setExpression((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return getMethod() != null; //single, volatile
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return _arguments != null && !_arguments.isEmpty();
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				return _typeArguments != null && !_typeArguments.isEmpty();
			case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return _expression != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD: return Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD;
				case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS: return Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__ARGUMENTS;
				case Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS: return Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD: return Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__METHOD;
				case Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__ARGUMENTS: return Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS;
				case Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS: return Java_PackageImpl.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
