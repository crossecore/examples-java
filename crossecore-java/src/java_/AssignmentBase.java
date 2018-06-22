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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.ASSIGNMENT_OPERATOR, oldValue, value));
		
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
				msgs = ((InternalEObject)_leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, null, msgs);
			}
			msgs = basicSetLeftHandSide(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE , value, value));
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
				msgs = ((InternalEObject)_rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, null, msgs);
			}
			msgs = basicSetRightHandSide(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ASSIGNMENT;
	}
	
	
	public NotificationChain basicSetLeftHandSide(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _leftHandSide;
		_leftHandSide = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetRightHandSide(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _rightHandSide;
		_rightHandSide = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, oldobj, newobj);
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
			case Java_PackageImpl.ASSIGNMENT_OPERATOR:
				return getOperator();
			case Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE:
				return getLeftHandSide();
			case Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE:
				return getRightHandSide();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ASSIGNMENT_OPERATOR:
				setOperator((AssignmentKind) newValue);
				return;
			case Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE:
				setLeftHandSide((Expression) newValue);
				return;
			case Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE:
				setRightHandSide((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ASSIGNMENT_OPERATOR:
				return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
			case Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE:
				return _leftHandSide != null; //single != null;
			case Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE:
				return _rightHandSide != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
