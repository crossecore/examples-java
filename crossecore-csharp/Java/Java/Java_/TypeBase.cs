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
	public class TypeBase 
	:NamedElementImpl, Type
	{
		private Set<TypeAccess> _usagesInTypeAccess;
		
		public virtual Set<TypeAccess> usagesInTypeAccess
		{
			get {
				if(_usagesInTypeAccess==null){
					_usagesInTypeAccess = new Set<TypeAccess>(this, Java_PackageImpl.TYPE_USAGESINTYPEACCESS, Java_PackageImpl.TYPEACCESS_TYPE);
				}
				return _usagesInTypeAccess;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TYPE;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess.basicAdd((TypeAccess)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess.basicRemove((TypeAccess)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_COMMENTS:
					return comments;
				case Java_PackageImpl.TYPE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.TYPE_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.TYPE_NAME:
					return name;
				case Java_PackageImpl.TYPE_PROXY:
					return proxy;
				case Java_PackageImpl.TYPE_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.TYPE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.TYPE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.TYPE_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.TYPE_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.TYPE_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
