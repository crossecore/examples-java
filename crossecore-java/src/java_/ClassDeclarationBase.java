package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ClassDeclarationBase 
extends TypeDeclarationImpl implements ClassDeclaration
{
	private TypeAccess _superClass;
	public TypeAccess getSuperClass()
	{
		
			return _superClass;
		
		
	}
	public void setSuperClass(TypeAccess value){
		if (value != _superClass) {
			NotificationChain msgs = null;
			if (_superClass != null){
				msgs = ((InternalEObject)_superClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, null, msgs);
			}
			msgs = basicSetSuperClass(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSDECLARATION_SUPERCLASS , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.CLASSDECLARATION;
	}
	
	
	public NotificationChain basicSetSuperClass(TypeAccess newobj, NotificationChain msgs) {
		TypeAccess oldobj = _superClass;
		_superClass = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, oldobj, newobj);
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
			case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
				return getSuperClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
				setSuperClass((TypeAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
				return _superClass != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
