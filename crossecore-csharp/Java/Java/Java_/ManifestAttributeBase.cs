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
	public class ManifestAttributeBase 
	:BasicEObjectImpl, ManifestAttribute
	{
		private string _key = "";
		public virtual string key
		{
		get { 
			return _key;
		}
		set { _key = value; }
		}
		private string _value = "";
		public virtual string value
		{
		get { 
			return _value;
		}
		set { _value = value; }
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MANIFESTATTRIBUTE;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
					return key;
				case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
					return value;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
					key = (string) newValue;
					return;
				case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
					value = (string) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MANIFESTATTRIBUTE_KEY:
					return KEY_EDEFAULT == null ? _key != null : !KEY_EDEFAULT.equals(_key);
				case Java_PackageImpl.MANIFESTATTRIBUTE_VALUE:
					return VALUE_EDEFAULT == null ? _value != null : !VALUE_EDEFAULT.equals(_value);
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
