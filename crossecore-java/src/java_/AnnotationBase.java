package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AnnotationBase 
extends ExpressionImpl implements Annotation
{
	private TypeAccess _type;
	public TypeAccess getType()
	{
		
			return _type;
		
		
	}
	public void setType(TypeAccess value){
		if (value != _type) {
			NotificationChain msgs = null;
			if (_type != null){
				msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE, null, msgs);
			}
			msgs = basicSetType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATION_TYPE , value, value));
		}
	}
	private Ocllib.OrderedSet<AnnotationMemberValuePair> _values;
	
	public Ocllib.OrderedSet<AnnotationMemberValuePair> getValues()
	{
		if(_values==null){
			_values = new Ocllib.OrderedSet<AnnotationMemberValuePair>(AnnotationMemberValuePair.class, this, Java_PackageImpl.ANNOTATION_VALUES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_VALUES);
		}
		return _values;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ANNOTATION;
	}
	
	
	public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _type;
		_type = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATION_TYPE, oldobj, newobj);
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
			case Java_PackageImpl.ANNOTATION_TYPE:
				return getType();
			case Java_PackageImpl.ANNOTATION_VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE:
				setType((TypeAccess) newValue);
				return;
			case Java_PackageImpl.ANNOTATION_VALUES:
				getValues().clear();
				getValues().addAll((java.util.Collection<? extends AnnotationMemberValuePair>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ANNOTATION_TYPE:
				return _type != null; //single != null;
			case Java_PackageImpl.ANNOTATION_VALUES:
				return _values != null && !_values.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
