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
	public class ForStatementBase 
	:StatementImpl, ForStatement
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FORSTATEMENT_EXPRESSION , value, value));
				}
				}
		}
		private OrderedSet<Expression> _updaters;
		
		public virtual OrderedSet<Expression> updaters
		{
			get {
				if(_updaters==null){
					_updaters = new OrderedSet<Expression>(this, Java_PackageImpl.FORSTATEMENT_UPDATERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_UPDATERS);
				}
				return _updaters;
			}
		
		}
		private OrderedSet<Expression> _initializers;
		
		public virtual OrderedSet<Expression> initializers
		{
			get {
				if(_initializers==null){
					_initializers = new OrderedSet<Expression>(this, Java_PackageImpl.FORSTATEMENT_INITIALIZERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_INITIALIZERS);
				}
				return _initializers;
			}
		
		}
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
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.FORSTATEMENT_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.FORSTATEMENT_BODY , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.FORSTATEMENT;
		}
		
		
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FORSTATEMENT_EXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetBody(Statement newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.FORSTATEMENT_BODY, oldobj, newobj);
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
				case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
					return expression;
				case Java_PackageImpl.FORSTATEMENT_UPDATERS:
					return updaters;
				case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
					return initializers;
				case Java_PackageImpl.FORSTATEMENT_BODY:
					return body;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.FORSTATEMENT_UPDATERS:
					updaters.Clear();
					updaters.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
					initializers.Clear();
					initializers.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.FORSTATEMENT_BODY:
					body = (Statement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.FORSTATEMENT_EXPRESSION:
					return _expression != null; //single != null;
				case Java_PackageImpl.FORSTATEMENT_UPDATERS:
					return _updaters != null && !_updaters.isEmpty();
				case Java_PackageImpl.FORSTATEMENT_INITIALIZERS:
					return _initializers != null && !_initializers.isEmpty();
				case Java_PackageImpl.FORSTATEMENT_BODY:
					return _body != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
