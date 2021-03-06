package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class InstanceofExpressionBase 
extends ExpressionImpl implements InstanceofExpression
{
	private TypeAccess _rightOperand;
	public TypeAccess getRightOperand()
	{
		
			return _rightOperand;
		
		
	}
	public void setRightOperand(TypeAccess value){
		if (value != _rightOperand) {
			NotificationChain msgs = null;
			if (_rightOperand != null){
				msgs = ((InternalEObject)_rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, null, msgs);
			}
			msgs = basicSetRightOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND , value, value));
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
				msgs = ((InternalEObject)_leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND, null, msgs);
			}
			msgs = basicSetLeftOperand(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.INSTANCEOFEXPRESSION;
	}
	
	
	public NotificationChain basicSetLeftOperand(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _leftOperand;
		_leftOperand = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetRightOperand(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _rightOperand;
		_rightOperand = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND, oldobj, newobj);
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
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				setRightOperand((TypeAccess) newValue);
				return;
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				setLeftOperand((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return _rightOperand != null; //single != null;
			case Java_PackageImpl.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return _leftOperand != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
