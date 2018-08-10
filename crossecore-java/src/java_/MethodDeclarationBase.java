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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS, oldValue, value));
		
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
				msgs = ((InternalEObject)_returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODDECLARATION_RETURNTYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODDECLARATION_RETURNTYPE, null, msgs);
			}
			msgs = basicSetReturnType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODDECLARATION_RETURNTYPE , value, value));
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
				msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, MethodDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, MethodDeclaration.class, msgs);
			}
			msgs = basicSetRedefinedMethodDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION , value, value));
		}
	}
	private Ocllib.Set<MethodDeclaration> _redefinitions;
	
	public Ocllib.Set<MethodDeclaration> getRedefinitions()
	{
		if(_redefinitions==null){
			_redefinitions = new Ocllib.Set<MethodDeclaration>(MethodDeclaration.class, this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION);
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
			case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
				return getRedefinitions().basicAdd((MethodDeclaration)otherEnd, msgs);
			case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
				if (_redefinedMethodDeclaration != null){
					msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION, MethodDeclaration.class, msgs);
				}
				return basicSetRedefinedMethodDeclaration((MethodDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
				return getRedefinitions().basicRemove((MethodDeclaration)otherEnd, msgs);
			case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
				return basicSetRedefinedMethodDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetReturnType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _returnType;
		_returnType = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODDECLARATION_RETURNTYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetRedefinedMethodDeclaration(MethodDeclaration newobj, NotificationChain msgs) {
		MethodDeclaration oldobj = _redefinedMethodDeclaration;
		_redefinedMethodDeclaration = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION, oldobj, newobj);
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
			case Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
				return getExtraArrayDimensions();
			case Java_PackageImpl.METHODDECLARATION_RETURNTYPE:
				return getReturnType();
			case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
				return getRedefinedMethodDeclaration();
			case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
				return getRedefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
				setExtraArrayDimensions((int) newValue);
				return;
			case Java_PackageImpl.METHODDECLARATION_RETURNTYPE:
				setReturnType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration) newValue);
				return;
			case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
				getRedefinitions().clear();
				getRedefinitions().addAll((java.util.Collection<? extends MethodDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
				return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
			case Java_PackageImpl.METHODDECLARATION_RETURNTYPE:
				return _returnType != null; //single != null;
			case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
				return getRedefinedMethodDeclaration() != null; //single, volatile
			case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
				return getRedefinitions().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
