package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ForStatementBase 
extends StatementImpl implements ForStatement
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FORSTATEMENT_EXPRESSION , value, value));
		}
	}
	private Ocllib.OrderedSet<Expression> _updaters;
	
	public Ocllib.OrderedSet<Expression> getUpdaters()
	{
		if(_updaters==null){
			_updaters = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.FORSTATEMENT_UPDATERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_UPDATERS);
		}
		return _updaters;
	
	}
	private Ocllib.OrderedSet<Expression> _initializers;
	
	public Ocllib.OrderedSet<Expression> getInitializers()
	{
		if(_initializers==null){
			_initializers = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.FORSTATEMENT_INITIALIZERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_INITIALIZERS);
		}
		return _initializers;
	
	}
	private Statement _body;
	public Statement getBody()
	{
		
			return _body;
		
		
	}
	public void setBody(Statement value){
		if (value != _body) {
			NotificationChain msgs = null;
			if (_body != null){
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FORSTATEMENT_BODY , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.FORSTATEMENT;
	}
	
	
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FORSTATEMENT_EXPRESSION, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FORSTATEMENT_BODY, oldobj, newobj);
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
			case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
				return getExpression();
			case Java_PackageImpl.FORSTATEMENT_UPDATERS:
				return getUpdaters();
			case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
				return getInitializers();
			case Java_PackageImpl.FORSTATEMENT_BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.FORSTATEMENT_UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
			case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
			case Java_PackageImpl.FORSTATEMENT_BODY:
				setBody((Statement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
				return _expression != null; //single != null;
			case Java_PackageImpl.FORSTATEMENT_UPDATERS:
				return _updaters != null && !_updaters.isEmpty();
			case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
				return _initializers != null && !_initializers.isEmpty();
			case Java_PackageImpl.FORSTATEMENT_BODY:
				return _body != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
