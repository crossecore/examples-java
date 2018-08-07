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
	public class FieldDeclarationBase 
	:BodyDeclarationImpl, FieldDeclaration
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.FIELDDECLARATION;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.FIELDDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.FIELDDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.FIELDDECLARATION_NAME:
					return name;
				case Java_PackageImpl.FIELDDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.FIELDDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.FIELDDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.FIELDDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.FIELDDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.FIELDDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.FIELDDECLARATION_TYPE:
					return type;
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					return fragments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.FIELDDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.FIELDDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.FIELDDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					fragments.Clear();
					fragments.AddRange(((List<EObject>)newValue)?.Cast<VariableDeclarationFragment>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
