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
	public class AssignmentBase 
	:ExpressionImpl, Assignment
	{
		private AssignmentKind _operator = AssignmentKind.ASSIGN;
		public virtual AssignmentKind operator_
		{
		get { 
			return _operator;
		}
		set { _operator = value; }
		}
		private Expression _rightHandSide;
		public virtual Expression rightHandSide
		{
			get {
			
				return _rightHandSide;
			}
			set {
				if (value != _rightHandSide) {
					NotificationChain msgs = null;
					if (_rightHandSide != null){
						msgs = ((InternalEObject)_rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, null, msgs);
					}
					msgs = basicSetRightHandSide(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE , value, value));
				}
				}
		}
		private Expression _leftHandSide;
		public virtual Expression leftHandSide
		{
			get {
			
				return _leftHandSide;
			}
			set {
				if (value != _leftHandSide) {
					NotificationChain msgs = null;
					if (_leftHandSide != null){
						msgs = ((InternalEObject)_leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, null, msgs);
					}
					msgs = basicSetLeftHandSide(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ASSIGNMENT;
		}
		
		
		public NotificationChain basicSetRightHandSide(Expression newobj, NotificationChain msgs) {
			var oldobj = _rightHandSide;
			_rightHandSide = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetLeftHandSide(Expression newobj, NotificationChain msgs) {
			var oldobj = _leftHandSide;
			_leftHandSide = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE, oldobj, newobj);
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
				case Java_PackageImpl.ASSIGNMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.ASSIGNMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ASSIGNMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE:
					return leftHandSide;
				case Java_PackageImpl.ASSIGNMENT_OPERATOR:
					return operator_;
				case Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE:
					return rightHandSide;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ASSIGNMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ASSIGNMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ASSIGNMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ASSIGNMENT_LEFTHANDSIDE:
					leftHandSide = (Expression) newValue;
					return;
				case Java_PackageImpl.ASSIGNMENT_OPERATOR:
					operator_ = (AssignmentKind) newValue;
					return;
				case Java_PackageImpl.ASSIGNMENT_RIGHTHANDSIDE:
					rightHandSide = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
