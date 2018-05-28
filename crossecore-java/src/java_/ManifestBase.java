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
	private Ocllib.Set<ManifestAttribute> _mainAttributes;
	
	public Ocllib.Set<ManifestAttribute> getMainAttributes()
	{
		if(_mainAttributes==null){
			_mainAttributes = new Ocllib.Set<ManifestAttribute>(ManifestAttribute.class, this, Java_PackageImpl.MANIFEST_MAINATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST_MAINATTRIBUTES);
		}
		return _mainAttributes;
	
	}
	private Ocllib.Set<ManifestEntry> _entryAttributes;
	
	public Ocllib.Set<ManifestEntry> getEntryAttributes()
	{
		if(_entryAttributes==null){
			_entryAttributes = new Ocllib.Set<ManifestEntry>(ManifestEntry.class, this, Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES);
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
			case Java_PackageImpl.MANIFEST_MAINATTRIBUTES:
				return getMainAttributes();
			case Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES:
				return getEntryAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MANIFEST_MAINATTRIBUTES:
				getMainAttributes().clear();
				getMainAttributes().addAll((java.util.Collection<? extends ManifestAttribute>) newValue);
				return;
			case Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES:
				getEntryAttributes().clear();
				getEntryAttributes().addAll((java.util.Collection<? extends ManifestEntry>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
