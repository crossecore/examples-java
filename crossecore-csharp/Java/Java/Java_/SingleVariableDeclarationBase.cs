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
	public class SingleVariableDeclarationBase 
	:VariableDeclarationImpl, SingleVariableDeclaration
	{
		private bool _varargs = false;
		public virtual bool varargs
		{
		get { 
			return _varargs;
		}
		set { _varargs = value; }
		}
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
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION, typeof(SingleVariableDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION, typeof(SingleVariableDeclaration), msgs);
					}
					msgs = basicSetModifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER , value, value));
				}
				}
		}
		private TypeAccess _type;
		public virtual TypeAccess type
		{
			get {
			
				return _type;
			}
			set {
				if (value != _type) {
					NotificationChain msgs = null;
					if (_type != null){
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE , value, value));
				}
				}
		}
		private OrderedSet<Annotation> _annotations;
		
		public virtual OrderedSet<Annotation> annotations
		{
			get {
				if(_annotations==null){
					_annotations = new OrderedSet<Annotation>(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SINGLEVARIABLEDECLARATION_ANNOTATIONS);
				}
				return _annotations;
			}
		
		}
		public virtual AbstractMethodDeclaration methodDeclaration
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION) return default(AbstractMethodDeclaration);
				return (AbstractMethodDeclaration)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS, typeof(SingleVariableDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS, typeof(SingleVariableDeclaration), msgs);
					}
					msgs = basicSetMethodDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION , value, value));
				}
				}
		}
		public virtual CatchClause catchClause
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE) return default(CatchClause);
				return (CatchClause)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.CATCHCLAUSE_EXCEPTION, typeof(SingleVariableDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.CATCHCLAUSE_EXCEPTION, typeof(SingleVariableDeclaration), msgs);
					}
					msgs = basicSetCatchClause(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE , value, value));
				}
				}
		}
		public virtual EnhancedForStatement enhancedForStatement
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT) return default(EnhancedForStatement);
				return (EnhancedForStatement)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, typeof(SingleVariableDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ENHANCEDFORSTATEMENT_PARAMETER, typeof(SingleVariableDeclaration), msgs);
					}
					msgs = basicSetEnhancedForStatement(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SINGLEVARIABLEDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetCatchClause((CatchClause)otherEnd, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER:
					if (_modifier != null){
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					return basicSetModifier((Modifier)otherEnd, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetMethodDeclaration((AbstractMethodDeclaration)otherEnd, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetEnhancedForStatement((EnhancedForStatement)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					return basicSetCatchClause(null, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER:
					return basicSetModifier(null, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
					return basicSetMethodDeclaration(null, msgs);
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					return basicSetEnhancedForStatement(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetCatchClause(CatchClause newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, msgs);
				return msgs;
		}
		public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
			var oldobj = _modifier;
			_modifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetMethodDeclaration(AbstractMethodDeclaration newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION, msgs);
				return msgs;
		}
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetEnhancedForStatement(EnhancedForStatement newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_VARARGS:
					return varargs;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE:
					return type;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
					return methodDeclaration;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					return catchClause;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					return enhancedForStatement;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_VARARGS:
					varargs = (bool) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
					methodDeclaration = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					catchClause = (CatchClause) newValue;
					return;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					enhancedForStatement = (EnhancedForStatement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_VARARGS:
					return _varargs != VARARGS_EDEFAULT;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER:
					return _modifier != null; //single != null;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_TYPE:
					return _type != null; //single != null;
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ANNOTATIONS:
					return _annotations != null && !_annotations.isEmpty();
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION:
					return getMethodDeclaration() != null; //single, volatile
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE:
					return getCatchClause() != null; //single, volatile
				case Java_PackageImpl.SINGLEVARIABLEDECLARATION_ENHANCEDFORSTATEMENT:
					return getEnhancedForStatement() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
