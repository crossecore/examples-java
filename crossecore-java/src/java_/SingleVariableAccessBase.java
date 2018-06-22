package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SingleVariableAccessBase 
extends ExpressionImpl implements SingleVariableAccess
{
	private VariableDeclaration _variable;
	public VariableDeclaration getVariable()
	{
		
			return _variable;
		
		
	}
	public void setVariable(VariableDeclaration value){
		if (value != _variable) {
			NotificationChain msgs = null;
			if (_variable != null){
				msgs = ((InternalEObject)_variable).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, SingleVariableAccess.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, SingleVariableAccess.class, msgs);
			}
			msgs = basicSetVariable(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE , value, value));
		}
	}
	private Expression _qualifier;
	public Expression getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(Expression value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SINGLEVARIABLEACCESS;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
				if (_variable != null){
					msgs = ((InternalEObject)_variable).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE, VariableDeclaration.class, msgs);
				}
				return basicSetVariable((VariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
				return basicSetVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetQualifier(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetVariable(VariableDeclaration newobj, NotificationChain msgs) {
		VariableDeclaration oldobj = _variable;
		_variable = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE, oldobj, newobj);
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
			case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
				return getVariable();
			case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
				return getQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
				setVariable((VariableDeclaration) newValue);
				return;
			case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
				setQualifier((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
				return getVariable() != null; //single, volatile
			case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
				return _qualifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
