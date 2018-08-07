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
	public class VariableDeclarationExpressionBase 
	:ExpressionImpl, VariableDeclarationExpression
	{
		private Modifier _modifier;
		public virtual Modifier modifier
		{
			get {
			
				return _modifier;
			}
			set {
				if (value != _modifier) {
					NotificationChain msgs = null;
					if (_modifier != null){
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION, typeof(VariableDeclarationExpression), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION, typeof(VariableDeclarationExpression), msgs);
					}
					msgs = basicSetModifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER , value, value));
				}
				}
		}
		private OrderedSet<Annotation> _annotations;
		
		public virtual OrderedSet<Annotation> annotations
		{
			get {
				if(_annotations==null){
					_annotations = new OrderedSet<Annotation>(this, Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS);
				}
				return _annotations;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.VARIABLEDECLARATIONEXPRESSION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
					if (_modifier != null){
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER, typeof(Modifier), msgs);
					}
					return basicSetModifier((Modifier)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
					return basicSetModifier(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
			var oldobj = _modifier;
			_modifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER, oldobj, newobj);
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
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_COMMENTS:
					return comments;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_TYPE:
					return type;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
					return fragments;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
					return modifier;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS:
					return annotations;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_FRAGMENTS:
					fragments.Clear();
					fragments.AddRange(((List<EObject>)newValue)?.Cast<VariableDeclarationFragment>());
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
