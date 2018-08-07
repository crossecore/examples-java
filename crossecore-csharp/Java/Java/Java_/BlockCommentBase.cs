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
	public class BlockCommentBase 
	:CommentImpl, BlockComment
	{
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.BLOCKCOMMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.BLOCKCOMMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.BLOCKCOMMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.BLOCKCOMMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.BLOCKCOMMENT_CONTENT:
					return content;
				case Java_PackageImpl.BLOCKCOMMENT_ENCLOSEDBYPARENT:
					return enclosedByParent;
				case Java_PackageImpl.BLOCKCOMMENT_PREFIXOFPARENT:
					return prefixOfParent;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.BLOCKCOMMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.BLOCKCOMMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.BLOCKCOMMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.BLOCKCOMMENT_CONTENT:
					content = (string) newValue;
					return;
				case Java_PackageImpl.BLOCKCOMMENT_ENCLOSEDBYPARENT:
					enclosedByParent = (bool) newValue;
					return;
				case Java_PackageImpl.BLOCKCOMMENT_PREFIXOFPARENT:
					prefixOfParent = (bool) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
