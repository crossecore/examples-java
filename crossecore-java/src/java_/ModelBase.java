package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ModelBase 
extends org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container implements Model
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
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODEL__NAME, oldValue, value));
		
	}
	
	
	
	private com.crossecore.ocl.Set<Package> _ownedElements;
	
	public com.crossecore.ocl.Set<Package> getOwnedElements()
	{
		if(_ownedElements==null){
			_ownedElements = new com.crossecore.ocl.Set<Package>(Package.class, this, Java_PackageImpl.MODEL__OWNED_ELEMENTS, Java_PackageImpl.PACKAGE__MODEL);
		}
		return _ownedElements;
	
	}
	private com.crossecore.ocl.Set<Type> _orphanTypes;
	
	public com.crossecore.ocl.Set<Type> getOrphanTypes()
	{
		if(_orphanTypes==null){
			_orphanTypes = new com.crossecore.ocl.Set<Type>(Type.class, this, Java_PackageImpl.MODEL__ORPHAN_TYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL__ORPHAN_TYPES);
		}
		return _orphanTypes;
	
	}
	private com.crossecore.ocl.Set<UnresolvedItem> _unresolvedItems;
	
	public com.crossecore.ocl.Set<UnresolvedItem> getUnresolvedItems()
	{
		if(_unresolvedItems==null){
			_unresolvedItems = new com.crossecore.ocl.Set<UnresolvedItem>(UnresolvedItem.class, this, Java_PackageImpl.MODEL__UNRESOLVED_ITEMS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL__UNRESOLVED_ITEMS);
		}
		return _unresolvedItems;
	
	}
	private com.crossecore.ocl.Set<CompilationUnit> _compilationUnits;
	
	public com.crossecore.ocl.Set<CompilationUnit> getCompilationUnits()
	{
		if(_compilationUnits==null){
			_compilationUnits = new com.crossecore.ocl.Set<CompilationUnit>(CompilationUnit.class, this, Java_PackageImpl.MODEL__COMPILATION_UNITS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL__COMPILATION_UNITS);
		}
		return _compilationUnits;
	
	}
	private com.crossecore.ocl.Set<ClassFile> _classFiles;
	
	public com.crossecore.ocl.Set<ClassFile> getClassFiles()
	{
		if(_classFiles==null){
			_classFiles = new com.crossecore.ocl.Set<ClassFile>(ClassFile.class, this, Java_PackageImpl.MODEL__CLASS_FILES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL__CLASS_FILES);
		}
		return _classFiles;
	
	}
	private com.crossecore.ocl.Set<Archive> _archives;
	
	public com.crossecore.ocl.Set<Archive> getArchives()
	{
		if(_archives==null){
			_archives = new com.crossecore.ocl.Set<Archive>(Archive.class, this, Java_PackageImpl.MODEL__ARCHIVES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL__ARCHIVES);
		}
		return _archives;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.MODEL;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.MODEL__OWNED_ELEMENTS:
				return getOwnedElements().basicAdd((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.MODEL__OWNED_ELEMENTS:
				return getOwnedElements().basicRemove((Package)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MODEL__NAME:
				return getName();
			case Java_PackageImpl.MODEL__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_PackageImpl.MODEL__ORPHAN_TYPES:
				return getOrphanTypes();
			case Java_PackageImpl.MODEL__UNRESOLVED_ITEMS:
				return getUnresolvedItems();
			case Java_PackageImpl.MODEL__COMPILATION_UNITS:
				return getCompilationUnits();
			case Java_PackageImpl.MODEL__CLASS_FILES:
				return getClassFiles();
			case Java_PackageImpl.MODEL__ARCHIVES:
				return getArchives();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MODEL__NAME:
				setName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.MODEL__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((java.util.Collection<? extends Package>) newValue);
				return;
			case Java_PackageImpl.MODEL__ORPHAN_TYPES:
				getOrphanTypes().clear();
				getOrphanTypes().addAll((java.util.Collection<? extends Type>) newValue);
				return;
			case Java_PackageImpl.MODEL__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				getUnresolvedItems().addAll((java.util.Collection<? extends UnresolvedItem>) newValue);
				return;
			case Java_PackageImpl.MODEL__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((java.util.Collection<? extends CompilationUnit>) newValue);
				return;
			case Java_PackageImpl.MODEL__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((java.util.Collection<? extends ClassFile>) newValue);
				return;
			case Java_PackageImpl.MODEL__ARCHIVES:
				getArchives().clear();
				getArchives().addAll((java.util.Collection<? extends Archive>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.MODEL__NAME:
				return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
			case Java_PackageImpl.MODEL__OWNED_ELEMENTS:
				return _ownedElements != null && !_ownedElements.isEmpty();
			case Java_PackageImpl.MODEL__ORPHAN_TYPES:
				return _orphanTypes != null && !_orphanTypes.isEmpty();
			case Java_PackageImpl.MODEL__UNRESOLVED_ITEMS:
				return _unresolvedItems != null && !_unresolvedItems.isEmpty();
			case Java_PackageImpl.MODEL__COMPILATION_UNITS:
				return _compilationUnits != null && !_compilationUnits.isEmpty();
			case Java_PackageImpl.MODEL__CLASS_FILES:
				return _classFiles != null && !_classFiles.isEmpty();
			case Java_PackageImpl.MODEL__ARCHIVES:
				return _archives != null && !_archives.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
