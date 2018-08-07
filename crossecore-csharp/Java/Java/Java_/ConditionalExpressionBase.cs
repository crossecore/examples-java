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
	public class ConditionalExpressionBase 
	:ExpressionImpl, ConditionalExpression
	{
		private Expression _elseExpression;
		public virtual Expression elseExpression
		{
			get {
			
				return _elseExpression;
			}
			set {
				if (value != _elseExpression) {
					NotificationChain msgs = null;
					if (_elseExpression != null){
						msgs = ((InternalEObject)_elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, null, msgs);
					}
					msgs = basicSetElseExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION , value, value));
				}
				}
		}
		private Expression _thenExpression;
		public virtual Expression thenExpression
		{
			get {
			
				return _thenExpression;
			}
			set {
				if (value != _thenExpression) {
					NotificationChain msgs = null;
					if (_thenExpression != null){
						msgs = ((InternalEObject)_thenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, null, msgs);
					}
					msgs = basicSetThenExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION , value, value));
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CONDITIONALEXPRESSION;
		}
		
		
		public NotificationChain basicSetElseExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _elseExpression;
			_elseExpression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetThenExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _thenExpression;
			_thenExpression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION, oldobj, newobj);
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
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.CONDITIONALEXPRESSION_COMMENTS:
					return comments;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION:
					return elseExpression;
				case Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION:
					return expression;
				case Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION:
					return thenExpression;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CONDITIONALEXPRESSION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.CONDITIONALEXPRESSION_ELSEEXPRESSION:
					elseExpression = (Expression) newValue;
					return;
				case Java_PackageImpl.CONDITIONALEXPRESSION_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.CONDITIONALEXPRESSION_THENEXPRESSION:
					thenExpression = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
