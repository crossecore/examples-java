package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ManifestEntryBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements ManifestEntry
{
	protected static final java.lang.String NAME_EDEFAULT = "";
	private java.lang.String _name = NAME_EDEFAULT;
	public java.lang.String getName()
	{
		return _name;
	}
	public void setName(java.lang.String value){
		
		java.lang.String oldValue = _name;
		_name = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MANIFEST_ENTRY__NAME, oldValue, value));
		
	}
	
	
	
	private com.crossecore.ocl.Set<ManifestAttribute> _attributes;
	
	public com.crossecore.ocl.Set<ManifestAttribute> getAttributes()
	{
		if(_attributes==null){
			_attributes = new com.crossecore.ocl.Set<ManifestAttribute>(ManifestAttribute.class, this, Java_PackageImpl.MANIFEST_ENTRY__ATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST_ENTRY__ATTRIBUTES);
		}
		return _attributes;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MANIFESTENTRY;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST_ENTRY__NAME:
				return getName();
			case Java_PackageImpl.MANIFEST_ENTRY__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST_ENTRY__NAME:
				setName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.MANIFEST_ENTRY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((java.util.Collection<? extends ManifestAttribute>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST_ENTRY__NAME:
				return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
			case Java_PackageImpl.MANIFEST_ENTRY__ATTRIBUTES:
				return _attributes != null && !_attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
