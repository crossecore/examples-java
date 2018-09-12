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
	public class BooleanLiteralBase 
	:ExpressionImpl, BooleanLiteral
	{
		private bool _value = false;
		public virtual bool value
		{
		get { 
			return _value;
		}
		set { _value = value; }
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.BOOLEANLITERAL;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.BOOLEANLITERAL_VALUE:
					return value;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.BOOLEANLITERAL_VALUE:
					value = (bool) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.BOOLEANLITERAL_VALUE:
					return _value != VALUE_EDEFAULT;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
