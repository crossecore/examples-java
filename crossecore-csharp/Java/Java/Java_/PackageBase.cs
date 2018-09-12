/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using oclstdlib;
using Ecore;
namespace Java_{
	public class PackageBase 
	:NamedElementImpl, Package
	{
		private Set<AbstractTypeDeclaration> _ownedElements;
		
		public virtual Set<AbstractTypeDeclaration> ownedElements
		{
			get {
				if(_ownedElements==null){
					_ownedElements = new Set<AbstractTypeDeclaration>(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE);
				}
				return _ownedElements;
			}
		
		}
		public virtual Model model
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.PACKAGE_MODEL) return default(Model);
				return (Model)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.MODEL_OWNEDELEMENTS, typeof(Package), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODEL_OWNEDELEMENTS, typeof(Package), msgs);
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
		}
		private Set<Package> _ownedPackages;
		
		public virtual Set<Package> ownedPackages
		{
			get {
				if(_ownedPackages==null){
					_ownedPackages = new Set<Package>(this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, Java_PackageImpl.PACKAGE_PACKAGE);
				}
				return _ownedPackages;
			}
		
		}
		public virtual Package package
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.PACKAGE_PACKAGE) return default(Package);
				return (Package)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, typeof(Package), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_OWNEDPACKAGES, typeof(Package), msgs);
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
		}
		private Set<PackageAccess> _usagesInPackageAccess;
		
		public virtual Set<PackageAccess> usagesInPackageAccess
		{
			get {
				if(_usagesInPackageAccess==null){
					_usagesInPackageAccess = new Set<PackageAccess>(this, Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS, Java_PackageImpl.PACKAGEACCESS_PACKAGE);
				}
				return _usagesInPackageAccess;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.PACKAGE;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
					return ownedElements.basicAdd((AbstractTypeDeclaration)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
					return ownedPackages.basicAdd((Package)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_PACKAGE:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetPackage((Package)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_MODEL:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetModel((Model)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
					return usagesInPackageAccess.basicAdd((PackageAccess)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
					return ownedElements.basicRemove((AbstractTypeDeclaration)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
					return ownedPackages.basicRemove((Package)otherEnd, msgs);
				case Java_PackageImpl.PACKAGE_PACKAGE:
					return basicSetPackage(null, msgs);
				case Java_PackageImpl.PACKAGE_MODEL:
					return basicSetModel(null, msgs);
				case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
					return usagesInPackageAccess.basicRemove((PackageAccess)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE_PACKAGE, msgs);
				return msgs;
		}
		public NotificationChain basicSetModel(Model newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.PACKAGE_MODEL, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
					return ownedElements;
				case Java_PackageImpl.PACKAGE_MODEL:
					return model;
				case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
					return ownedPackages;
				case Java_PackageImpl.PACKAGE_PACKAGE:
					return package;
				case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
					return usagesInPackageAccess;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGE_OWNEDELEMENTS:
					ownedElements.Clear();
					ownedElements.AddRange(((List<EObject>)newValue)?.Cast<AbstractTypeDeclaration>());
					return;
				case Java_PackageImpl.PACKAGE_MODEL:
					model = (Model) newValue;
					return;
				case Java_PackageImpl.PACKAGE_OWNEDPACKAGES:
					ownedPackages.Clear();
					ownedPackages.AddRange(((List<EObject>)newValue)?.Cast<Package>());
					return;
				case Java_PackageImpl.PACKAGE_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS:
					usagesInPackageAccess.Clear();
					usagesInPackageAccess.AddRange(((List<EObject>)newValue)?.Cast<PackageAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
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
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
