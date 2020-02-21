package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class PrefixExpressionBase 
extends ExpressionImpl implements PrefixExpression
{
	protected static final PrefixExpressionKind OPERATOR_EDEFAULT = PrefixExpressionKind.INCREMENT;
	private PrefixExpressionKind _operator = OPERATOR_EDEFAULT;
	public PrefixExpressionKind getOperator()
	{
		return _operator;
	}
	public void setOperator(PrefixExpressionKind value){
		
		PrefixExpressionKind oldValue = _operator;
		_operator = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.PREFIX_EXPRESSION__OPERATOR, oldValue, value));
		
	}
	
	
	
	private Expression _operand;
	public Expression getOperand()
	{
		
			return _operand;
		
		
	}
	public void setOperand(Expression value){
		if (value != _operand) {
			NotificationChain msgs = null;
			if (_operand != null){
				msgs = ((InternalEObject)_operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PREFIX_EXPRESSION__OPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PREFIX_EXPRESSION__OPERAND, null, msgs);
			}
			msgs = basicSetOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PREFIX_EXPRESSION__OPERAND , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.PREFIXEXPRESSION;
	}
	
	
	public NotificationChain basicSetOperand(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _operand;
		_operand = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PREFIX_EXPRESSION__OPERAND, oldobj, newobj);
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
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERATOR:
				return getOperator();
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERAND:
				return getOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERATOR:
				setOperator((PrefixExpressionKind) newValue);
				return;
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERAND:
				setOperand((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
			case Java_PackageImpl.PREFIX_EXPRESSION__OPERAND:
				return _operand != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
