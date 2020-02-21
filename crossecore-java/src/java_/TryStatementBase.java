package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TryStatementBase 
extends StatementImpl implements TryStatement
{
	private Block _body;
	public Block getBody()
	{
		
			return _body;
		
		
	}
	public void setBody(Block value){
		if (value != _body) {
			NotificationChain msgs = null;
			if (_body != null){
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRY_STATEMENT__BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRY_STATEMENT__BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRY_STATEMENT__BODY , value, value));
		}
	}
	private Block _finally;
	public Block getFinally()
	{
		
			return _finally;
		
		
	}
	public void setFinally(Block value){
		if (value != _finally) {
			NotificationChain msgs = null;
			if (_finally != null){
				msgs = ((InternalEObject)_finally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRY_STATEMENT__FINALLY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRY_STATEMENT__FINALLY, null, msgs);
			}
			msgs = basicSetFinally(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRY_STATEMENT__FINALLY , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<CatchClause> _catchClauses;
	
	public com.crossecore.ocl.OrderedSet<CatchClause> getCatchClauses()
	{
		if(_catchClauses==null){
			_catchClauses = new com.crossecore.ocl.OrderedSet<CatchClause>(CatchClause.class, this, Java_PackageImpl.TRY_STATEMENT__CATCH_CLAUSES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRY_STATEMENT__CATCH_CLAUSES);
		}
		return _catchClauses;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TRYSTATEMENT;
	}
	
	
	public NotificationChain basicSetFinally(Block newobj, NotificationChain msgs) {
		Block oldobj = _finally;
		_finally = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRY_STATEMENT__FINALLY, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
		Block oldobj = _body;
		_body = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRY_STATEMENT__BODY, oldobj, newobj);
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
			case Java_PackageImpl.TRY_STATEMENT__BODY:
				return getBody();
			case Java_PackageImpl.TRY_STATEMENT__FINALLY:
				return getFinally();
			case Java_PackageImpl.TRY_STATEMENT__CATCH_CLAUSES:
				return getCatchClauses();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TRY_STATEMENT__BODY:
				setBody((Block) newValue);
				return;
			case Java_PackageImpl.TRY_STATEMENT__FINALLY:
				setFinally((Block) newValue);
				return;
			case Java_PackageImpl.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((java.util.Collection<? extends CatchClause>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TRY_STATEMENT__BODY:
				return _body != null; //single != null;
			case Java_PackageImpl.TRY_STATEMENT__FINALLY:
				return _finally != null; //single != null;
			case Java_PackageImpl.TRY_STATEMENT__CATCH_CLAUSES:
				return _catchClauses != null && !_catchClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
