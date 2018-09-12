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
	public class EnumDeclarationBase 
	:AbstractTypeDeclarationImpl, EnumDeclaration
	{
		private OrderedSet<EnumConstantDeclaration> _enumConstants;
		
		public virtual OrderedSet<EnumConstantDeclaration> enumConstants
		{
			get {
				if(_enumConstants==null){
					_enumConstants = new OrderedSet<EnumConstantDeclaration>(this, Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS);
				}
				return _enumConstants;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ENUMDECLARATION;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
					return enumConstants;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
					enumConstants.Clear();
					enumConstants.AddRange(((List<EObject>)newValue)?.Cast<EnumConstantDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
					return _enumConstants != null && !_enumConstants.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
