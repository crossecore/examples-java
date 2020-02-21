package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class PackageBase 
extends NamedElementImpl implements Package
{
	private com.crossecore.ocl.Set<AbstractTypeDeclaration> _ownedElements;
	
	public com.crossecore.ocl.Set<AbstractTypeDeclaration> getOwnedElements()
	{
		if(_ownedElements==null){
			_ownedElements = new com.crossecore.ocl.Set<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_PackageImpl.PACKAGE__OWNED_ELEMENTS, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE);
		}
		return _ownedElements;
	
	}
	public Model getModel()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.PACKAGE__MODEL) return null;
			return (Model)eInternalContainer();
		
		
	}
	public void setModel(Model value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.MODEL__OWNED_ELEMENTS, Model.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODEL__OWNED_ELEMENTS, Model.class, msgs);
			}
			msgs = basicSetModel(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE__MODEL , value, value));
		}
	}
	private com.crossecore.ocl.Set<Package> _ownedPackages;
	
	public com.crossecore.ocl.Set<Package> getOwnedPackages()
	{
		if(_ownedPackages==null){
			_ownedPackages = new com.crossecore.ocl.Set<Package>(Package.class, this, Java_PackageImpl.PACKAGE__OWNED_PACKAGES, Java_PackageImpl.PACKAGE__PACKAGE);
		}
		return _ownedPackages;
	
	}
	public Package getPackage()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.PACKAGE__PACKAGE) return null;
			return (Package)eInternalContainer();
		
		
	}
	public void setPackage(Package value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE__OWNED_PACKAGES, Package.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE__OWNED_PACKAGES, Package.class, msgs);
			}
			msgs = basicSetPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE__PACKAGE , value, value));
		}
	}
	private com.crossecore.ocl.Set<PackageAccess> _usagesInPackageAccess;
	
	public com.crossecore.ocl.Set<PackageAccess> getUsagesInPackageAccess()
	{
		if(_usagesInPackageAccess==null){
			_usagesInPackageAccess = new com.crossecore.ocl.Set<PackageAccess>(PackageAccess.class, this, Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Java_PackageImpl.PACKAGE_ACCESS__PACKAGE);
		}
		return _usagesInPackageAccess;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.PACKAGE;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE__MODEL:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetModel((Model)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__PACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetPackage((Package)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__OWNED_ELEMENTS:
				return getOwnedElements().basicAdd((AbstractTypeDeclaration)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess().basicAdd((PackageAccess)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages().basicAdd((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE__MODEL:
				return basicSetModel(null, msgs);
			case Java_PackageImpl.PACKAGE__PACKAGE:
				return basicSetPackage(null, msgs);
			case Java_PackageImpl.PACKAGE__OWNED_ELEMENTS:
				return getOwnedElements().basicRemove((AbstractTypeDeclaration)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess().basicRemove((PackageAccess)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages().basicRemove((Package)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetModel(Model newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE__MODEL, msgs);
			return msgs;
	}
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE__PACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_PackageImpl.PACKAGE__MODEL:
				return getModel();
			case Java_PackageImpl.PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages();
			case Java_PackageImpl.PACKAGE__PACKAGE:
				return getPackage();
			case Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((java.util.Collection<? extends AbstractTypeDeclaration>) newValue);
				return;
			case Java_PackageImpl.PACKAGE__MODEL:
				setModel((Model) newValue);
				return;
			case Java_PackageImpl.PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((java.util.Collection<? extends Package>) newValue);
				return;
			case Java_PackageImpl.PACKAGE__PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
				getUsagesInPackageAccess().addAll((java.util.Collection<? extends PackageAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE__OWNED_ELEMENTS:
				return _ownedElements != null && !_ownedElements.isEmpty();
			case Java_PackageImpl.PACKAGE__MODEL:
				return getModel() != null; //single, volatile
			case Java_PackageImpl.PACKAGE__OWNED_PACKAGES:
				return _ownedPackages != null && !_ownedPackages.isEmpty();
			case Java_PackageImpl.PACKAGE__PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
