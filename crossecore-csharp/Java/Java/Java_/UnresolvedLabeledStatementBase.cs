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
	public class UnresolvedLabeledStatementBase 
	:LabeledStatementImpl, UnresolvedLabeledStatement
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDLABELEDSTATEMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_NAME:
					return name;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_PROXY:
					return proxy;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_BODY:
					return body;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					return usagesInBreakStatements;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					return usagesInContinueStatements;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_BODY:
					body = (Statement) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					usagesInBreakStatements.Clear();
					usagesInBreakStatements.AddRange(((List<EObject>)newValue)?.Cast<BreakStatement>());
					return;
				case Java_PackageImpl.UNRESOLVEDLABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					usagesInContinueStatements.Clear();
					usagesInContinueStatements.AddRange(((List<EObject>)newValue)?.Cast<ContinueStatement>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
