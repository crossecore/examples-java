package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AnnotationMemberValuePairBase 
extends NamedElementImpl implements AnnotationMemberValuePair
{
	private AnnotationTypeMemberDeclaration _member;
	public AnnotationTypeMemberDeclaration getMember()
	{
		
			return _member;
		
		
	}
	public void setMember(AnnotationTypeMemberDeclaration value){
		if (value != _member) {
			NotificationChain msgs = null;
			if (_member != null){
				msgs = ((InternalEObject)_member).eInverseRemove(this, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, AnnotationTypeMemberDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, AnnotationTypeMemberDeclaration.class, msgs);
			}
			msgs = basicSetMember(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER , value, value));
		}
	}
	private Expression _value;
	public Expression getValue()
	{
		
			return _value;
		
		
	}
	public void setValue(Expression value){
		if (value != _value) {
			NotificationChain msgs = null;
			if (_value != null){
				msgs = ((InternalEObject)_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, null, msgs);
			}
			msgs = basicSetValue(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ANNOTATIONMEMBERVALUEPAIR;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
				if (_member != null){
					msgs = ((InternalEObject)_member).eInverseRemove(this, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER, AnnotationTypeMemberDeclaration.class, msgs);
				}
				return basicSetMember((AnnotationTypeMemberDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
				return basicSetMember(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetMember(AnnotationTypeMemberDeclaration newobj, NotificationChain msgs) {
		AnnotationTypeMemberDeclaration oldobj = _member;
		_member = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetValue(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _value;
		_value = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, oldobj, newobj);
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
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
				return getMember();
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
				setMember((AnnotationTypeMemberDeclaration) newValue);
				return;
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE:
				setValue((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
				return getMember() != null; //single, volatile
			case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE:
				return _value != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
