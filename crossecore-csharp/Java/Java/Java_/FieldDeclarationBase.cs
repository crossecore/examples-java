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
	public class FieldDeclarationBase 
	:BodyDeclarationImpl, FieldDeclaration
	{
		private TypeAccess _type;
		public virtual TypeAccess type
		{
			get {
			
				return _type;
			}
			set {
				if (value != _type) {
					NotificationChain msgs = null;
					if (_type != null){
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE , value, value));
				}
				}
		}
		private OrderedSet<VariableDeclarationFragment> _fragments;
		
		public virtual OrderedSet<VariableDeclarationFragment> fragments
		{
			get {
				if(_fragments==null){
					_fragments = new OrderedSet<VariableDeclarationFragment>(this, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER);
				}
				return _fragments;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.FIELDDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					return fragments.basicAdd((VariableDeclarationFragment)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					return fragments.basicRemove((VariableDeclarationFragment)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_TYPE:
					return type;
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					return fragments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					fragments.Clear();
					fragments.AddRange(((List<EObject>)newValue)?.Cast<VariableDeclarationFragment>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.FIELDDECLARATION_TYPE:
					return _type != null; //single != null;
				case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS:
					return _fragments != null && !_fragments.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(AbstractVariablesContainer)) {
				switch (derivedFeatureID) {
					case Java_PackageImpl.FIELDDECLARATION_TYPE: return Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE;
					case Java_PackageImpl.FIELDDECLARATION_FRAGMENTS: return Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS;
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(AbstractVariablesContainer)) {
				switch (baseFeatureID) {
					case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE: return Java_PackageImpl.FIELDDECLARATION_TYPE;
					case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS: return Java_PackageImpl.FIELDDECLARATION_FRAGMENTS;
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
