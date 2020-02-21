package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SwitchCaseBase 
extends StatementImpl implements SwitchCase
{
	protected static final boolean DEFAULT_EDEFAULT = false;
	private boolean _default = DEFAULT_EDEFAULT;
	public boolean isDefault()
	{
		return _default;
	}
	public void setDefault(boolean value){
		
		boolean oldValue = _default;
		_default = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.SWITCH_CASE__DEFAULT, oldValue, value));
		
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCH_CASE__EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCH_CASE__EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SWITCH_CASE__EXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SWITCHCASE;
	}
	
	
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SWITCH_CASE__EXPRESSION, oldobj, newobj);
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
			case Java_PackageImpl.SWITCH_CASE__DEFAULT:
				return isDefault();
			case Java_PackageImpl.SWITCH_CASE__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SWITCH_CASE__DEFAULT:
				setDefault((boolean) newValue);
				return;
			case Java_PackageImpl.SWITCH_CASE__EXPRESSION:
				setExpression((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.SWITCH_CASE__DEFAULT:
				return _default != DEFAULT_EDEFAULT;
			case Java_PackageImpl.SWITCH_CASE__EXPRESSION:
				return _expression != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
