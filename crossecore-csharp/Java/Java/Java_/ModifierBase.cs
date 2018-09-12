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
	public class ModifierBase 
	:ASTNodeImpl, Modifier
	{
		private VisibilityKind _visibility = VisibilityKind.NONE;
		public virtual VisibilityKind visibility
		{
		get { 
			return _visibility;
		}
		set {
                _visibility = value;
            }
		}
		private InheritanceKind _inheritance = InheritanceKind.NONE;
		public virtual InheritanceKind inheritance
		{
		get { 
			return _inheritance;
		}
		set { _inheritance = value; }
		}
		private bool _static = false;
		public virtual bool static_
		{
		get { 
			return _static;
		}
		set { _static = value; }
		}
		private bool _transient = false;
		public virtual bool transient
		{
		get { 
			return _transient;
		}
		set { _transient = value; }
		}
		private bool _volatile = false;
		public virtual bool volatile_
		{
		get { 
			return _volatile;
		}
		set { _volatile = value; }
		}
		private bool _native = false;
		public virtual bool native
		{
		get { 
			return _native;
		}
		set { _native = value; }
		}
		private bool _strictfp = false;
		public virtual bool strictfp
		{
		get { 
			return _strictfp;
		}
		set { _strictfp = value; }
		}
		private bool _synchronized = false;
		public virtual bool synchronized
		{
		get { 
			return _synchronized;
		}
		set { _synchronized = value; }
		}
		public virtual BodyDeclaration bodyDeclaration
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.MODIFIER_BODYDECLARATION) return default(BodyDeclaration);
				return (BodyDeclaration)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.BODYDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.BODYDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					msgs = basicSetBodyDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER_BODYDECLARATION , value, value));
				}
				}
		}
		public virtual SingleVariableDeclaration singleVariableDeclaration
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION) return default(SingleVariableDeclaration);
				return (SingleVariableDeclaration)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					msgs = basicSetSingleVariableDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION , value, value));
				}
				}
		}
		public virtual VariableDeclarationStatement variableDeclarationStatement
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT) return default(VariableDeclarationStatement);
				return (VariableDeclarationStatement)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER, typeof(Modifier), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLEDECLARATIONSTATEMENT_MODIFIER, typeof(Modifier), msgs);
					}
					msgs = basicSetVariableDeclarationStatement(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT , value, value));
				}
				}
		}
		public virtual VariableDeclarationExpression variableDeclarationExpression
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION) return default(VariableDeclarationExpression);
				return (VariableDeclarationExpression)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER, typeof(Modifier), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.VARIABLEDECLARATIONEXPRESSION_MODIFIER, typeof(Modifier), msgs);
					}
					msgs = basicSetVariableDeclarationExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MODIFIER;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.MODIFIER_BODYDECLARATION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetBodyDeclaration((BodyDeclaration)otherEnd, msgs);
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetVariableDeclarationStatement((VariableDeclarationStatement)otherEnd, msgs);
				case Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetSingleVariableDeclaration((SingleVariableDeclaration)otherEnd, msgs);
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetVariableDeclarationExpression((VariableDeclarationExpression)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.MODIFIER_BODYDECLARATION:
					return basicSetBodyDeclaration(null, msgs);
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
					return basicSetVariableDeclarationStatement(null, msgs);
				case Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION:
					return basicSetSingleVariableDeclaration(null, msgs);
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
					return basicSetVariableDeclarationExpression(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetBodyDeclaration(BodyDeclaration newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER_BODYDECLARATION, msgs);
				return msgs;
		}
		public NotificationChain basicSetVariableDeclarationStatement(VariableDeclarationStatement newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT, msgs);
				return msgs;
		}
		public NotificationChain basicSetSingleVariableDeclaration(SingleVariableDeclaration newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION, msgs);
				return msgs;
		}
		public NotificationChain basicSetVariableDeclarationExpression(VariableDeclarationExpression newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.MODIFIER_VISIBILITY:
					return visibility;
				case Java_PackageImpl.MODIFIER_INHERITANCE:
					return inheritance;
				case Java_PackageImpl.MODIFIER_STATIC:
					return static_;
				case Java_PackageImpl.MODIFIER_TRANSIENT:
					return transient;
				case Java_PackageImpl.MODIFIER_VOLATILE:
					return volatile_;
				case Java_PackageImpl.MODIFIER_NATIVE:
					return native;
				case Java_PackageImpl.MODIFIER_STRICTFP:
					return strictfp;
				case Java_PackageImpl.MODIFIER_SYNCHRONIZED:
					return synchronized;
				case Java_PackageImpl.MODIFIER_BODYDECLARATION:
					return bodyDeclaration;
				case Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION:
					return singleVariableDeclaration;
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
					return variableDeclarationStatement;
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
					return variableDeclarationExpression;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MODIFIER_VISIBILITY:
					visibility = (VisibilityKind) newValue;
					return;
				case Java_PackageImpl.MODIFIER_INHERITANCE:
					inheritance = (InheritanceKind) newValue;
					return;
				case Java_PackageImpl.MODIFIER_STATIC:
					static_ = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_TRANSIENT:
					transient = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_VOLATILE:
					volatile_ = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_NATIVE:
					native = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_STRICTFP:
					strictfp = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_SYNCHRONIZED:
					synchronized = (bool) newValue;
					return;
				case Java_PackageImpl.MODIFIER_BODYDECLARATION:
					bodyDeclaration = (BodyDeclaration) newValue;
					return;
				case Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION:
					singleVariableDeclaration = (SingleVariableDeclaration) newValue;
					return;
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
					variableDeclarationStatement = (VariableDeclarationStatement) newValue;
					return;
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
					variableDeclarationExpression = (VariableDeclarationExpression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MODIFIER_VISIBILITY:
					return VISIBILITY_EDEFAULT == null ? _visibility != null : !VISIBILITY_EDEFAULT.equals(_visibility);
				case Java_PackageImpl.MODIFIER_INHERITANCE:
					return INHERITANCE_EDEFAULT == null ? _inheritance != null : !INHERITANCE_EDEFAULT.equals(_inheritance);
				case Java_PackageImpl.MODIFIER_STATIC:
					return _static != STATIC_EDEFAULT;
				case Java_PackageImpl.MODIFIER_TRANSIENT:
					return _transient != TRANSIENT_EDEFAULT;
				case Java_PackageImpl.MODIFIER_VOLATILE:
					return _volatile != VOLATILE_EDEFAULT;
				case Java_PackageImpl.MODIFIER_NATIVE:
					return _native != NATIVE_EDEFAULT;
				case Java_PackageImpl.MODIFIER_STRICTFP:
					return _strictfp != STRICTFP_EDEFAULT;
				case Java_PackageImpl.MODIFIER_SYNCHRONIZED:
					return _synchronized != SYNCHRONIZED_EDEFAULT;
				case Java_PackageImpl.MODIFIER_BODYDECLARATION:
					return getBodyDeclaration() != null; //single, volatile
				case Java_PackageImpl.MODIFIER_SINGLEVARIABLEDECLARATION:
					return getSingleVariableDeclaration() != null; //single, volatile
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONSTATEMENT:
					return getVariableDeclarationStatement() != null; //single, volatile
				case Java_PackageImpl.MODIFIER_VARIABLEDECLARATIONEXPRESSION:
					return getVariableDeclarationExpression() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
