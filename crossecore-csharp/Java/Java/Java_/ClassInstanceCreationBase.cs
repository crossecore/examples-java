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
	public class ClassInstanceCreationBase 
	:ExpressionImpl, ClassInstanceCreation
	{
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_TYPE , value, value));
				}
				}
		}
		private Expression _expression;
		public virtual Expression expression
		{
			get {
			
				return _expression;
			}
			set {
				if (value != _expression) {
					NotificationChain msgs = null;
					if (_expression != null){
						msgs = ((InternalEObject)_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, null, msgs);
					}
					msgs = basicSetExpression(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION , value, value));
				}
				}
		}
		private AnonymousClassDeclaration _anonymousClassDeclaration;
		public virtual AnonymousClassDeclaration anonymousClassDeclaration
		{
			get {
			
				return _anonymousClassDeclaration;
			}
			set {
				if (value != _anonymousClassDeclaration) {
					NotificationChain msgs = null;
					if (_anonymousClassDeclaration != null){
						msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, typeof(ClassInstanceCreation), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, typeof(ClassInstanceCreation), msgs);
					}
					msgs = basicSetAnonymousClassDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CLASSINSTANCECREATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
					if (_anonymousClassDeclaration != null){
						msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, typeof(AnonymousClassDeclaration), msgs);
					}
					return basicSetAnonymousClassDeclaration((AnonymousClassDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
					return basicSetAnonymousClassDeclaration(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_TYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetExpression(Expression newobj, NotificationChain msgs) {
			var oldobj = _expression;
			_expression = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newobj, NotificationChain msgs) {
			var oldobj = _anonymousClassDeclaration;
			_anonymousClassDeclaration = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
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
				case Java_PackageImpl.CLASSINSTANCECREATION_COMMENTS:
					return comments;
				case Java_PackageImpl.CLASSINSTANCECREATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.CLASSINSTANCECREATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
					return method;
				case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS:
					return arguments;
				case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS:
					return typeArguments;
				case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
					return anonymousClassDeclaration;
				case Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION:
					return expression;
				case Java_PackageImpl.CLASSINSTANCECREATION_TYPE:
					return type;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CLASSINSTANCECREATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_METHOD:
					method = (AbstractMethodDeclaration) newValue;
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_TYPEARGUMENTS:
					typeArguments.Clear();
					typeArguments.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION:
					anonymousClassDeclaration = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_EXPRESSION:
					expression = (Expression) newValue;
					return;
				case Java_PackageImpl.CLASSINSTANCECREATION_TYPE:
					type = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
