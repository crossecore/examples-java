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
	public class NamedElementBase 
	:ASTNodeImpl, NamedElement
	{
		private string _name = "";
		public virtual string name
		{
		get { 
			return _name;
		}
		set { _name = value; }
		}
		private bool _proxy = false;
		public virtual bool proxy
		{
		get { 
			return _proxy;
		}
		set { _proxy = value; }
		}
		private Set<ImportDeclaration> _usagesInImports;
		
		public virtual Set<ImportDeclaration> usagesInImports
		{
			get {
				if(_usagesInImports==null){
					_usagesInImports = new Set<ImportDeclaration>(this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT);
				}
				return _usagesInImports;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.NAMEDELEMENT;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
					return usagesInImports.basicAdd((ImportDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
					return usagesInImports.basicRemove((ImportDeclaration)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.NAMEDELEMENT_NAME:
					return name;
				case Java_PackageImpl.NAMEDELEMENT_PROXY:
					return proxy;
				case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
					return usagesInImports;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.NAMEDELEMENT_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.NAMEDELEMENT_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.NAMEDELEMENT_NAME:
					return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
				case Java_PackageImpl.NAMEDELEMENT_PROXY:
					return _proxy != PROXY_EDEFAULT;
				case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
					return getUsagesInImports().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
