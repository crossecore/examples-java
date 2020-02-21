package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class CatchClauseBase 
extends StatementImpl implements CatchClause
{
	private SingleVariableDeclaration _exception;
	public SingleVariableDeclaration getException()
	{
		
			return _exception;
		
		
	}
	public void setException(SingleVariableDeclaration value){
		if (value != _exception) {
			NotificationChain msgs = null;
			if (_exception != null){
				msgs = ((InternalEObject)_exception).eInverseRemove(this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, SingleVariableDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, SingleVariableDeclaration.class, msgs);
			}
			msgs = basicSetException(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CATCH_CLAUSE__EXCEPTION , value, value));
		}
	}
	private Block _body;
	public Block getBody()
	{
		
			return _body;
		
		
	}
	public void setBody(Block value){
		if (value != _body) {
			NotificationChain msgs = null;
			if (_body != null){
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CATCH_CLAUSE__BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CATCH_CLAUSE__BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CATCH_CLAUSE__BODY , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CATCHCLAUSE;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CATCH_CLAUSE__EXCEPTION:
				if (_exception != null){
					msgs = ((InternalEObject)_exception).eInverseRemove(this, Java_PackageImpl.CATCH_CLAUSE__EXCEPTION, SingleVariableDeclaration.class, msgs);
				}
				return basicSetException((SingleVariableDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CATCH_CLAUSE__EXCEPTION:
				return basicSetException(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetException(SingleVariableDeclaration newobj, NotificationChain msgs) {
		SingleVariableDeclaration oldobj = _exception;
		_exception = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CATCH_CLAUSE__EXCEPTION, oldobj, newobj);
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
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CATCH_CLAUSE__BODY, oldobj, newobj);
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
			case Java_PackageImpl.CATCH_CLAUSE__EXCEPTION:
				return getException();
			case Java_PackageImpl.CATCH_CLAUSE__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CATCH_CLAUSE__EXCEPTION:
				setException((SingleVariableDeclaration) newValue);
				return;
			case Java_PackageImpl.CATCH_CLAUSE__BODY:
				setBody((Block) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CATCH_CLAUSE__EXCEPTION:
				return _exception != null; //single != null;
			case Java_PackageImpl.CATCH_CLAUSE__BODY:
				return _body != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
