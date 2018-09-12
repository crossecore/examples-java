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
	public class EnhancedForStatementBase 
	:StatementImpl, EnhancedForStatement
	{
		private Statement _body;
		public virtual Statement body
		{
			get {
			
				return _body;
			}
			set {
				if (value != _body) {
					NotificationChain msgs = null;
					if (_body != null){
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY , value, value));
				}
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION , value, value));
				}
				}
		}
		private SingleVariableDeclaration _parameter;
		public virtual SingleVariableDeclaration parameter
		{
			get {
			
				return _parameter;
			}
			set {
				if (value != _parameter) {
					NotificationChain msgs = null;
					if (_parameter != null){
						msgs = ((InternalEObject)_parameter).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, typeof(EnhancedForStatement), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, typeof(EnhancedForStatement), msgs);
					}
					msgs = basicSetParameter(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ENHANCEDFORSTATEMENT;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
					if (_parameter != null){
						msgs = ((InternalEObject)_parameter).eInverseRemove(this, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, typeof(SingleVariableDeclaration), msgs);
					}
					return basicSetParameter((SingleVariableDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
					return basicSetParameter(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetBody(Statement newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY, oldobj, newobj);
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
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetParameter(SingleVariableDeclaration newobj, NotificationChain msgs) {
			var oldobj = _parameter;
			_parameter = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, oldobj, newobj);
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
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
					return body;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
					return expression;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
					return parameter;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
					body = (Statement) newValue;
					return;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
					parameter = (SingleVariableDeclaration) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_BODY:
					return _body != null; //single != null;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_EXPRESSION:
					return _expression != null; //single != null;
				case Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER:
					return _parameter != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
