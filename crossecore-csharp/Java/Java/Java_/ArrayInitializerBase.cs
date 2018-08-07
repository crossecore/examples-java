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
	public class ArrayInitializerBase 
	:ExpressionImpl, ArrayInitializer
	{
		private OrderedSet<Expression> _expressions;
		
		public virtual OrderedSet<Expression> expressions
		{
			get {
				if(_expressions==null){
					_expressions = new OrderedSet<Expression>(this, Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS);
				}
				return _expressions;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ARRAYINITIALIZER;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYINITIALIZER_COMMENTS:
					return comments;
				case Java_PackageImpl.ARRAYINITIALIZER_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ARRAYINITIALIZER_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS:
					return expressions;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYINITIALIZER_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ARRAYINITIALIZER_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ARRAYINITIALIZER_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS:
					expressions.Clear();
					expressions.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
