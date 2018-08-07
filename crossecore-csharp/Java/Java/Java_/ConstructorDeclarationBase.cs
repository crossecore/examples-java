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
	public class ConstructorDeclarationBase 
	:AbstractMethodDeclarationImpl, ConstructorDeclaration
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CONSTRUCTORDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.CONSTRUCTORDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_NAME:
					return name;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_BODY:
					return body;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_PARAMETERS:
					return parameters;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_THROWNEXCEPTIONS:
					return thrownExceptions;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_TYPEPARAMETERS:
					return typeParameters;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGES:
					return usages;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CONSTRUCTORDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_BODY:
					body = (Block) newValue;
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_PARAMETERS:
					parameters.Clear();
					parameters.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableDeclaration>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_THROWNEXCEPTIONS:
					thrownExceptions.Clear();
					thrownExceptions.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGESINDOCCOMMENTS:
					usagesInDocComments.Clear();
					usagesInDocComments.AddRange(((List<EObject>)newValue)?.Cast<MethodRef>());
					return;
				case Java_PackageImpl.CONSTRUCTORDECLARATION_USAGES:
					usages.Clear();
					usages.AddRange(((List<EObject>)newValue)?.Cast<AbstractMethodInvocation>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
