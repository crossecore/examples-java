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
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.BOOLEANLITERAL_COMMENTS:
					return comments;
				case Java_PackageImpl.BOOLEANLITERAL_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.BOOLEANLITERAL_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.BOOLEANLITERAL_VALUE:
					return value;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.BOOLEANLITERAL_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.BOOLEANLITERAL_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.BOOLEANLITERAL_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.BOOLEANLITERAL_VALUE:
					value = (bool) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
