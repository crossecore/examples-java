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
	public class SingleVariableAccessBase 
	:ExpressionImpl, SingleVariableAccess
	{
		private VariableDeclaration _variable;
		public virtual VariableDeclaration variable
		{
			get {
			
				return _variable;
			}
			set {
				if (value != _variable) {
					NotificationChain msgs = null;
					if (_variable != null){
						msgs = ((InternalEObject)_variable).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, typeof(SingleVariableAccess), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS, typeof(SingleVariableAccess), msgs);
					}
					msgs = basicSetVariable(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE , value, value));
				}
				}
		}
		private Expression _qualifier;
		public virtual Expression qualifier
		{
			get {
			
				return _qualifier;
			}
			set {
				if (value != _qualifier) {
					NotificationChain msgs = null;
					if (_qualifier != null){
						msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, null, msgs);
					}
					msgs = basicSetQualifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SINGLEVARIABLEACCESS;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
					if (_variable != null){
						msgs = ((InternalEObject)_variable).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE, typeof(VariableDeclaration), msgs);
					}
					return basicSetVariable((VariableDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
					return basicSetVariable(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetVariable(VariableDeclaration newobj, NotificationChain msgs) {
			var oldobj = _variable;
			_variable = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetQualifier(Expression newobj, NotificationChain msgs) {
			var oldobj = _qualifier;
			_qualifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER, oldobj, newobj);
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
				case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
					return variable;
				case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
					return qualifier;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
					variable = (VariableDeclaration) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
					qualifier = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEACCESS_VARIABLE:
					return getVariable() != null; //single, volatile
				case Java_PackageImpl.SINGLEVARIABLEACCESS_QUALIFIER:
					return _qualifier != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
