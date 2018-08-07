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
	public class UnresolvedMethodDeclarationBase 
	:MethodDeclarationImpl, UnresolvedMethodDeclaration
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDMETHODDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_NAME:
					return name;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_BODY:
					return body;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_PARAMETERS:
					return parameters;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_THROWNEXCEPTIONS:
					return thrownExceptions;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_TYPEPARAMETERS:
					return typeParameters;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGES:
					return usages;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_RETURNTYPE:
					return returnType;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_REDEFINEDMETHODDECLARATION:
					return redefinedMethodDeclaration;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_REDEFINITIONS:
					return redefinitions;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_BODY:
					body = (Block) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_PARAMETERS:
					parameters.Clear();
					parameters.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_THROWNEXCEPTIONS:
					thrownExceptions.Clear();
					thrownExceptions.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGESINDOCCOMMENTS:
					usagesInDocComments.Clear();
					usagesInDocComments.AddRange(((List<EObject>)newValue)?.Cast<MethodRef>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_USAGES:
					usages.Clear();
					usages.AddRange(((List<EObject>)newValue)?.Cast<AbstractMethodInvocation>());
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_RETURNTYPE:
					returnType = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_REDEFINEDMETHODDECLARATION:
					redefinedMethodDeclaration = (MethodDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDMETHODDECLARATION_REDEFINITIONS:
					redefinitions.Clear();
					redefinitions.AddRange(((List<EObject>)newValue)?.Cast<MethodDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
