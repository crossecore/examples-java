package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class MemberRefBase 
extends ASTNodeImpl implements MemberRef
{
	private NamedElement _member;
	public NamedElement getMember()
	{
		
			return _member;
		
		
	}
	public void setMember(NamedElement value){
		NamedElement oldvalue = _member;
		_member = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MEMBERREF_MEMBER , oldvalue, value));
		}
	}
	private TypeAccess _qualifier;
	public TypeAccess getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(TypeAccess value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MEMBERREF_QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MEMBERREF_QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MEMBERREF_QUALIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MEMBERREF;
	}
	
	
	public NotificationChain basicSetQualifier(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.MEMBERREF_QUALIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetMember(NamedElement newobj, NotificationChain msgs) {
		NamedElement oldobj = _member;
		_member = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.MEMBERREF_MEMBER, oldobj, newobj);
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
			case Java_PackageImpl.MEMBERREF_MEMBER:
				return getMember();
			case Java_PackageImpl.MEMBERREF_QUALIFIER:
				return getQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MEMBERREF_MEMBER:
				setMember((NamedElement) newValue);
				return;
			case Java_PackageImpl.MEMBERREF_QUALIFIER:
				setQualifier((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MEMBERREF_MEMBER:
				return getMember() != null; //single, volatile
			case Java_PackageImpl.MEMBERREF_QUALIFIER:
				return _qualifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
