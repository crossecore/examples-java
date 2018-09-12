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
	public class ManifestEntryBase 
	:BasicEObjectImpl, ManifestEntry
	{
		private string _name = "";
		public virtual string name
		{
		get { 
			return _name;
		}
		set { _name = value; }
		}
		private Set<ManifestAttribute> _attributes;
		
		public virtual Set<ManifestAttribute> attributes
		{
			get {
				if(_attributes==null){
					_attributes = new Set<ManifestAttribute>(this, Java_PackageImpl.MANIFESTENTRY_ATTRIBUTES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MANIFESTENTRY_ATTRIBUTES);
				}
				return _attributes;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MANIFESTENTRY;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTENTRY_NAME:
					return name;
				case Java_PackageImpl.MANIFESTENTRY_ATTRIBUTES:
					return attributes;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTENTRY_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.MANIFESTENTRY_ATTRIBUTES:
					attributes.Clear();
					attributes.AddRange(((List<EObject>)newValue)?.Cast<ManifestAttribute>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTENTRY_NAME:
					return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
				case Java_PackageImpl.MANIFESTENTRY_ATTRIBUTES:
					return _attributes != null && !_attributes.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
