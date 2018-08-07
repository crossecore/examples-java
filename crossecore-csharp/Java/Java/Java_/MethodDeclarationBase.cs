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
	public class MethodDeclarationBase 
	:AbstractMethodDeclarationImpl, MethodDeclaration
	{
		private int _extraArrayDimensions = 0;
		public virtual int extraArrayDimensions
		{
		get { 
			return _extraArrayDimensions;
		}
		set { _extraArrayDimensions = value; }
		}
		private TypeAccess _returnType;
		public virtual TypeAccess returnType
		{
			get {
			
				return _returnType;
			}
			set {
				if (value != _returnType) {
					NotificationChain msgs = null;
					if (_returnType != null){
						msgs = ((InternalEObject)_returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODDECLARATION_RETURNTYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODDECLARATION_RETURNTYPE, null, msgs);
					}
					msgs = basicSetReturnType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODDECLARATION_RETURNTYPE , value, value));
				}
				}
		}
		private MethodDeclaration _redefinedMethodDeclaration;
		public virtual MethodDeclaration redefinedMethodDeclaration
		{
			get {
			
				return _redefinedMethodDeclaration;
			}
			set {
				if (value != _redefinedMethodDeclaration) {
					NotificationChain msgs = null;
					if (_redefinedMethodDeclaration != null){
						msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, typeof(MethodDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, typeof(MethodDeclaration), msgs);
					}
					msgs = basicSetRedefinedMethodDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION , value, value));
				}
				}
		}
		private Set<MethodDeclaration> _redefinitions;
		
		public virtual Set<MethodDeclaration> redefinitions
		{
			get {
				if(_redefinitions==null){
					_redefinitions = new Set<MethodDeclaration>(this, Java_PackageImpl.METHODDECLARATION_REDEFINITIONS, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION);
				}
				return _redefinitions;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.METHODDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
					if (_redefinedMethodDeclaration != null){
						msgs = ((InternalEObject)_redefinedMethodDeclaration).eInverseRemove(this, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION, typeof(MethodDeclaration), msgs);
					}
					return basicSetRedefinedMethodDeclaration((MethodDeclaration)otherEnd, msgs);
				case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
					return redefinitions.basicAdd((MethodDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
					return basicSetRedefinedMethodDeclaration(null, msgs);
				case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
					return redefinitions.basicRemove((MethodDeclaration)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetReturnType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _returnType;
			_returnType = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODDECLARATION_RETURNTYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetRedefinedMethodDeclaration(MethodDeclaration newobj, NotificationChain msgs) {
			var oldobj = _redefinedMethodDeclaration;
			_redefinedMethodDeclaration = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION, oldobj, newobj);
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
				case Java_PackageImpl.METHODDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.METHODDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.METHODDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.METHODDECLARATION_NAME:
					return name;
				case Java_PackageImpl.METHODDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.METHODDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.METHODDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.METHODDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.METHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.METHODDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.METHODDECLARATION_BODY:
					return body;
				case Java_PackageImpl.METHODDECLARATION_PARAMETERS:
					return parameters;
				case Java_PackageImpl.METHODDECLARATION_THROWNEXCEPTIONS:
					return thrownExceptions;
				case Java_PackageImpl.METHODDECLARATION_TYPEPARAMETERS:
					return typeParameters;
				case Java_PackageImpl.METHODDECLARATION_USAGESINDOCCOMMENTS:
					return usagesInDocComments;
				case Java_PackageImpl.METHODDECLARATION_USAGES:
					return usages;
				case Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.METHODDECLARATION_RETURNTYPE:
					return returnType;
				case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
					return redefinedMethodDeclaration;
				case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
					return redefinitions;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.METHODDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.METHODDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.METHODDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.METHODDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_BODY:
					body = (Block) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_PARAMETERS:
					parameters.Clear();
					parameters.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableDeclaration>());
					return;
				case Java_PackageImpl.METHODDECLARATION_THROWNEXCEPTIONS:
					thrownExceptions.Clear();
					thrownExceptions.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.METHODDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
				case Java_PackageImpl.METHODDECLARATION_USAGESINDOCCOMMENTS:
					usagesInDocComments.Clear();
					usagesInDocComments.AddRange(((List<EObject>)newValue)?.Cast<MethodRef>());
					return;
				case Java_PackageImpl.METHODDECLARATION_USAGES:
					usages.Clear();
					usages.AddRange(((List<EObject>)newValue)?.Cast<AbstractMethodInvocation>());
					return;
				case Java_PackageImpl.METHODDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_RETURNTYPE:
					returnType = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_REDEFINEDMETHODDECLARATION:
					redefinedMethodDeclaration = (MethodDeclaration) newValue;
					return;
				case Java_PackageImpl.METHODDECLARATION_REDEFINITIONS:
					redefinitions.Clear();
					redefinitions.AddRange(((List<EObject>)newValue)?.Cast<MethodDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
