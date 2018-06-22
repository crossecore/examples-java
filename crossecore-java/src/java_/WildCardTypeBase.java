package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class WildCardTypeBase 
extends TypeImpl implements WildCardType
{
	protected static final boolean UPPERBOUND_EDEFAULT = false;
	private boolean _upperBound = UPPERBOUND_EDEFAULT;
	public boolean isUpperBound()
	{
		return _upperBound;
	}
	public void setUpperBound(boolean value){
		
		boolean oldValue = _upperBound;
		_upperBound = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.WILDCARDTYPE_UPPERBOUND, oldValue, value));
		
	}
	
	
	
	private TypeAccess _bound;
	public TypeAccess getBound()
	{
		
			return _bound;
		
		
	}
	public void setBound(TypeAccess value){
		if (value != _bound) {
			NotificationChain msgs = null;
			if (_bound != null){
				msgs = ((InternalEObject)_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.WILDCARDTYPE_BOUND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.WILDCARDTYPE_BOUND, null, msgs);
			}
			msgs = basicSetBound(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.WILDCARDTYPE_BOUND , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.WILDCARDTYPE;
	}
	
	
	public NotificationChain basicSetBound(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _bound;
		_bound = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.WILDCARDTYPE_BOUND, oldobj, newobj);
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
			case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
				return isUpperBound();
			case Java_PackageImpl.WILDCARDTYPE_BOUND:
				return getBound();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
				setUpperBound((boolean) newValue);
				return;
			case Java_PackageImpl.WILDCARDTYPE_BOUND:
				setBound((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
				return _upperBound != UPPERBOUND_EDEFAULT;
			case Java_PackageImpl.WILDCARDTYPE_BOUND:
				return _bound != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
