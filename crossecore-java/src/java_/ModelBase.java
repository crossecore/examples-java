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
	private java.lang.String _name = "";
	public java.lang.String getName()
	{
		return _name;
	}
	public void setName(java.lang.String value){
		
		java.lang.String oldValue = _name;
		_name = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.MODEL_NAME, oldValue, value));
		
	}
	
	private Ocllib.Set<Package> _ownedElements;
	
	public Ocllib.Set<Package> getOwnedElements()
	{
		if(_ownedElements==null){
			_ownedElements = new Ocllib.Set<Package>(Package.class, this, Java_PackageImpl.MODEL_OWNEDELEMENTS, Java_PackageImpl.PACKAGE_MODEL);
		}
		return _ownedElements;
	
	}
	private Ocllib.Set<Type> _orphanTypes;
	
	public Ocllib.Set<Type> getOrphanTypes()
	{
		if(_orphanTypes==null){
			_orphanTypes = new Ocllib.Set<Type>(Type.class, this, Java_PackageImpl.MODEL_ORPHANTYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_ORPHANTYPES);
		}
		return _orphanTypes;
	
	}
	private Ocllib.Set<UnresolvedItem> _unresolvedItems;
	
	public Ocllib.Set<UnresolvedItem> getUnresolvedItems()
	{
		if(_unresolvedItems==null){
			_unresolvedItems = new Ocllib.Set<UnresolvedItem>(UnresolvedItem.class, this, Java_PackageImpl.MODEL_UNRESOLVEDITEMS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_UNRESOLVEDITEMS);
		}
		return _unresolvedItems;
	
	}
	private Ocllib.Set<CompilationUnit> _compilationUnits;
	
	public Ocllib.Set<CompilationUnit> getCompilationUnits()
	{
		if(_compilationUnits==null){
			_compilationUnits = new Ocllib.Set<CompilationUnit>(CompilationUnit.class, this, Java_PackageImpl.MODEL_COMPILATIONUNITS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_COMPILATIONUNITS);
		}
		return _compilationUnits;
	
	}
	private Ocllib.Set<ClassFile> _classFiles;
	
	public Ocllib.Set<ClassFile> getClassFiles()
	{
		if(_classFiles==null){
			_classFiles = new Ocllib.Set<ClassFile>(ClassFile.class, this, Java_PackageImpl.MODEL_CLASSFILES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_CLASSFILES);
		}
		return _classFiles;
	
	}
	private Ocllib.Set<Archive> _archives;
	
	public Ocllib.Set<Archive> getArchives()
	{
		if(_archives==null){
			_archives = new Ocllib.Set<Archive>(Archive.class, this, Java_PackageImpl.MODEL_ARCHIVES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_ARCHIVES);
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
			case Java_PackageImpl.MODEL_OWNEDELEMENTS:
				return getOwnedElements().basicAdd((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.MODEL_OWNEDELEMENTS:
				return getOwnedElements().basicRemove((Package)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.MODEL_NAME:
				return getName();
			case Java_PackageImpl.MODEL_OWNEDELEMENTS:
				return getOwnedElements();
			case Java_PackageImpl.MODEL_ORPHANTYPES:
				return getOrphanTypes();
			case Java_PackageImpl.MODEL_UNRESOLVEDITEMS:
				return getUnresolvedItems();
			case Java_PackageImpl.MODEL_COMPILATIONUNITS:
				return getCompilationUnits();
			case Java_PackageImpl.MODEL_CLASSFILES:
				return getClassFiles();
			case Java_PackageImpl.MODEL_ARCHIVES:
				return getArchives();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.MODEL_NAME:
				setName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.MODEL_OWNEDELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((java.util.Collection<? extends Package>) newValue);
				return;
			case Java_PackageImpl.MODEL_ORPHANTYPES:
				getOrphanTypes().clear();
				getOrphanTypes().addAll((java.util.Collection<? extends Type>) newValue);
				return;
			case Java_PackageImpl.MODEL_UNRESOLVEDITEMS:
				getUnresolvedItems().clear();
				getUnresolvedItems().addAll((java.util.Collection<? extends UnresolvedItem>) newValue);
				return;
			case Java_PackageImpl.MODEL_COMPILATIONUNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((java.util.Collection<? extends CompilationUnit>) newValue);
				return;
			case Java_PackageImpl.MODEL_CLASSFILES:
				getClassFiles().clear();
				getClassFiles().addAll((java.util.Collection<? extends ClassFile>) newValue);
				return;
			case Java_PackageImpl.MODEL_ARCHIVES:
				getArchives().clear();
				getArchives().addAll((java.util.Collection<? extends Archive>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
