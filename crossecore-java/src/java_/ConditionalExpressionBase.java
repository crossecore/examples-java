package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ConditionalExpressionBase 
extends ExpressionImpl implements ConditionalExpression
{
	private Expression _elseExpression;
	public Expression getElseExpression()
	{
		
			return _elseExpression;
		
		
	}
	public void setElseExpression(Expression value){
		if (value != _elseExpression) {
			NotificationChain msgs = null;
			if (_elseExpression != null){
				msgs = ((InternalEObject)_elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, null, msgs);
			}
			msgs = basicSetElseExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION , value, value));
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION , value, value));
		}
	}
	private Expression _thenExpression;
	public Expression getThenExpression()
	{
		
			return _thenExpression;
		
		
	}
	public void setThenExpression(Expression value){
		if (value != _thenExpression) {
			NotificationChain msgs = null;
			if (_thenExpression != null){
				msgs = ((InternalEObject)_thenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, null, msgs);
			}
			msgs = basicSetThenExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CONDITIONALEXPRESSION;
	}
	
	
	public NotificationChain basicSetElseExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _elseExpression;
		_elseExpression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetThenExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _thenExpression;
		_thenExpression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, oldobj, newobj);
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
			case Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION:
				return getElseExpression();
			case Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION:
				return getExpression();
			case Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION:
				return getThenExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION:
				setElseExpression((Expression) newValue);
				return;
			case Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION:
				setThenExpression((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION:
				return _elseExpression != null; //single != null;
			case Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION:
				return _expression != null; //single != null;
			case Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION:
				return _thenExpression != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
