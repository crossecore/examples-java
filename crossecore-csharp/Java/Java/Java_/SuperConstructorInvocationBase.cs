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
	public class SuperConstructorInvocationBase 
	:StatementImpl, SuperConstructorInvocation
	{
		private AbstractMethodDeclaration _method;
		public virtual AbstractMethodDeclaration method
		{
			get {
			
				return _method;
			}
			set {
				if (value != _method) {
					NotificationChain msgs = null;
					if (_method != null){
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, typeof(AbstractMethodInvocation), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, typeof(AbstractMethodInvocation), msgs);
					}
					msgs = basicSetMethod(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD , value, value));
				}
				}
		}
		private OrderedSet<Expression> _arguments;
		
		public virtual OrderedSet<Expression> arguments
		{
			get {
				if(_arguments==null){
					_arguments = new OrderedSet<Expression>(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS);
				}
				return _arguments;
			}
		
		}
		private OrderedSet<TypeAccess> _typeArguments;
		
		public virtual OrderedSet<TypeAccess> typeArguments
		{
			get {
				if(_typeArguments==null){
					_typeArguments = new OrderedSet<TypeAccess>(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS);
				}
				return _typeArguments;
			}
		
		}
		private Expression _expression;
		public virtual Expression expression
		{
			get {
			
				return _expression;
			}
			set {
				if (value != _expression) {
					NotificationChain msgs = null;
					if (_expression != null){
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SUPERCONSTRUCTORINVOCATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD:
					if (_method != null){
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, typeof(AbstractMethodDeclaration), msgs);
					}
					return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD:
					return basicSetMethod(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
			var oldobj = _method;
			_method = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION, oldobj, newobj);
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
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD:
					return method;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_ARGUMENTS:
					return arguments;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS:
					return typeArguments;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION:
					return expression;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD:
					method = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS:
					typeArguments.Clear();
					typeArguments.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION:
					expression = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD:
					return getMethod() != null; //single, volatile
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_ARGUMENTS:
					return _arguments != null && !_arguments.isEmpty();
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS:
					return _typeArguments != null && !_typeArguments.isEmpty();
				case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_EXPRESSION:
					return _expression != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(AbstractMethodInvocation)) {
				switch (derivedFeatureID) {
					case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD;
					case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_ARGUMENTS: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS;
					case Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS: return Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS;
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(AbstractMethodInvocation)) {
				switch (baseFeatureID) {
					case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD: return Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_METHOD;
					case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS: return Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_ARGUMENTS;
					case Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS: return Java_PackageImpl.SUPERCONSTRUCTORINVOCATION_TYPEARGUMENTS;
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
