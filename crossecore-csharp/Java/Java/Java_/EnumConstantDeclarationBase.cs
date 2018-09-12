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
	public class EnumConstantDeclarationBase 
	:BodyDeclarationImpl, EnumConstantDeclaration
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
		private AnonymousClassDeclaration _anonymousClassDeclaration;
		public virtual AnonymousClassDeclaration anonymousClassDeclaration
		{
			get {
			
				return _anonymousClassDeclaration;
			}
			set {
				if (value != _anonymousClassDeclaration) {
					NotificationChain msgs = null;
					if (_anonymousClassDeclaration != null){
						msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
					}
					msgs = basicSetAnonymousClassDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION , value, value));
				}
				}
		}
		private OrderedSet<Expression> _arguments;
		
		public virtual OrderedSet<Expression> arguments
		{
			get {
				if(_arguments==null){
					_arguments = new OrderedSet<Expression>(this, Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS);
				}
				return _arguments;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ENUMCONSTANTDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess.basicAdd((SingleVariableAccess)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
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
		public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newobj, NotificationChain msgs) {
			var oldobj = _anonymousClassDeclaration;
			_anonymousClassDeclaration = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
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
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
					return initializer;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
					return anonymousClassDeclaration;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
					return arguments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
					anonymousClassDeclaration = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
					return _extraArrayDimensions != EXTRAARRAYDIMENSIONS_EDEFAULT;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
					return _initializer != null; //single != null;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					return getUsageInVariableAccess().isEmpty(); //many, volatile
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
					return _anonymousClassDeclaration != null; //single != null;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
					return _arguments != null && !_arguments.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(VariableDeclaration)) {
				switch (derivedFeatureID) {
					case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS;
					case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER: return Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER;
					case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS;
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(VariableDeclaration)) {
				switch (baseFeatureID) {
					case Java_PackageImpl.VARIABLEDECLARATION_EXTRAARRAYDIMENSIONS: return Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS;
					case Java_PackageImpl.VARIABLEDECLARATION_INITIALIZER: return Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER;
					case Java_PackageImpl.VARIABLEDECLARATION_USAGEINVARIABLEACCESS: return Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS;
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
