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
	public class UnresolvedVariableDeclarationFragmentBase 
	:VariableDeclarationFragmentImpl, UnresolvedVariableDeclarationFragment
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_NAME:
					return name;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_PROXY:
					return proxy;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_INITIALIZER:
					return initializer;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					return variablesContainer;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
				case Java_PackageImpl.UNRESOLVEDVARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					variablesContainer = (AbstractVariablesContainer) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
