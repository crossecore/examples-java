package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ContinueStatementBase 
extends StatementImpl implements ContinueStatement
{
	private LabeledStatement _label;
	public LabeledStatement getLabel()
	{
		
			return _label;
		
		
	}
	public void setLabel(LabeledStatement value){
		if (value != _label) {
			NotificationChain msgs = null;
			if (_label != null){
				msgs = ((InternalEObject)_label).eInverseRemove(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, LabeledStatement.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, LabeledStatement.class, msgs);
			}
			msgs = basicSetLabel(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONTINUESTATEMENT_LABEL , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CONTINUESTATEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
				if (_label != null){
					msgs = ((InternalEObject)_label).eInverseRemove(this, Java_PackageImpl.CONTINUESTATEMENT_LABEL, LabeledStatement.class, msgs);
				}
				return basicSetLabel((LabeledStatement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
				return basicSetLabel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetLabel(LabeledStatement newobj, NotificationChain msgs) {
		LabeledStatement oldobj = _label;
		_label = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONTINUESTATEMENT_LABEL, oldobj, newobj);
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
			case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
				setLabel((LabeledStatement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
				return getLabel() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
