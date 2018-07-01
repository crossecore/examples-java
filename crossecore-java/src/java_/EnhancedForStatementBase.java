package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EnhancedForStatementBase 
extends StatementImpl implements EnhancedForStatement
{
	private Statement _body;
	public Statement getBody()
	{
		
			return _body;
		
		
	}
	public void setBody(Statement value){
		if (value != _body) {
			NotificationChain msgs = null;
			if (_body != null){
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY , value, value));
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION , value, value));
		}
	}
	private SingleVariableDeclaration _parameter;
	public SingleVariableDeclaration getParameter()
	{
		
			return _parameter;
		
		
	}
	public void setParameter(SingleVariableDeclaration value){
		if (value != _parameter) {
			NotificationChain msgs = null;
			if (_parameter != null){
				msgs = ((InternalEObject)_parameter).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, SingleVariableDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, SingleVariableDeclaration.class, msgs);
			}
			msgs = basicSetParameter(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ENHANCEDFORSTATEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
				if (_parameter != null){
					msgs = ((InternalEObject)_parameter).eInverseRemove(this, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, SingleVariableDeclaration.class, msgs);
				}
				return basicSetParameter((SingleVariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
				return basicSetParameter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetBody(Statement newobj, NotificationChain msgs) {
		Statement oldobj = _body;
		_body = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetParameter(SingleVariableDeclaration newobj, NotificationChain msgs) {
		SingleVariableDeclaration oldobj = _parameter;
		_parameter = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, oldobj, newobj);
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
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
				return getBody();
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
				return getExpression();
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
				setBody((Statement) newValue);
				return;
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
				setParameter((SingleVariableDeclaration) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
				return _body != null; //single != null;
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
				return _expression != null; //single != null;
			case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
				return _parameter != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
