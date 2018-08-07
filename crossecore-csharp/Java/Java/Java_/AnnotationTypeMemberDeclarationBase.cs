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
	public class AnnotationTypeMemberDeclarationBase 
	:BodyDeclarationImpl, AnnotationTypeMemberDeclaration
	{
		private Expression _default;
		public virtual Expression default_
		{
			get {
			
				return _default;
			}
			set {
				if (value != _default) {
					NotificationChain msgs = null;
					if (_default != null){
						msgs = ((InternalEObject)_default).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, null, msgs);
					}
					msgs = basicSetDefault(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT , value, value));
				}
				}
		}
		private Set<AnnotationMemberValuePair> _usages;
		
		public virtual Set<AnnotationMemberValuePair> usages
		{
			get {
				if(_usages==null){
					_usages = new Set<AnnotationMemberValuePair>(this, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER);
				}
				return _usages;
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ANNOTATIONTYPEMEMBERDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
					return usages.basicAdd((AnnotationMemberValuePair)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
					return usages.basicRemove((AnnotationMemberValuePair)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetDefault(Expression newobj, NotificationChain msgs) {
			var oldobj = _default;
			_default = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE, oldobj, newobj);
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
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_NAME:
					return name;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT:
					return default_;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
					return type;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
					return usages;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_DEFAULT:
					default_ = (Expression) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES:
					usages.Clear();
					usages.AddRange(((List<EObject>)newValue)?.Cast<AnnotationMemberValuePair>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
