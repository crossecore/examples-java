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
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY , value, value));
		}
	}
	private Ocllib.OrderedSet<SingleVariableDeclaration> _parameters;
	
	public Ocllib.OrderedSet<SingleVariableDeclaration> getParameters()
	{
		if(_parameters==null){
			_parameters = new Ocllib.OrderedSet<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS, Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION);
		}
		return _parameters;
	
	}
	private Ocllib.OrderedSet<TypeAccess> _thrownExceptions;
	
	public Ocllib.OrderedSet<TypeAccess> getThrownExceptions()
	{
		if(_thrownExceptions==null){
			_thrownExceptions = new Ocllib.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS);
		}
		return _thrownExceptions;
	
	}
	private Ocllib.OrderedSet<TypeParameter> _typeParameters;
	
	public Ocllib.OrderedSet<TypeParameter> getTypeParameters()
	{
		if(_typeParameters==null){
			_typeParameters = new Ocllib.OrderedSet<TypeParameter>(TypeParameter.class, this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS);
		}
		return _typeParameters;
	
	}
	private Ocllib.Set<MethodRef> _usagesInDocComments;
	
	public Ocllib.Set<MethodRef> getUsagesInDocComments()
	{
		if(_usagesInDocComments==null){
			_usagesInDocComments = new Ocllib.Set<MethodRef>(MethodRef.class, this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, Java_PackageImpl.METHODREF_METHOD);
		}
		return _usagesInDocComments;
	
	}
	private Ocllib.Set<AbstractMethodInvocation> _usages;
	
	public Ocllib.Set<AbstractMethodInvocation> getUsages()
	{
		if(_usages==null){
			_usages = new Ocllib.Set<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD);
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
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
				return getUsages().basicAdd((AbstractMethodInvocation)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
				return getParameters().basicAdd((SingleVariableDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
				return getUsagesInDocComments().basicAdd((MethodRef)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
				return getUsages().basicRemove((AbstractMethodInvocation)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
				return getParameters().basicRemove((SingleVariableDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
				return getUsagesInDocComments().basicRemove((MethodRef)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
		Block oldobj = _body;
		_body = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, oldobj, newobj);
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
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
				return getBody();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
				return getParameters();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
				return getThrownExceptions();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
				return getTypeParameters();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
				return getUsagesInDocComments();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
				return getUsages();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
				setBody((Block) newValue);
				return;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
				getParameters().clear();
				getParameters().addAll((java.util.Collection<? extends SingleVariableDeclaration>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((java.util.Collection<? extends TypeParameter>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((java.util.Collection<? extends MethodRef>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
				getUsages().clear();
				getUsages().addAll((java.util.Collection<? extends AbstractMethodInvocation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
				return _body != null; //single != null;
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
				return _parameters != null && !_parameters.isEmpty();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
				return _thrownExceptions != null && !_thrownExceptions.isEmpty();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
				return _typeParameters != null && !_typeParameters.isEmpty();
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
				return getUsagesInDocComments().isEmpty(); //many, volatile
			case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
				return getUsages().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
