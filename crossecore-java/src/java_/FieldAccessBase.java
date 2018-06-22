package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class FieldAccessBase 
extends ExpressionImpl implements FieldAccess
{
	private SingleVariableAccess _field;
	public SingleVariableAccess getField()
	{
		
			return _field;
		
		
	}
	public void setField(SingleVariableAccess value){
		if (value != _field) {
			NotificationChain msgs = null;
			if (_field != null){
				msgs = ((InternalEObject)_field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FIELDACCESS_FIELD, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FIELDACCESS_FIELD, null, msgs);
			}
			msgs = basicSetField(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FIELDACCESS_FIELD , value, value));
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FIELDACCESS_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FIELDACCESS_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FIELDACCESS_EXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.FIELDACCESS;
	}
	
	
	public NotificationChain basicSetField(SingleVariableAccess newobj, NotificationChain msgs) {
		SingleVariableAccess oldobj = _field;
		_field = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FIELDACCESS_FIELD, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FIELDACCESS_EXPRESSION, oldobj, newobj);
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
			case Java_PackageImpl.FIELDACCESS_FIELD:
				return getField();
			case Java_PackageImpl.FIELDACCESS_EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.FIELDACCESS_FIELD:
				setField((SingleVariableAccess) newValue);
				return;
			case Java_PackageImpl.FIELDACCESS_EXPRESSION:
				setExpression((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.FIELDACCESS_FIELD:
				return _field != null; //single != null;
			case Java_PackageImpl.FIELDACCESS_EXPRESSION:
				return _expression != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
