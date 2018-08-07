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
	public class TypeParameterBase 
	:TypeImpl, TypeParameter
	{
		private OrderedSet<TypeAccess> _bounds;
		
		public virtual OrderedSet<TypeAccess> bounds
		{
			get {
				if(_bounds==null){
					_bounds = new OrderedSet<TypeAccess>(this, Java_PackageImpl.TYPEPARAMETER_BOUNDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEPARAMETER_BOUNDS);
				}
				return _bounds;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TYPEPARAMETER;
		}
		
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TYPEPARAMETER_COMMENTS:
					return comments;
				case Java_PackageImpl.TYPEPARAMETER_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.TYPEPARAMETER_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.TYPEPARAMETER_NAME:
					return name;
				case Java_PackageImpl.TYPEPARAMETER_PROXY:
					return proxy;
				case Java_PackageImpl.TYPEPARAMETER_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.TYPEPARAMETER_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
					return bounds;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPEPARAMETER_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.TYPEPARAMETER_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.TYPEPARAMETER_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.TYPEPARAMETER_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.TYPEPARAMETER_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.TYPEPARAMETER_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.TYPEPARAMETER_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
					bounds.Clear();
					bounds.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
