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
	public class NamespaceAccessBase 
	:ASTNodeImpl, NamespaceAccess
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.NAMESPACEACCESS;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.NAMESPACEACCESS_COMMENTS:
					return comments;
				case Java_PackageImpl.NAMESPACEACCESS_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.NAMESPACEACCESS_ORIGINALCLASSFILE:
					return originalClassFile;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.NAMESPACEACCESS_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.NAMESPACEACCESS_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.NAMESPACEACCESS_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
