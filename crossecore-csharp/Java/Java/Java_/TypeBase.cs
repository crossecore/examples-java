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
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
					return getUsagesInTypeAccess().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
