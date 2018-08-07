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
	public class JavadocBase 
	:CommentImpl, Javadoc
	{
		private OrderedSet<TagElement> _tags;
		
		public virtual OrderedSet<TagElement> tags
		{
			get {
				if(_tags==null){
					_tags = new OrderedSet<TagElement>(this, Java_PackageImpl.JAVADOC_TAGS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.JAVADOC_TAGS);
				}
				return _tags;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.JAVADOC;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.JAVADOC_COMMENTS:
					return comments;
				case Java_PackageImpl.JAVADOC_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.JAVADOC_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.JAVADOC_CONTENT:
					return content;
				case Java_PackageImpl.JAVADOC_ENCLOSEDBYPARENT:
					return enclosedByParent;
				case Java_PackageImpl.JAVADOC_PREFIXOFPARENT:
					return prefixOfParent;
				case Java_PackageImpl.JAVADOC_TAGS:
					return tags;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.JAVADOC_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.JAVADOC_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.JAVADOC_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.JAVADOC_CONTENT:
					content = (string) newValue;
					return;
				case Java_PackageImpl.JAVADOC_ENCLOSEDBYPARENT:
					enclosedByParent = (bool) newValue;
					return;
				case Java_PackageImpl.JAVADOC_PREFIXOFPARENT:
					prefixOfParent = (bool) newValue;
					return;
				case Java_PackageImpl.JAVADOC_TAGS:
					tags.Clear();
					tags.AddRange(((List<EObject>)newValue)?.Cast<TagElement>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
