package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class PackageAccessBase 
extends NamespaceAccessImpl implements PackageAccess
{
	private Package _package;
	public Package getPackage()
	{
		
			return _package;
		
		
	}
	public void setPackage(Package value){
		if (value != _package) {
			NotificationChain msgs = null;
			if (_package != null){
				msgs = ((InternalEObject)_package).eInverseRemove(this, Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Package.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Package.class, msgs);
			}
			msgs = basicSetPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE_ACCESS__PACKAGE , value, value));
		}
	}
	private PackageAccess _qualifier;
	public PackageAccess getQualifier()
	{
		
			return _qualifier;
		
		
	}
	public void setQualifier(PackageAccess value){
		if (value != _qualifier) {
			NotificationChain msgs = null;
			if (_qualifier != null){
				msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER, null, msgs);
			}
			msgs = basicSetQualifier(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.PACKAGEACCESS;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_ACCESS__PACKAGE:
				if (_package != null){
					msgs = ((InternalEObject)_package).eInverseRemove(this, Java_PackageImpl.PACKAGE_ACCESS__PACKAGE, Package.class, msgs);
				}
				return basicSetPackage((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_ACCESS__PACKAGE:
				return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetQualifier(PackageAccess newobj, NotificationChain msgs) {
		PackageAccess oldobj = _qualifier;
		_qualifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
		Package oldobj = _package;
		_package = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PACKAGE_ACCESS__PACKAGE, oldobj, newobj);
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
			case Java_PackageImpl.PACKAGE_ACCESS__PACKAGE:
				return getPackage();
			case Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER:
				return getQualifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_ACCESS__PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER:
				setQualifier((PackageAccess) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_ACCESS__PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.PACKAGE_ACCESS__QUALIFIER:
				return _qualifier != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
