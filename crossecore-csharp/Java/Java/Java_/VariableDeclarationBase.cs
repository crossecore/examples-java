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
	public class VariableDeclarationBase 
	:NamedElementImpl, VariableDeclaration
	{
		private int _extraArrayDimensions = 0;
		public virtual int extraArrayDimensions
		{
		get { 
			return _extraArrayDimensions;
		}
		set { _extraArrayDimensions = value; }
		}
		private Expression _initializer;
		public virtual Expression initializer
		{
			get {
			
				return _initializer;
			}
			set {
				if (value != _initializer) {
					NotificationChain msgs = null;
					if (_initializer != null){
						msgs = ((InternalEObject)_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, null, msgs);
					}
					msgs = basicSetInitializer(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER , value, value));
				}
				}
		}
		private Set<SingleVariableAccess> _usageInVariableAccess;
		
		public virtual Set<SingleVariableAccess> usageInVariableAccess
		{
			get {
				if(_usageInVariableAccess==null){
					_usageInVariableAccess = new Set<SingleVariableAccess>(this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE);
				}
				return _usageInVariableAccess;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.VARIABLEDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess.basicAdd((SingleVariableAccess)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess.basicRemove((SingleVariableAccess)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetInitializer(Expression newobj, NotificationChain msgs) {
			var oldobj = _initializer;
			_initializer = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER, oldobj, newobj);
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
				case Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER:
					return initializer;
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS:
					return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
				case Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER:
					return _initializer != null; //single != null;
				case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS:
					return getUsageInVariableAccess().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
