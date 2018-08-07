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
	public class LineCommentBase 
	:CommentImpl, LineComment
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.LINECOMMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.LINECOMMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.LINECOMMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.LINECOMMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.LINECOMMENT_CONTENT:
					return content;
				case Java_PackageImpl.LINECOMMENT_ENCLOSEDBYPARENT:
					return enclosedByParent;
				case Java_PackageImpl.LINECOMMENT_PREFIXOFPARENT:
					return prefixOfParent;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.LINECOMMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.LINECOMMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.LINECOMMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.LINECOMMENT_CONTENT:
					content = (string) newValue;
					return;
				case Java_PackageImpl.LINECOMMENT_ENCLOSEDBYPARENT:
					enclosedByParent = (bool) newValue;
					return;
				case Java_PackageImpl.LINECOMMENT_PREFIXOFPARENT:
					prefixOfParent = (bool) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
