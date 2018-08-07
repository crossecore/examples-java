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
	public class PostfixExpressionBase 
	:ExpressionImpl, PostfixExpression
	{
		private PostfixExpressionKind _operator = PostfixExpressionKind.INCREMENT;
		public virtual PostfixExpressionKind operator_
		{
		get { 
			return _operator;
		}
		set { _operator = value; }
		}
		private Expression _operand;
		public virtual Expression operand
		{
			get {
			
				return _operand;
			}
			set {
				if (value != _operand) {
					NotificationChain msgs = null;
					if (_operand != null){
						msgs = ((InternalEObject)_operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.POSTFIXEXPRESSION_OPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.POSTFIXEXPRESSION_OPERAND, null, msgs);
					}
					msgs = basicSetOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.POSTFIXEXPRESSION_OPERAND , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.POSTFIXEXPRESSION;
		}
		
		
		public NotificationChain basicSetOperand(Expression newobj, NotificationChain msgs) {
			var oldobj = _operand;
			_operand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.POSTFIXEXPRESSION_OPERAND, oldobj, newobj);
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
				case Java_PackageImpl.POSTFIXEXPRESSION_COMMENTS:
					return comments;
				case Java_PackageImpl.POSTFIXEXPRESSION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.POSTFIXEXPRESSION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.POSTFIXEXPRESSION_OPERATOR:
					return operator_;
				case Java_PackageImpl.POSTFIXEXPRESSION_OPERAND:
					return operand;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.POSTFIXEXPRESSION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.POSTFIXEXPRESSION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.POSTFIXEXPRESSION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.POSTFIXEXPRESSION_OPERATOR:
					operator_ = (PostfixExpressionKind) newValue;
					return;
				case Java_PackageImpl.POSTFIXEXPRESSION_OPERAND:
					operand = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
