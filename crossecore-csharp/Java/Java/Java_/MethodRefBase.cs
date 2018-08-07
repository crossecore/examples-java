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
	public class MethodRefBase 
	:ASTNodeImpl, MethodRef
	{
		private TypeAccess _qualifier;
		public virtual TypeAccess qualifier
		{
			get {
			
				return _qualifier;
			}
			set {
				if (value != _qualifier) {
					NotificationChain msgs = null;
					if (_qualifier != null){
						msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODREF_QUALIFIER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODREF_QUALIFIER, null, msgs);
					}
					msgs = basicSetQualifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODREF_QUALIFIER , value, value));
				}
				}
		}
		private OrderedSet<MethodRefParameter> _parameters;
		
		public virtual OrderedSet<MethodRefParameter> parameters
		{
			get {
				if(_parameters==null){
					_parameters = new OrderedSet<MethodRefParameter>(this, Java_PackageImpl.METHODREF_PARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODREF_PARAMETERS);
				}
				return _parameters;
			}
		
		}
		private AbstractMethodDeclaration _method;
		public virtual AbstractMethodDeclaration method
		{
			get {
			
				return _method;
			}
			set {
				if (value != _method) {
					NotificationChain msgs = null;
					if (_method != null){
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, typeof(MethodRef), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGESINDOCCOMMENTS, typeof(MethodRef), msgs);
					}
					msgs = basicSetMethod(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODREF_METHOD , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.METHODREF;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.METHODREF_METHOD:
					if (_method != null){
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.METHODREF_METHOD, typeof(AbstractMethodDeclaration), msgs);
					}
					return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.METHODREF_METHOD:
					return basicSetMethod(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetQualifier(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _qualifier;
			_qualifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODREF_QUALIFIER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
			var oldobj = _method;
			_method = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODREF_METHOD, oldobj, newobj);
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
				case Java_PackageImpl.METHODREF_COMMENTS:
					return comments;
				case Java_PackageImpl.METHODREF_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.METHODREF_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.METHODREF_METHOD:
					return method;
				case Java_PackageImpl.METHODREF_QUALIFIER:
					return qualifier;
				case Java_PackageImpl.METHODREF_PARAMETERS:
					return parameters;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.METHODREF_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.METHODREF_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.METHODREF_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.METHODREF_METHOD:
					method = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.METHODREF_QUALIFIER:
					qualifier = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.METHODREF_PARAMETERS:
					parameters.Clear();
					parameters.AddRange(((List<EObject>)newValue)?.Cast<MethodRefParameter>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
