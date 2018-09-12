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
	public class NumberLiteralBase 
	:ExpressionImpl, NumberLiteral
	{
		private string _tokenValue = "";
		public virtual string tokenValue
		{
		get { 
			return _tokenValue;
		}
		set { _tokenValue = value; }
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.NUMBERLITERAL;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.NUMBERLITERAL_TOKENVALUE:
					return tokenValue;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.NUMBERLITERAL_TOKENVALUE:
					tokenValue = (string) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.NUMBERLITERAL_TOKENVALUE:
					return TOKENVALUE_EDEFAULT == null ? _tokenValue != null : !TOKENVALUE_EDEFAULT.equals(_tokenValue);
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
