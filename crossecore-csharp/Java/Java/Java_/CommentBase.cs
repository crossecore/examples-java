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
	public class CommentBase 
	:ASTNodeImpl, Comment
	{
		private string _content = "";
		public virtual string content
		{
		get { 
			return _content;
		}
		set { _content = value; }
		}
		private bool _enclosedByParent = false;
		public virtual bool enclosedByParent
		{
		get { 
			return _enclosedByParent;
		}
		set { _enclosedByParent = value; }
		}
		private bool _prefixOfParent = false;
		public virtual bool prefixOfParent
		{
		get { 
			return _prefixOfParent;
		}
		set { _prefixOfParent = value; }
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.COMMENT;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.COMMENT_CONTENT:
					return content;
				case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
					return enclosedByParent;
				case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
					return prefixOfParent;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.COMMENT_CONTENT:
					content = (string) newValue;
					return;
				case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
					enclosedByParent = (bool) newValue;
					return;
				case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
					prefixOfParent = (bool) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.COMMENT_CONTENT:
					return CONTENT_EDEFAULT == null ? _content != null : !CONTENT_EDEFAULT.equals(_content);
				case Java_PackageImpl.COMMENT_ENCLOSEDBYPARENT:
					return _enclosedByParent != ENCLOSEDBYPARENT_EDEFAULT;
				case Java_PackageImpl.COMMENT_PREFIXOFPARENT:
					return _prefixOfParent != PREFIXOFPARENT_EDEFAULT;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
