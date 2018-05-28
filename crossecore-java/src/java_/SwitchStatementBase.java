package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class SwitchStatementBase 
extends StatementImpl implements SwitchStatement
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
				msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION , value, value));
		}
	}
	private Ocllib.OrderedSet<Statement> _statements;
	
	public Ocllib.OrderedSet<Statement> getStatements()
	{
		if(_statements==null){
			_statements = new Ocllib.OrderedSet<Statement>(Statement.class, this, Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS);
		}
		return _statements;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.SWITCHSTATEMENT;
	}
	
	
	public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _expression;
		_expression = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, oldobj, newobj);
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
			case Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION:
				return getExpression();
			case Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS:
				return getStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION:
				setExpression((Expression) newValue);
				return;
			case Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS:
				getStatements().clear();
				getStatements().addAll((java.util.Collection<? extends Statement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
