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
	public class TypeParameterBase 
	:TypeImpl, TypeParameter
	{
		private OrderedSet<TypeAccess> _bounds;
		
		public virtual OrderedSet<TypeAccess> bounds
		{
			get {
				if(_bounds==null){
					_bounds = new OrderedSet<TypeAccess>(this, Java_PackageImpl.TYPEPARAMETER_BOUNDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEPARAMETER_BOUNDS);
				}
				return _bounds;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TYPEPARAMETER;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
					return bounds;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
					bounds.Clear();
					bounds.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
					return _bounds != null && !_bounds.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
