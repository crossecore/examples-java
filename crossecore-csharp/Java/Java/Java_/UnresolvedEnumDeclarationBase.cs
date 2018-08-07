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
	public class UnresolvedEnumDeclarationBase 
	:EnumDeclarationImpl, UnresolvedEnumDeclaration
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDENUMDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_NAME:
					return name;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTSBEFOREBODY:
					return commentsBeforeBody;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTSAFTERBODY:
					return commentsAfterBody;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_PACKAGE:
					return package;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_SUPERINTERFACES:
					return superInterfaces;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ENUMCONSTANTS:
					return enumConstants;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTSBEFOREBODY:
					commentsBeforeBody.Clear();
					commentsBeforeBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_COMMENTSAFTERBODY:
					commentsAfterBody.Clear();
					commentsAfterBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_SUPERINTERFACES:
					superInterfaces.Clear();
					superInterfaces.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.UNRESOLVEDENUMDECLARATION_ENUMCONSTANTS:
					enumConstants.Clear();
					enumConstants.AddRange(((List<EObject>)newValue)?.Cast<EnumConstantDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
