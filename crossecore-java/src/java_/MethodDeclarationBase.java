package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class MethodDeclarationBase 
extends AbstractMethodDeclarationImpl implements MethodDeclaration
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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS, oldValue, value));
		
	}
	
	
	
	private TypeAccess _returnType;
	public TypeAccess getReturnType()
	{
		
			return _returnType;
		
		
	}
	public void setReturnType(TypeAccess value){
		if (value != _returnType) {
			NotificationChain msgs = null;
			if (_returnType != null){
				msgs = ((InternalEObject)_returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE, null, msgs);
			}
			msgs = basicSetReturnType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE , value, value));
		}
	}
	private MethodDeclaration _redefinedMethodDeclaration;
	public MethodDeclaration getRedefinedMethodDeclaration()
	{
		
			return _redefinedMethodDeclaration;
		
		
	}
	public void setRedefinedMethodDeclaration(MethodDeclaration value){
		if (value != _redefinedMethodDeclaration) {
			NotificationChain msgs = null;
			if (_redefinedMethodDeclaration != null){
				msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS, MethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS, MethodDeclaration.class, msgs);
			}
			msgs = basicSetRedefinedMethodDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION , value, value));
		}
	}
	private com.crossecore.ocl.Set<MethodDeclaration> _redefinitions;
	
	public com.crossecore.ocl.Set<MethodDeclaration> getRedefinitions()
	{
		if(_redefinitions==null){
			_redefinitions = new com.crossecore.ocl.Set<MethodDeclaration>(MethodDeclaration.class, this, Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS, Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION);
		}
		return _redefinitions;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.METHODDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				if (_redefinedMethodDeclaration != null){
					msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, MethodDeclaration.class, msgs);
				}
				return basicSetRedefinedMethodDeclaration((MethodDeclaration)otherEnd, msgs);
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions().basicAdd((MethodDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return basicSetRedefinedMethodDeclaration(null, msgs);
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions().basicRemove((MethodDeclaration)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetRedefinedMethodDeclaration(MethodDeclaration newobj, NotificationChain msgs) {
		MethodDeclaration oldobj = _redefinedMethodDeclaration;
		_redefinedMethodDeclaration = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetReturnType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _returnType;
		_returnType = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE, oldobj, newobj);
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
			case Java_PackageImpl.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return getRedefinedMethodDeclaration();
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions((int) newValue);
				return;
			case Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE:
				setReturnType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration) newValue);
				return;
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS:
				getRedefinitions().clear();
				getRedefinitions().addAll((java.util.Collection<? extends MethodDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
			case Java_PackageImpl.METHOD_DECLARATION__RETURN_TYPE:
				return _returnType != null; //single != null;
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return getRedefinedMethodDeclaration() != null; //single, volatile
			case Java_PackageImpl.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
