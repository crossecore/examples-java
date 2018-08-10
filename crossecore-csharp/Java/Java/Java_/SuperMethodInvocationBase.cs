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
	public class SuperMethodInvocationBase 
	:AbstractTypeQualifiedExpressionImpl, SuperMethodInvocation
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SUPERMETHODINVOCATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.SUPERMETHODINVOCATION_COMMENTS:
					return comments;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.SUPERMETHODINVOCATION_QUALIFIER:
					return qualifier;
				case Java_PackageImpl.SUPERMETHODINVOCATION_METHOD:
					return method;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ARGUMENTS:
					return arguments;
				case Java_PackageImpl.SUPERMETHODINVOCATION_TYPEARGUMENTS:
					return typeArguments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SUPERMETHODINVOCATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_QUALIFIER:
					qualifier = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_METHOD:
					method = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.SUPERMETHODINVOCATION_TYPEARGUMENTS:
					typeArguments.Clear();
					typeArguments.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}