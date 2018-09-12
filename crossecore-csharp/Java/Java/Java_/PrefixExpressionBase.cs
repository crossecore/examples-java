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
	public class PrefixExpressionBase 
	:ExpressionImpl, PrefixExpression
	{
		private PrefixExpressionKind _operator = PrefixExpressionKind.INCREMENT;
		public virtual PrefixExpressionKind operator_
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
						msgs = ((InternalEObject)_operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PREFIXEXPRESSION_OPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PREFIXEXPRESSION_OPERAND, null, msgs);
					}
					msgs = basicSetOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PREFIXEXPRESSION_OPERAND , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.PREFIXEXPRESSION;
		}
		
		
		public NotificationChain basicSetOperand(Expression newobj, NotificationChain msgs) {
			var oldobj = _operand;
			_operand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PREFIXEXPRESSION_OPERAND, oldobj, newobj);
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
				case Java_PackageImpl.PREFIXEXPRESSION_OPERATOR:
					return operator_;
				case Java_PackageImpl.PREFIXEXPRESSION_OPERAND:
					return operand;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.PREFIXEXPRESSION_OPERATOR:
					operator_ = (PrefixExpressionKind) newValue;
					return;
				case Java_PackageImpl.PREFIXEXPRESSION_OPERAND:
					operand = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.PREFIXEXPRESSION_OPERATOR:
					return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
				case Java_PackageImpl.PREFIXEXPRESSION_OPERAND:
					return _operand != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
