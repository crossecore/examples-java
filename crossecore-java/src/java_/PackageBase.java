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
	private Ocllib.Set<AbstractTypeDeclaration> _ownedElements;
	
	public Ocllib.Set<AbstractTypeDeclaration> getOwnedElements()
	{
		if(_ownedElements==null){
			_ownedElements = new Ocllib.Set<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE);
		}
		return _ownedElements;
	
	}
	public Model getModel()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.PACKAGE_MODEL) return null;
			return (Model)eInternalContainer();
		
		
	}
	public void setModel(Model value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.MODEL_OWNEDELEMENTS, Model.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODEL_OWNEDELEMENTS, Model.class, msgs);
			}
			msgs = basicSetModel(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE_MODEL , value, value));
		}
	}
	private Ocllib.Set<Package> _ownedPackages;
	
	public Ocllib.Set<Package> getOwnedPackages()
	{
		if(_ownedPackages==null){
			_ownedPackages = new Ocllib.Set<Package>(Package.class, this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, Java_PackageImpl.PACKAGE_PACKAGE);
		}
		return _ownedPackages;
	
	}
	public Package getPackage()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.PACKAGE_PACKAGE) return null;
			return (Package)eInternalContainer();
		
		
	}
	public void setPackage(Package value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, Package.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, Package.class, msgs);
			}
			msgs = basicSetPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGE_PACKAGE , value, value));
		}
	}
	private Ocllib.Set<PackageAccess> _usagesInPackageAccess;
	
	public Ocllib.Set<PackageAccess> getUsagesInPackageAccess()
	{
		if(_usagesInPackageAccess==null){
			_usagesInPackageAccess = new Ocllib.Set<PackageAccess>(PackageAccess.class, this, Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS, Java_PackageImpl.PACKAGEACCESS_PACKAGE);
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
			case Java_PackageImpl.PACKAGE_MODEL:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetModel((Model)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
				return getOwnedPackages().basicAdd((Package)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
				return getUsagesInPackageAccess().basicAdd((PackageAccess)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
				return getOwnedElements().basicAdd((AbstractTypeDeclaration)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_PACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetPackage((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_MODEL:
				return basicSetModel(null, msgs);
			case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
				return getOwnedPackages().basicRemove((Package)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
				return getUsagesInPackageAccess().basicRemove((PackageAccess)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
				return getOwnedElements().basicRemove((AbstractTypeDeclaration)otherEnd, msgs);
			case Java_PackageImpl.PACKAGE_PACKAGE:
				return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetModel(Model newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE_MODEL, msgs);
			return msgs;
	}
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE_PACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
				return getOwnedElements();
			case Java_PackageImpl.PACKAGE_MODEL:
				return getModel();
			case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
				return getOwnedPackages();
			case Java_PackageImpl.PACKAGE_PACKAGE:
				return getPackage();
			case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
				return getUsagesInPackageAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((java.util.Collection<? extends AbstractTypeDeclaration>) newValue);
				return;
			case Java_PackageImpl.PACKAGE_MODEL:
				setModel((Model) newValue);
				return;
			case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((java.util.Collection<? extends Package>) newValue);
				return;
			case Java_PackageImpl.PACKAGE_PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
				getUsagesInPackageAccess().clear();
				getUsagesInPackageAccess().addAll((java.util.Collection<? extends PackageAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
				return _ownedElements != null && !_ownedElements.isEmpty();
			case Java_PackageImpl.PACKAGE_MODEL:
				return getModel() != null; //single, volatile
			case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
				return _ownedPackages != null && !_ownedPackages.isEmpty();
			case Java_PackageImpl.PACKAGE_PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
				return getUsagesInPackageAccess().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
