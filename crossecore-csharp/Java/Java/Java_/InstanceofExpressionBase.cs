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
	public class InstanceofExpressionBase 
	:ExpressionImpl, InstanceofExpression
	{
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
						msgs = ((InternalEObject)_leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND, null, msgs);
					}
					msgs = basicSetLeftOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND , value, value));
				}
				}
		}
		private TypeAccess _rightOperand;
		public virtual TypeAccess rightOperand
		{
			get {
			
				return _rightOperand;
			}
			set {
				if (value != _rightOperand) {
					NotificationChain msgs = null;
					if (_rightOperand != null){
						msgs = ((InternalEObject)_rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND, null, msgs);
					}
					msgs = basicSetRightOperand(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.INSTANCEOFEXPRESSION;
		}
		
		
		public NotificationChain basicSetLeftOperand(Expression newobj, NotificationChain msgs) {
			var oldobj = _leftOperand;
			_leftOperand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetRightOperand(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _rightOperand;
			_rightOperand = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND, oldobj, newobj);
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
				case Java_PackageImpl.INSTANCEOFEXPRESSION_COMMENTS:
					return comments;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND:
					return rightOperand;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND:
					return leftOperand;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.INSTANCEOFEXPRESSION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_RIGHTOPERAND:
					rightOperand = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.INSTANCEOFEXPRESSION_LEFTOPERAND:
					leftOperand = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
