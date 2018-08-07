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
	public class TagElementBase 
	:ASTNodeImpl, TagElement
	{
		private string _tagName = "";
		public virtual string tagName
		{
		get { 
			return _tagName;
		}
		set { _tagName = value; }
		}
		private OrderedSet<ASTNode> _fragments;
		
		public virtual OrderedSet<ASTNode> fragments
		{
			get {
				if(_fragments==null){
					_fragments = new OrderedSet<ASTNode>(this, Java_PackageImpl.TAGELEMENT_FRAGMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TAGELEMENT_FRAGMENTS);
				}
				return _fragments;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TAGELEMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TAGELEMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.TAGELEMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.TAGELEMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.TAGELEMENT_TAGNAME:
					return tagName;
				case Java_PackageImpl.TAGELEMENT_FRAGMENTS:
					return fragments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TAGELEMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.TAGELEMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.TAGELEMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.TAGELEMENT_TAGNAME:
					tagName = (string) newValue;
					return;
				case Java_PackageImpl.TAGELEMENT_FRAGMENTS:
					fragments.Clear();
					fragments.AddRange(((List<EObject>)newValue)?.Cast<ASTNode>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
