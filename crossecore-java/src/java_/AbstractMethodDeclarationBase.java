package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AbstractMethodDeclarationBase 
extends BodyDeclarationImpl implements AbstractMethodDeclaration
{
	private Block _body;
	public Block getBody()
	{
		
			return _body;
		
		
	}
	public void setBody(Block value){
		if (value != _body) {
			NotificationChain msgs = null;
			if (_body != null){
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<SingleVariableDeclaration> _parameters;
	
	public com.crossecore.ocl.OrderedSet<SingleVariableDeclaration> getParameters()
	{
		if(_parameters==null){
			_parameters = new com.crossecore.ocl.OrderedSet<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return _parameters;
	
	}
	private com.crossecore.ocl.OrderedSet<TypeAccess> _thrownExceptions;
	
	public com.crossecore.ocl.OrderedSet<TypeAccess> getThrownExceptions()
	{
		if(_thrownExceptions==null){
			_thrownExceptions = new com.crossecore.ocl.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
		}
		return _thrownExceptions;
	
	}
	private com.crossecore.ocl.OrderedSet<TypeParameter> _typeParameters;
	
	public com.crossecore.ocl.OrderedSet<TypeParameter> getTypeParameters()
	{
		if(_typeParameters==null){
			_typeParameters = new com.crossecore.ocl.OrderedSet<TypeParameter>(TypeParameter.class, this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return _typeParameters;
	
	}
	private com.crossecore.ocl.Set<MethodRef> _usagesInDocComments;
	
	public com.crossecore.ocl.Set<MethodRef> getUsagesInDocComments()
	{
		if(_usagesInDocComments==null){
			_usagesInDocComments = new com.crossecore.ocl.Set<MethodRef>(MethodRef.class, this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, Java_PackageImpl.METHOD_REF__METHOD);
		}
		return _usagesInDocComments;
	
	}
	private com.crossecore.ocl.Set<AbstractMethodInvocation> _usages;
	
	public com.crossecore.ocl.Set<AbstractMethodInvocation> getUsages()
	{
		if(_usages==null){
			_usages = new com.crossecore.ocl.Set<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES, Java_PackageImpl.ABSTRACT_METHOD_INVOCATION__METHOD);
		}
		return _usages;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ABSTRACTMETHODDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments().basicAdd((MethodRef)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages().basicAdd((AbstractMethodInvocation)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return getParameters().basicAdd((SingleVariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments().basicRemove((MethodRef)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages().basicRemove((AbstractMethodInvocation)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return getParameters().basicRemove((SingleVariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
		Block oldobj = _body;
		_body = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY, oldobj, newobj);
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
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY:
				return getBody();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY:
				setBody((Block) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((java.util.Collection<? extends SingleVariableDeclaration>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((java.util.Collection<? extends TypeParameter>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((java.util.Collection<? extends MethodRef>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES:
				getUsages().clear();
				getUsages().addAll((java.util.Collection<? extends AbstractMethodInvocation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__BODY:
				return _body != null; //single != null;
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return _parameters != null && !_parameters.isEmpty();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return _thrownExceptions != null && !_thrownExceptions.isEmpty();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return _typeParameters != null && !_typeParameters.isEmpty();
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments().isEmpty(); //many, volatile
			case Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
