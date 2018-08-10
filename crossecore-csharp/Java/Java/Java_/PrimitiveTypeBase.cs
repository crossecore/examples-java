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
	public class PrimitiveTypeBase 
	:TypeImpl, PrimitiveType
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.PRIMITIVETYPE;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.PRIMITIVETYPE_COMMENTS:
					return comments;
				case Java_PackageImpl.PRIMITIVETYPE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.PRIMITIVETYPE_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.PRIMITIVETYPE_NAME:
					return name;
				case Java_PackageImpl.PRIMITIVETYPE_PROXY:
					return proxy;
				case Java_PackageImpl.PRIMITIVETYPE_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.PRIMITIVETYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.PRIMITIVETYPE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.PRIMITIVETYPE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.PRIMITIVETYPE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.PRIMITIVETYPE_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.PRIMITIVETYPE_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.PRIMITIVETYPE_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.PRIMITIVETYPE_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}