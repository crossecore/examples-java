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
	public class UnresolvedTypeBase 
	:TypeImpl, UnresolvedType
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDTYPE;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(UnresolvedItem)) {
				switch (derivedFeatureID) {
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(UnresolvedItem)) {
				switch (baseFeatureID) {
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
