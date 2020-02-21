package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AnnotationTypeMemberDeclarationBase 
extends BodyDeclarationImpl implements AnnotationTypeMemberDeclaration
{
	private Expression _default;
	public Expression getDefault()
	{
		
			return _default;
		
		
	}
	public void setDefault(Expression value){
		if (value != _default) {
			NotificationChain msgs = null;
			if (_default != null){
				msgs = ((InternalEObject)_default).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			}
			msgs = basicSetDefault(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT , value, value));
		}
	}
	private TypeAccess _type;
	public TypeAccess getType()
	{
		
			return _type;
		
		
	}
	public void setType(TypeAccess value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE , value, value));
		}
	}
	private com.crossecore.ocl.Set<AnnotationMemberValuePair> _usages;
	
	public com.crossecore.ocl.Set<AnnotationMemberValuePair> getUsages()
	{
		if(_usages==null){
			_usages = new com.crossecore.ocl.Set<AnnotationMemberValuePair>(AnnotationMemberValuePair.class, this, Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES, Java_PackageImpl.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER);
		}
		return _usages;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ANNOTATIONTYPEMEMBERDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				return getUsages().basicAdd((AnnotationMemberValuePair)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				return getUsages().basicRemove((AnnotationMemberValuePair)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetDefault(Expression newobj, NotificationChain msgs) {
		Expression oldobj = _default;
		_default = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, oldobj, newobj);
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
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault();
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType();
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				return getUsages();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression) newValue);
				return;
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				getUsages().clear();
				getUsages().addAll((java.util.Collection<? extends AnnotationMemberValuePair>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return _default != null; //single != null;
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				return getUsages().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
