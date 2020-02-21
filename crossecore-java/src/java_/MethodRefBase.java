package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class MethodRefBase 
extends ASTNodeImpl implements MethodRef
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
				msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, AbstractMethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, AbstractMethodDeclaration.class, msgs);
			}
			msgs = basicSetMethod(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHOD_REF__METHOD , value, value));
		}
	}
	private TypeAccess _qualifier;
	public TypeAccess getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(TypeAccess value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_REF__QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_REF__QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHOD_REF__QUALIFIER , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<MethodRefParameter> _parameters;
	
	public com.crossecore.ocl.OrderedSet<MethodRefParameter> getParameters()
	{
		if(_parameters==null){
			_parameters = new com.crossecore.ocl.OrderedSet<MethodRefParameter>(MethodRefParameter.class, this, Java_PackageImpl.METHOD_REF__PARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_REF__PARAMETERS);
		}
		return _parameters;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.METHODREF;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF__METHOD:
				if (_method != null){
					msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.METHOD_REF__METHOD, AbstractMethodDeclaration.class, msgs);
				}
				return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF__METHOD:
				return basicSetMethod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
		AbstractMethodDeclaration oldobj = _method;
		_method = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHOD_REF__METHOD, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetQualifier(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHOD_REF__QUALIFIER, oldobj, newobj);
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
			case Java_PackageImpl.METHOD_REF__METHOD:
				return getMethod();
			case Java_PackageImpl.METHOD_REF__QUALIFIER:
				return getQualifier();
			case Java_PackageImpl.METHOD_REF__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF__METHOD:
				setMethod((AbstractMethodDeclaration) newValue);
				return;
			case Java_PackageImpl.METHOD_REF__QUALIFIER:
				setQualifier((TypeAccess) newValue);
				return;
			case Java_PackageImpl.METHOD_REF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((java.util.Collection<? extends MethodRefParameter>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_REF__METHOD:
				return getMethod() != null; //single, volatile
			case Java_PackageImpl.METHOD_REF__QUALIFIER:
				return _qualifier != null; //single != null;
			case Java_PackageImpl.METHOD_REF__PARAMETERS:
				return _parameters != null && !_parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
