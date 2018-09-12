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
	public class ModelBase 
	:BasicEObjectImpl, Model
	{
		private string _name = "";
		public virtual string name
		{
		get { 
			return _name;
		}
		set { _name = value; }
		}
		private Set<Package> _ownedElements;
		
		public virtual Set<Package> ownedElements
		{
			get {
				if(_ownedElements==null){
					_ownedElements = new Set<Package>(this, Java_PackageImpl.MODEL_OWNEDELEMENTS, Java_PackageImpl.PACKAGE_MODEL);
				}
				return _ownedElements;
			}
		
		}
		private Set<Type> _orphanTypes;
		
		public virtual Set<Type> orphanTypes
		{
			get {
				if(_orphanTypes==null){
					_orphanTypes = new Set<Type>(this, Java_PackageImpl.MODEL_ORPHANTYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_ORPHANTYPES);
				}
				return _orphanTypes;
			}
		
		}
		private Set<UnresolvedItem> _unresolvedItems;
		
		public virtual Set<UnresolvedItem> unresolvedItems
		{
			get {
				if(_unresolvedItems==null){
					_unresolvedItems = new Set<UnresolvedItem>(this, Java_PackageImpl.MODEL_UNRESOLVEDITEMS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_UNRESOLVEDITEMS);
				}
				return _unresolvedItems;
			}
		
		}
		private Set<CompilationUnit> _compilationUnits;
		
		public virtual Set<CompilationUnit> compilationUnits
		{
			get {
				if(_compilationUnits==null){
					_compilationUnits = new Set<CompilationUnit>(this, Java_PackageImpl.MODEL_COMPILATIONUNITS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_COMPILATIONUNITS);
				}
				return _compilationUnits;
			}
		
		}
		private Set<ClassFile> _classFiles;
		
		public virtual Set<ClassFile> classFiles
		{
			get {
				if(_classFiles==null){
					_classFiles = new Set<ClassFile>(this, Java_PackageImpl.MODEL_CLASSFILES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_CLASSFILES);
				}
				return _classFiles;
			}
		
		}
		private Set<Archive> _archives;
		
		public virtual Set<Archive> archives
		{
			get {
				if(_archives==null){
					_archives = new Set<Archive>(this, Java_PackageImpl.MODEL_ARCHIVES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MODEL_ARCHIVES);
				}
				return _archives;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MODEL;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.MODEL_OWNEDELEMENTS:
					return ownedElements.basicAdd((Package)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.MODEL_OWNEDELEMENTS:
					return ownedElements.basicRemove((Package)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.MODEL_NAME:
					return name;
				case Java_PackageImpl.MODEL_OWNEDELEMENTS:
					return ownedElements;
				case Java_PackageImpl.MODEL_ORPHANTYPES:
					return orphanTypes;
				case Java_PackageImpl.MODEL_UNRESOLVEDITEMS:
					return unresolvedItems;
				case Java_PackageImpl.MODEL_COMPILATIONUNITS:
					return compilationUnits;
				case Java_PackageImpl.MODEL_CLASSFILES:
					return classFiles;
				case Java_PackageImpl.MODEL_ARCHIVES:
					return archives;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MODEL_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.MODEL_OWNEDELEMENTS:
					ownedElements.Clear();
					ownedElements.AddRange(((List<EObject>)newValue)?.Cast<Package>());
					return;
				case Java_PackageImpl.MODEL_ORPHANTYPES:
					orphanTypes.Clear();
					orphanTypes.AddRange(((List<EObject>)newValue)?.Cast<Type>());
					return;
				case Java_PackageImpl.MODEL_UNRESOLVEDITEMS:
					unresolvedItems.Clear();
					unresolvedItems.AddRange(((List<EObject>)newValue)?.Cast<UnresolvedItem>());
					return;
				case Java_PackageImpl.MODEL_COMPILATIONUNITS:
					compilationUnits.Clear();
					compilationUnits.AddRange(((List<EObject>)newValue)?.Cast<CompilationUnit>());
					return;
				case Java_PackageImpl.MODEL_CLASSFILES:
					classFiles.Clear();
					classFiles.AddRange(((List<EObject>)newValue)?.Cast<ClassFile>());
					return;
				case Java_PackageImpl.MODEL_ARCHIVES:
					archives.Clear();
					archives.AddRange(((List<EObject>)newValue)?.Cast<Archive>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MODEL_NAME:
					return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
				case Java_PackageImpl.MODEL_OWNEDELEMENTS:
					return _ownedElements != null && !_ownedElements.isEmpty();
				case Java_PackageImpl.MODEL_ORPHANTYPES:
					return _orphanTypes != null && !_orphanTypes.isEmpty();
				case Java_PackageImpl.MODEL_UNRESOLVEDITEMS:
					return _unresolvedItems != null && !_unresolvedItems.isEmpty();
				case Java_PackageImpl.MODEL_COMPILATIONUNITS:
					return _compilationUnits != null && !_compilationUnits.isEmpty();
				case Java_PackageImpl.MODEL_CLASSFILES:
					return _classFiles != null && !_classFiles.isEmpty();
				case Java_PackageImpl.MODEL_ARCHIVES:
					return _archives != null && !_archives.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
