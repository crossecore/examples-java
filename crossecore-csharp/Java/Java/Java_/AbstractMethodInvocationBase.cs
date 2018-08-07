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
	public class AbstractMethodInvocationBase 
	:ASTNodeImpl, AbstractMethodInvocation
	{
		private OrderedSet<Expression> _arguments;
		
		public virtual OrderedSet<Expression> arguments
		{
			get {
				if(_arguments==null){
					_arguments = new OrderedSet<Expression>(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS);
				}
				return _arguments;
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
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, typeof(AbstractMethodInvocation), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTMETHODDECLARATION_USAGES, typeof(AbstractMethodInvocation), msgs);
					}
					msgs = basicSetMethod(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD , value, value));
				}
				}
		}
		private OrderedSet<TypeAccess> _typeArguments;
		
		public virtual OrderedSet<TypeAccess> typeArguments
		{
			get {
				if(_typeArguments==null){
					_typeArguments = new OrderedSet<TypeAccess>(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS);
				}
				return _typeArguments;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ABSTRACTMETHODINVOCATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD:
					if (_method != null){
						msgs = ((InternalEObject)_method).eInverseRemove(this, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, typeof(AbstractMethodDeclaration), msgs);
					}
					return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD:
					return basicSetMethod(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetMethod(AbstractMethodDeclaration newobj, NotificationChain msgs) {
			var oldobj = _method;
			_method = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD, oldobj, newobj);
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
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD:
					return method;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS:
					return arguments;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS:
					return typeArguments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_METHOD:
					method = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.ABSTRACTMETHODINVOCATION_TYPEARGUMENTS:
					typeArguments.Clear();
					typeArguments.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
