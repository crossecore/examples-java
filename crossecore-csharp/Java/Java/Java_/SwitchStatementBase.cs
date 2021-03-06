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
	public class SwitchStatementBase 
	:StatementImpl, SwitchStatement
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION , value, value));
				}
				}
		}
		private OrderedSet<Statement> _statements;
		
		public virtual OrderedSet<Statement> statements
		{
			get {
				if(_statements==null){
					_statements = new OrderedSet<Statement>(this, Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS);
				}
				return _statements;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SWITCHSTATEMENT;
		}
		
		
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION, oldobj, newobj);
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
				case Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION:
					return expression;
				case Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS:
					return statements;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS:
					statements.Clear();
					statements.AddRange(((List<EObject>)newValue)?.Cast<Statement>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.SWITCHSTATEMENT_EXPRESSION:
					return _expression != null; //single != null;
				case Java_PackageImpl.SWITCHSTATEMENT_STATEMENTS:
					return _statements != null && !_statements.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
