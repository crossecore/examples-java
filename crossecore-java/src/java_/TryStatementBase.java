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
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRYSTATEMENT_BODY , value, value));
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
				msgs = ((InternalEObject)_finally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_FINALLY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_FINALLY, null, msgs);
			}
			msgs = basicSetFinally(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRYSTATEMENT_FINALLY , value, value));
		}
	}
	private Ocllib.OrderedSet<CatchClause> _catchClauses;
	
	public Ocllib.OrderedSet<CatchClause> getCatchClauses()
	{
		if(_catchClauses==null){
			_catchClauses = new Ocllib.OrderedSet<CatchClause>(CatchClause.class, this, Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRYSTATEMENT_FINALLY, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRYSTATEMENT_BODY, oldobj, newobj);
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
			case Java_PackageImpl.TRYSTATEMENT_BODY:
				return getBody();
			case Java_PackageImpl.TRYSTATEMENT_FINALLY:
				return getFinally();
			case Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES:
				return getCatchClauses();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TRYSTATEMENT_BODY:
				setBody((Block) newValue);
				return;
			case Java_PackageImpl.TRYSTATEMENT_FINALLY:
				setFinally((Block) newValue);
				return;
			case Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((java.util.Collection<? extends CatchClause>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
