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
	public class TypeDeclarationBase 
	:AbstractTypeDeclarationImpl, TypeDeclaration
	{
		private OrderedSet<TypeParameter> _typeParameters;
		
		public virtual OrderedSet<TypeParameter> typeParameters
		{
			get {
				if(_typeParameters==null){
					_typeParameters = new OrderedSet<TypeParameter>(this, Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS);
				}
				return _typeParameters;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TYPEDECLARATION;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
					return typeParameters;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
					return _typeParameters != null && !_typeParameters.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
