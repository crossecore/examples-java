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
	public class AnnotationMemberValuePairBase 
	:NamedElementImpl, AnnotationMemberValuePair
	{
		private AnnotationTypeMemberDeclaration _member;
		public virtual AnnotationTypeMemberDeclaration member
		{
			get {
			
				return _member;
			}
			set {
				if (value != _member) {
					NotificationChain msgs = null;
					if (_member != null){
						msgs = ((InternalEObject)_member).eInverseRemove(this, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, typeof(AnnotationMemberValuePair), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANNOTATIONTYPEMEMBERDECLARATION_USAGES, typeof(AnnotationMemberValuePair), msgs);
					}
					msgs = basicSetMember(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER , value, value));
				}
				}
		}
		private Expression _value;
		public virtual Expression value
		{
			get {
			
				return _value;
			}
			set {
				if (value != _value) {
					NotificationChain msgs = null;
					if (_value != null){
						msgs = ((InternalEObject)_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, null, msgs);
					}
					msgs = basicSetValue(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ANNOTATIONMEMBERVALUEPAIR;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
					if (_member != null){
						msgs = ((InternalEObject)_member).eInverseRemove(this, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER, typeof(AnnotationTypeMemberDeclaration), msgs);
					}
					return basicSetMember((AnnotationTypeMemberDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
					return basicSetMember(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetMember(AnnotationTypeMemberDeclaration newobj, NotificationChain msgs) {
			var oldobj = _member;
			_member = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetValue(Expression newobj, NotificationChain msgs) {
			var oldobj = _value;
			_value = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE, oldobj, newobj);
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
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_COMMENTS:
					return comments;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_NAME:
					return name;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_PROXY:
					return proxy;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
					return member;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE:
					return value;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_MEMBER:
					member = (AnnotationTypeMemberDeclaration) newValue;
					return;
				case Java_PackageImpl.ANNOTATIONMEMBERVALUEPAIR_VALUE:
					value = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
