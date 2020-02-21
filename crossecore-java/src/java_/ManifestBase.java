package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ManifestBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Manifest
{
	private com.crossecore.ocl.Set<ManifestAttribute> _mainAttributes;
	
	public com.crossecore.ocl.Set<ManifestAttribute> getMainAttributes()
	{
		if(_mainAttributes==null){
			_mainAttributes = new com.crossecore.ocl.Set<ManifestAttribute>(ManifestAttribute.class, this, Java_PackageImpl.MANIFEST__MAIN_ATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST__MAIN_ATTRIBUTES);
		}
		return _mainAttributes;
	
	}
	private com.crossecore.ocl.Set<ManifestEntry> _entryAttributes;
	
	public com.crossecore.ocl.Set<ManifestEntry> getEntryAttributes()
	{
		if(_entryAttributes==null){
			_entryAttributes = new com.crossecore.ocl.Set<ManifestEntry>(ManifestEntry.class, this, Java_PackageImpl.MANIFEST__ENTRY_ATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST__ENTRY_ATTRIBUTES);
		}
		return _entryAttributes;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MANIFEST;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST__MAIN_ATTRIBUTES:
				return getMainAttributes();
			case Java_PackageImpl.MANIFEST__ENTRY_ATTRIBUTES:
				return getEntryAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				getMainAttributes().addAll((java.util.Collection<? extends ManifestAttribute>) newValue);
				return;
			case Java_PackageImpl.MANIFEST__ENTRY_ATTRIBUTES:
				getEntryAttributes().clear();
				getEntryAttributes().addAll((java.util.Collection<? extends ManifestEntry>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST__MAIN_ATTRIBUTES:
				return _mainAttributes != null && !_mainAttributes.isEmpty();
			case Java_PackageImpl.MANIFEST__ENTRY_ATTRIBUTES:
				return _entryAttributes != null && !_entryAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
