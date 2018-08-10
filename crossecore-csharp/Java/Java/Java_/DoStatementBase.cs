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
	public class DoStatementBase 
	:StatementImpl, DoStatement
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
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.DOSTATEMENT_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.DOSTATEMENT_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.DOSTATEMENT_EXPRESSION , value, value));
				}
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
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.DOSTATEMENT_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.DOSTATEMENT_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.DOSTATEMENT_BODY , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.DOSTATEMENT;
		}
		
		
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.DOSTATEMENT_EXPRESSION, oldobj, newobj);
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
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.DOSTATEMENT_BODY, oldobj, newobj);
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
				case Java_PackageImpl.DOSTATEMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.DOSTATEMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.DOSTATEMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.DOSTATEMENT_EXPRESSION:
					return expression;
				case Java_PackageImpl.DOSTATEMENT_BODY:
					return body;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.DOSTATEMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.DOSTATEMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.DOSTATEMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.DOSTATEMENT_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.DOSTATEMENT_BODY:
					body = (Statement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}