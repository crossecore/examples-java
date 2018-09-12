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
	public class AbstractMethodDeclarationBase 
	:BodyDeclarationImpl, AbstractMethodDeclaration
	{
		private Block _body;
		public virtual Block body
		{
			get {
			
				return _body;
			}
			set {
				if (value != _body) {
					NotificationChain msgs = null;
					if (_body != null){
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY , value, value));
				}
				}
		}
		private OrderedSet<SingleVariableDeclaration> _parameters;
		
		public virtual OrderedSet<SingleVariableDeclaration> parameters
		{
			get {
				if(_parameters==null){
					_parameters = new OrderedSet<SingleVariableDeclaration>(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS, Java_PackageImpl.SINGLEVARIABLEDECLARATION_METHODDECLARATION);
				}
				return _parameters;
			}
		
		}
		private OrderedSet<TypeAccess> _thrownExceptions;
		
		public virtual OrderedSet<TypeAccess> thrownExceptions
		{
			get {
				if(_thrownExceptions==null){
					_thrownExceptions = new OrderedSet<TypeAccess>(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS);
				}
				return _thrownExceptions;
			}
		
		}
		private OrderedSet<TypeParameter> _typeParameters;
		
		public virtual OrderedSet<TypeParameter> typeParameters
		{
			get {
				if(_typeParameters==null){
					_typeParameters = new OrderedSet<TypeParameter>(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS);
				}
				return _typeParameters;
			}
		
		}
		private Set<MethodRef> _usagesInDocComments;
		
		public virtual Set<MethodRef> usagesInDocComments
		{
			get {
				if(_usagesInDocComments==null){
					_usagesInDocComments = new Set<MethodRef>(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, Java_PackageImpl.METHODREF_METHOD);
				}
				return _usagesInDocComments;
			}
		
		}
		private Set<AbstractMethodInvocation> _usages;
		
		public virtual Set<AbstractMethodInvocation> usages
		{
			get {
				if(_usages==null){
					_usages = new Set<AbstractMethodInvocation>(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD);
				}
				return _usages;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ABSTRACTMETHODDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
					return parameters.basicAdd((SingleVariableDeclaration)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments.basicAdd((MethodRef)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
					return usages.basicAdd((AbstractMethodInvocation)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
					return parameters.basicRemove((SingleVariableDeclaration)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments.basicRemove((MethodRef)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
					return usages.basicRemove((AbstractMethodInvocation)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY, oldobj, newobj);
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
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
					return body;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
					return parameters;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
					return thrownExceptions;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
					return typeParameters;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
					return usages;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
					body = (Block) newValue;
					return;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
					parameters.Clear();
					parameters.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableDeclaration>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
					thrownExceptions.Clear();
					thrownExceptions.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
					usagesInDocComments.Clear();
					usagesInDocComments.AddRange(((List<EObject>)newValue)?.Cast<MethodRef>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
					usages.Clear();
					usages.AddRange(((List<EObject>)newValue)?.Cast<AbstractMethodInvocation>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_BODY:
					return _body != null; //single != null;
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_PARAMETERS:
					return _parameters != null && !_parameters.isEmpty();
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_THROWNEXCEPTIONS:
					return _thrownExceptions != null && !_thrownExceptions.isEmpty();
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_TYPEPARAMETERS:
					return _typeParameters != null && !_typeParameters.isEmpty();
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS:
					return getUsagesInDocComments().isEmpty(); //many, volatile
				case Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES:
					return getUsages().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
