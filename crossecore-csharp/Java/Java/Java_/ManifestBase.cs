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
	public class ManifestBase 
	:BasicEObjectImpl, Manifest
	{
		private Set<ManifestAttribute> _mainAttributes;
		
		public virtual Set<ManifestAttribute> mainAttributes
		{
			get {
				if(_mainAttributes==null){
					_mainAttributes = new Set<ManifestAttribute>(this, Java_PackageImpl.MANIFEST_MAINATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST_MAINATTRIBUTES);
				}
				return _mainAttributes;
			}
		
		}
		private Set<ManifestEntry> _entryAttributes;
		
		public virtual Set<ManifestEntry> entryAttributes
		{
			get {
				if(_entryAttributes==null){
					_entryAttributes = new Set<ManifestEntry>(this, Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES);
				}
				return _entryAttributes;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MANIFEST;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.MANIFEST_MAINATTRIBUTES:
					return mainAttributes;
				case Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES:
					return entryAttributes;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MANIFEST_MAINATTRIBUTES:
					mainAttributes.Clear();
					mainAttributes.AddRange(((List<EObject>)newValue)?.Cast<ManifestAttribute>());
					return;
				case Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES:
					entryAttributes.Clear();
					entryAttributes.AddRange(((List<EObject>)newValue)?.Cast<ManifestEntry>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MANIFEST_MAINATTRIBUTES:
					return _mainAttributes != null && !_mainAttributes.isEmpty();
				case Java_PackageImpl.MANIFEST_ENTRYATTRIBUTES:
					return _entryAttributes != null && !_entryAttributes.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
