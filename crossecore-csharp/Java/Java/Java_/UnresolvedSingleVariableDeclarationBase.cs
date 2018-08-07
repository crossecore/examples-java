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
	public class UnresolvedSingleVariableDeclarationBase 
	:SingleVariableDeclarationImpl, UnresolvedSingleVariableDeclaration
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDSINGLEVARIABLEDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_NAME:
					return name;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_INITIALIZER:
					return initializer;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_VARARGS:
					return varargs;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_TYPE:
					return type;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_METHODDECLARATION:
					return methodDeclaration;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					return catchClause;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					return enhancedForStatement;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_VARARGS:
					varargs = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_METHODDECLARATION:
					methodDeclaration = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					catchClause = (CatchClause) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDSINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					enhancedForStatement = (EnhancedForStatement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
