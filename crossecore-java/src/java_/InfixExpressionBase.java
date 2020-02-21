package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class InfixExpressionBase 
extends ExpressionImpl implements InfixExpression
{
	protected static final InfixExpressionKind OPERATOR_EDEFAULT = InfixExpressionKind.TIMES;
	private InfixExpressionKind _operator = OPERATOR_EDEFAULT;
	public InfixExpressionKind getOperator()
	{
		return _operator;
	}
	public void setOperator(InfixExpressionKind value){
		
		InfixExpressionKind oldValue = _operator;
		_operator = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.INFIX_EXPRESSION__OPERATOR, oldValue, value));
		
	}
	
	
	
	private Expression _rightOperand;
	public Expression getRightOperand()
	{
		
			return _rightOperand;
		
		
	}
	public void setRightOperand(Expression value){
		if (value != _rightOperand) {
			NotificationChain msgs = null;
			if (_rightOperand != null){
				msgs = ((InternalEObject)_rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND, null, msgs);
			}
			msgs = basicSetRightOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND , value, value));
		}
	}
	private Expression _leftOperand;
	public Expression getLeftOperand()
	{
		
			return _leftOperand;
		
		
	}
	public void setLeftOperand(Expression value){
		if (value != _leftOperand) {
			NotificationChain msgs = null;
			if (_leftOperand != null){
				msgs = ((InternalEObject)_leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND, null, msgs);
			}
			msgs = basicSetLeftOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<Expression> _extendedOperands;
	
	public com.crossecore.ocl.OrderedSet<Expression> getExtendedOperands()
	{
		if(_extendedOperands==null){
			_extendedOperands = new com.crossecore.ocl.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.INFIX_EXPRESSION__EXTENDED_OPERANDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIX_EXPRESSION__EXTENDED_OPERANDS);
		}
		return _extendedOperands;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.INFIXEXPRESSION;
	}
	
	
	public NotificationChain basicSetRightOperand(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _rightOperand;
		_rightOperand = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetLeftOperand(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _leftOperand;
		_leftOperand = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND, oldobj, newobj);
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
			case Java_PackageImpl.INFIX_EXPRESSION__OPERATOR:
				return getOperator();
			case Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
			case Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case Java_PackageImpl.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return getExtendedOperands();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.INFIX_EXPRESSION__OPERATOR:
				setOperator((InfixExpressionKind) newValue);
				return;
			case Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((Expression) newValue);
				return;
			case Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression) newValue);
				return;
			case Java_PackageImpl.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
				getExtendedOperands().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.INFIX_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
			case Java_PackageImpl.INFIX_EXPRESSION__RIGHT_OPERAND:
				return _rightOperand != null; //single != null;
			case Java_PackageImpl.INFIX_EXPRESSION__LEFT_OPERAND:
				return _leftOperand != null; //single != null;
			case Java_PackageImpl.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return _extendedOperands != null && !_extendedOperands.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
