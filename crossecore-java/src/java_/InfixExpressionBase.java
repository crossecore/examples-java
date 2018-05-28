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
	private InfixExpressionKind _operator = InfixExpressionKind.TIMES;
	public InfixExpressionKind getOperator()
	{
		return _operator;
	}
	public void setOperator(InfixExpressionKind value){
		
		InfixExpressionKind oldValue = _operator;
		_operator = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.INFIXEXPRESSION_OPERATOR, oldValue, value));
		
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
				msgs = ((InternalEObject)_rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, null, msgs);
			}
			msgs = basicSetRightOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND , value, value));
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
				msgs = ((InternalEObject)_leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, null, msgs);
			}
			msgs = basicSetLeftOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND , value, value));
		}
	}
	private Ocllib.OrderedSet<Expression> _extendedOperands;
	
	public Ocllib.OrderedSet<Expression> getExtendedOperands()
	{
		if(_extendedOperands==null){
			_extendedOperands = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, oldobj, newobj);
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
			case Java_PackageImpl.INFIXEXPRESSION_OPERATOR:
				return getOperator();
			case Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND:
				return getRightOperand();
			case Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND:
				return getLeftOperand();
			case Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS:
				return getExtendedOperands();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.INFIXEXPRESSION_OPERATOR:
				setOperator((InfixExpressionKind) newValue);
				return;
			case Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND:
				setRightOperand((Expression) newValue);
				return;
			case Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND:
				setLeftOperand((Expression) newValue);
				return;
			case Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS:
				getExtendedOperands().clear();
				getExtendedOperands().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
