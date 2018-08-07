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
	public class TextElementBase 
	:ASTNodeImpl, TextElement
	{
		private string _text = "";
		public virtual string text
		{
		get { 
			return _text;
		}
		set { _text = value; }
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TEXTELEMENT;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TEXTELEMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.TEXTELEMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.TEXTELEMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.TEXTELEMENT_TEXT:
					return text;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TEXTELEMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.TEXTELEMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.TEXTELEMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.TEXTELEMENT_TEXT:
					text = (string) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
