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
	public class IfStatementBase 
	:StatementImpl, IfStatement
	{
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IFSTATEMENT_EXPRESSION , value, value));
				}
				}
		}
		private Statement _thenStatement;
		public virtual Statement thenStatement
		{
			get {
			
				return _thenStatement;
			}
			set {
				if (value != _thenStatement) {
					NotificationChain msgs = null;
					if (_thenStatement != null){
						msgs = ((InternalEObject)_thenStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_THENSTATEMENT, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_THENSTATEMENT, null, msgs);
					}
					msgs = basicSetThenStatement(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IFSTATEMENT_THENSTATEMENT , value, value));
				}
				}
		}
		private Statement _elseStatement;
		public virtual Statement elseStatement
		{
			get {
			
				return _elseStatement;
			}
			set {
				if (value != _elseStatement) {
					NotificationChain msgs = null;
					if (_elseStatement != null){
						msgs = ((InternalEObject)_elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT, null, msgs);
					}
					msgs = basicSetElseStatement(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.IFSTATEMENT;
		}
		
		
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IFSTATEMENT_EXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetThenStatement(Statement newobj, NotificationChain msgs) {
			var oldobj = _thenStatement;
			_thenStatement = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IFSTATEMENT_THENSTATEMENT, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetElseStatement(Statement newobj, NotificationChain msgs) {
			var oldobj = _elseStatement;
			_elseStatement = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT, oldobj, newobj);
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
				case Java_PackageImpl.IFSTATEMENT_EXPRESSION:
					return expression;
				case Java_PackageImpl.IFSTATEMENT_THENSTATEMENT:
					return thenStatement;
				case Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT:
					return elseStatement;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.IFSTATEMENT_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.IFSTATEMENT_THENSTATEMENT:
					thenStatement = (Statement) newValue;
					return;
				case Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT:
					elseStatement = (Statement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.IFSTATEMENT_EXPRESSION:
					return _expression != null; //single != null;
				case Java_PackageImpl.IFSTATEMENT_THENSTATEMENT:
					return _thenStatement != null; //single != null;
				case Java_PackageImpl.IFSTATEMENT_ELSESTATEMENT:
					return _elseStatement != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
