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
	public class EnumDeclarationBase 
	:AbstractTypeDeclarationImpl, EnumDeclaration
	{
		private OrderedSet<EnumConstantDeclaration> _enumConstants;
		
		public virtual OrderedSet<EnumConstantDeclaration> enumConstants
		{
			get {
				if(_enumConstants==null){
					_enumConstants = new OrderedSet<EnumConstantDeclaration>(this, Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS);
				}
				return _enumConstants;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ENUMDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ENUMDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ENUMDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ENUMDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ENUMDECLARATION_NAME:
					return name;
				case Java_PackageImpl.ENUMDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.ENUMDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.ENUMDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.ENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.ENUMDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.ENUMDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.ENUMDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.ENUMDECLARATION_COMMENTSBEFOREBODY:
					return commentsBeforeBody;
				case Java_PackageImpl.ENUMDECLARATION_COMMENTSAFTERBODY:
					return commentsAfterBody;
				case Java_PackageImpl.ENUMDECLARATION_PACKAGE:
					return package;
				case Java_PackageImpl.ENUMDECLARATION_SUPERINTERFACES:
					return superInterfaces;
				case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
					return enumConstants;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ENUMDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_COMMENTSBEFOREBODY:
					commentsBeforeBody.Clear();
					commentsBeforeBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_COMMENTSAFTERBODY:
					commentsAfterBody.Clear();
					commentsAfterBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.ENUMDECLARATION_SUPERINTERFACES:
					superInterfaces.Clear();
					superInterfaces.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
					enumConstants.Clear();
					enumConstants.AddRange(((List<EObject>)newValue)?.Cast<EnumConstantDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
