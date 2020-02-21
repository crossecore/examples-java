package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AssertStatementBase 
extends StatementImpl implements AssertStatement
{
	private Expression _message;
	public Expression getMessage()
	{
		
			return _message;
		
		
	}
	public void setMessage(Expression value){
		if (value != _message) {
			NotificationChain msgs = null;
			if (_message != null){
				msgs = ((InternalEObject)_message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSERT_STATEMENT__MESSAGE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSERT_STATEMENT__MESSAGE, null, msgs);
			}
			msgs = basicSetMessage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSERT_STATEMENT__MESSAGE , value, value));
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ASSERTSTATEMENT;
	}
	
	
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetMessage(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _message;
		_message = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSERT_STATEMENT__MESSAGE, oldobj, newobj);
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
			case Java_PackageImpl.ASSERT_STATEMENT__MESSAGE:
				return getMessage();
			case Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ASSERT_STATEMENT__MESSAGE:
				setMessage((Expression) newValue);
				return;
			case Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION:
				setExpression((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ASSERT_STATEMENT__MESSAGE:
				return _message != null; //single != null;
			case Java_PackageImpl.ASSERT_STATEMENT__EXPRESSION:
				return _expression != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
