package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class LabeledStatementBase 
extends NamedElementImpl implements LabeledStatement
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
				msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.LABELEDSTATEMENT_BODY, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.LABELEDSTATEMENT_BODY, null, msgs);
			}
			msgs = basicSetBody(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.LABELEDSTATEMENT_BODY , value, value));
		}
	}
	private Ocllib.Set<BreakStatement> _usagesInBreakStatements;
	
	public Ocllib.Set<BreakStatement> getUsagesInBreakStatements()
	{
		if(_usagesInBreakStatements==null){
			_usagesInBreakStatements = new Ocllib.Set<BreakStatement>(BreakStatement.class, this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS, Java_PackageImpl.BREAKSTATEMENT_LABEL);
		}
		return _usagesInBreakStatements;
	
	}
	private Ocllib.Set<ContinueStatement> _usagesInContinueStatements;
	
	public Ocllib.Set<ContinueStatement> getUsagesInContinueStatements()
	{
		if(_usagesInContinueStatements==null){
			_usagesInContinueStatements = new Ocllib.Set<ContinueStatement>(ContinueStatement.class, this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, Java_PackageImpl.CONTINUESTATEMENT_LABEL);
		}
		return _usagesInContinueStatements;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.LABELEDSTATEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
				return getUsagesInContinueStatements().basicAdd((ContinueStatement)otherEnd, msgs);
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
				return getUsagesInBreakStatements().basicAdd((BreakStatement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
				return getUsagesInContinueStatements().basicRemove((ContinueStatement)otherEnd, msgs);
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
				return getUsagesInBreakStatements().basicRemove((BreakStatement)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetBody(Statement newobj, NotificationChain msgs) {
		Statement oldobj = _body;
		_body = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.LABELEDSTATEMENT_BODY, oldobj, newobj);
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
			case Java_PackageImpl.LABELEDSTATEMENT_BODY:
				return getBody();
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
				return getUsagesInBreakStatements();
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
				return getUsagesInContinueStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.LABELEDSTATEMENT_BODY:
				setBody((Statement) newValue);
				return;
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
				getUsagesInBreakStatements().clear();
				getUsagesInBreakStatements().addAll((java.util.Collection<? extends BreakStatement>) newValue);
				return;
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
				getUsagesInContinueStatements().clear();
				getUsagesInContinueStatements().addAll((java.util.Collection<? extends ContinueStatement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.LABELEDSTATEMENT_BODY:
				return _body != null; //single != null;
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
				return getUsagesInBreakStatements().isEmpty(); //many, volatile
			case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
				return getUsagesInContinueStatements().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
