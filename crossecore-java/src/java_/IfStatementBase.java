package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class IfStatementBase 
extends StatementImpl implements IfStatement
{
	private Expression _expression;
	public Expression getExpression()
	{
		
			return _expression;
		
		
	}
	public void setExpression(Expression value){
		if (value != _expression) {
			NotificationChain msgs = null;
			if (_expression != null){
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IF_STATEMENT__EXPRESSION , value, value));
		}
	}
	private Statement _thenStatement;
	public Statement getThenStatement()
	{
		
			return _thenStatement;
		
		
	}
	public void setThenStatement(Statement value){
		if (value != _thenStatement) {
			NotificationChain msgs = null;
			if (_thenStatement != null){
				msgs = ((InternalEObject)_thenStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT, null, msgs);
			}
			msgs = basicSetThenStatement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT , value, value));
		}
	}
	private Statement _elseStatement;
	public Statement getElseStatement()
	{
		
			return _elseStatement;
		
		
	}
	public void setElseStatement(Statement value){
		if (value != _elseStatement) {
			NotificationChain msgs = null;
			if (_elseStatement != null){
				msgs = ((InternalEObject)_elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
			}
			msgs = basicSetElseStatement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.IFSTATEMENT;
	}
	
	
	public NotificationChain basicSetThenStatement(Statement newobj, NotificationChain msgs) {
		Statement oldobj = _thenStatement;
		_thenStatement = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IF_STATEMENT__EXPRESSION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetElseStatement(Statement newobj, NotificationChain msgs) {
		Statement oldobj = _elseStatement;
		_elseStatement = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT, oldobj, newobj);
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
			case Java_PackageImpl.IF_STATEMENT__EXPRESSION:
				return getExpression();
			case Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT:
				return getThenStatement();
			case Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT:
				return getElseStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.IF_STATEMENT__EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT:
				setThenStatement((Statement) newValue);
				return;
			case Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT:
				setElseStatement((Statement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.IF_STATEMENT__EXPRESSION:
				return _expression != null; //single != null;
			case Java_PackageImpl.IF_STATEMENT__THEN_STATEMENT:
				return _thenStatement != null; //single != null;
			case Java_PackageImpl.IF_STATEMENT__ELSE_STATEMENT:
				return _elseStatement != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
