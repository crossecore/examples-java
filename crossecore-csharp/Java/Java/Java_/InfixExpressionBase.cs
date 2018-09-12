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
	public class InfixExpressionBase 
	:ExpressionImpl, InfixExpression
	{
		private InfixExpressionKind _operator = InfixExpressionKind.TIMES;
		public virtual InfixExpressionKind operator_
		{
		get { 
			return _operator;
		}
		set { _operator = value; }
		}
		private Expression _rightOperand;
		public virtual Expression rightOperand
		{
			get {
			
				return _rightOperand;
			}
			set {
				if (value != _rightOperand) {
					NotificationChain msgs = null;
					if (_rightOperand != null){
						msgs = ((InternalEObject)_rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, null, msgs);
					}
					msgs = basicSetRightOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND , value, value));
				}
				}
		}
		private Expression _leftOperand;
		public virtual Expression leftOperand
		{
			get {
			
				return _leftOperand;
			}
			set {
				if (value != _leftOperand) {
					NotificationChain msgs = null;
					if (_leftOperand != null){
						msgs = ((InternalEObject)_leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, null, msgs);
					}
					msgs = basicSetLeftOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND , value, value));
				}
				}
		}
		private OrderedSet<Expression> _extendedOperands;
		
		public virtual OrderedSet<Expression> extendedOperands
		{
			get {
				if(_extendedOperands==null){
					_extendedOperands = new OrderedSet<Expression>(this, Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS);
				}
				return _extendedOperands;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.INFIXEXPRESSION;
		}
		
		
		public NotificationChain basicSetRightOperand(Expression newobj, NotificationChain msgs) {
			var oldobj = _rightOperand;
			_rightOperand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetLeftOperand(Expression newobj, NotificationChain msgs) {
			var oldobj = _leftOperand;
			_leftOperand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND, oldobj, newobj);
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
				case Java_PackageImpl.INFIXEXPRESSION_OPERATOR:
					return operator_;
				case Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND:
					return rightOperand;
				case Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND:
					return leftOperand;
				case Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS:
					return extendedOperands;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.INFIXEXPRESSION_OPERATOR:
					operator_ = (InfixExpressionKind) newValue;
					return;
				case Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND:
					rightOperand = (Expression) newValue;
					return;
				case Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND:
					leftOperand = (Expression) newValue;
					return;
				case Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS:
					extendedOperands.Clear();
					extendedOperands.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.INFIXEXPRESSION_OPERATOR:
					return OPERATOR_EDEFAULT == null ? _operator != null : !OPERATOR_EDEFAULT.equals(_operator);
				case Java_PackageImpl.INFIXEXPRESSION_RIGHTOPERAND:
					return _rightOperand != null; //single != null;
				case Java_PackageImpl.INFIXEXPRESSION_LEFTOPERAND:
					return _leftOperand != null; //single != null;
				case Java_PackageImpl.INFIXEXPRESSION_EXTENDEDOPERANDS:
					return _extendedOperands != null && !_extendedOperands.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
