package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AssignmentBase 
extends ExpressionImpl implements Assignment
{
	protected static final AssignmentKind OPERATOR_EDEFAULT = AssignmentKind.ASSIGN;
	private AssignmentKind _operator = OPERATOR_EDEFAULT;
	public AssignmentKind getOperator()
	{
		return _operator;
	}
	public void setOperator(AssignmentKind value){
		
		AssignmentKind oldValue = _operator;
		_operator = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.ASSIGNMENT__OPERATOR, oldValue, value));
		
	}
	
	
	
	private Expression _leftHandSide;
	public Expression getLeftHandSide()
	{
		
			return _leftHandSide;
		
		
	}
	public void setLeftHandSide(Expression value){
		if (value != _leftHandSide) {
			NotificationChain msgs = null;
			if (_leftHandSide != null){
				msgs = ((InternalEObject)_leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE, null, msgs);
			}
			msgs = basicSetLeftHandSide(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE , value, value));
		}
	}
	private Expression _rightHandSide;
	public Expression getRightHandSide()
	{
		
			return _rightHandSide;
		
		
	}
	public void setRightHandSide(Expression value){
		if (value != _rightHandSide) {
			NotificationChain msgs = null;
			if (_rightHandSide != null){
				msgs = ((InternalEObject)_rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE, null, msgs);
			}
			msgs = basicSetRightHandSide(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ASSIGNMENT;
	}
	
	
	public NotificationChain basicSetRightHandSide(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _rightHandSide;
		_rightHandSide = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetLeftHandSide(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _leftHandSide;
		_leftHandSide = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE, oldobj, newobj);
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
			case Java_PackageImpl.ASSIGNMENT__OPERATOR:
				return getOperator();
			case Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE:
				return getRightHandSide();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ASSIGNMENT__OPERATOR:
				setOperator((AssignmentKind) newValue);
				return;
			case Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE:
				setLeftHandSide((Expression) newValue);
				return;
			case Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE:
				setRightHandSide((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ASSIGNMENT__OPERATOR:
				return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
			case Java_PackageImpl.ASSIGNMENT__LEFT_HAND_SIDE:
				return _leftHandSide != null; //single != null;
			case Java_PackageImpl.ASSIGNMENT__RIGHT_HAND_SIDE:
				return _rightHandSide != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
