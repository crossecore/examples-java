package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ArchiveBase 
extends NamedElementImpl implements Archive
{
	protected static final java.lang.String ORIGINALFILEPATH_EDEFAULT = "";
	private java.lang.String _originalFilePath = ORIGINALFILEPATH_EDEFAULT;
	public java.lang.String getOriginalFilePath()
	{
		return _originalFilePath;
	}
	public void setOriginalFilePath(java.lang.String value){
		
		java.lang.String oldValue = _originalFilePath;
		_originalFilePath = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.ARCHIVE__ORIGINAL_FILE_PATH, oldValue, value));
		
	}
	
	
	
	private com.crossecore.ocl.Set<ClassFile> _classFiles;
	
	public com.crossecore.ocl.Set<ClassFile> getClassFiles()
	{
		if(_classFiles==null){
			_classFiles = new com.crossecore.ocl.Set<ClassFile>(ClassFile.class, this, Java_PackageImpl.ARCHIVE__CLASS_FILES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE__CLASS_FILES);
		}
		return _classFiles;
	
	}
	private Manifest _manifest;
	public Manifest getManifest()
	{
		
			return _manifest;
		
		
	}
	public void setManifest(Manifest value){
		if (value != _manifest) {
			NotificationChain msgs = null;
			if (_manifest != null){
				msgs = ((InternalEObject)_manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE__MANIFEST, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE__MANIFEST, null, msgs);
			}
			msgs = basicSetManifest(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARCHIVE__MANIFEST , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ARCHIVE;
	}
	
	
	public NotificationChain basicSetManifest(Manifest newobj, NotificationChain msgs) {
		Manifest oldobj = _manifest;
		_manifest = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARCHIVE__MANIFEST, oldobj, newobj);
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
			case Java_PackageImpl.ARCHIVE__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_PackageImpl.ARCHIVE__CLASS_FILES:
				return getClassFiles();
			case Java_PackageImpl.ARCHIVE__MANIFEST:
				return getManifest();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARCHIVE__ORIGINAL_FILE_PATH:
				setOriginalFilePath((java.lang.String) newValue);
				return;
			case Java_PackageImpl.ARCHIVE__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((java.util.Collection<? extends ClassFile>) newValue);
				return;
			case Java_PackageImpl.ARCHIVE__MANIFEST:
				setManifest((Manifest) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ARCHIVE__ORIGINAL_FILE_PATH:
				return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
			case Java_PackageImpl.ARCHIVE__CLASS_FILES:
				return _classFiles != null && !_classFiles.isEmpty();
			case Java_PackageImpl.ARCHIVE__MANIFEST:
				return _manifest != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
