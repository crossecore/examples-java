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
	public class BodyDeclarationBase 
	:NamedElementImpl, BodyDeclaration
	{
		public virtual AbstractTypeDeclaration abstractTypeDeclaration
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION) return default(AbstractTypeDeclaration);
				return (AbstractTypeDeclaration)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, typeof(BodyDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, typeof(BodyDeclaration), msgs);
					}
					msgs = basicSetAbstractTypeDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION , value, value));
				}
				}
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
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.MODIFIER_BODYDECLARATION, typeof(BodyDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.MODIFIER_BODYDECLARATION, typeof(BodyDeclaration), msgs);
					}
					msgs = basicSetModifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_MODIFIER , value, value));
				}
				}
		}
		public virtual AnonymousClassDeclaration anonymousClassDeclarationOwner
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER) return default(AnonymousClassDeclaration);
				return (AnonymousClassDeclaration)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, typeof(BodyDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, typeof(BodyDeclaration), msgs);
					}
					msgs = basicSetAnonymousClassDeclarationOwner(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER , value, value));
				}
				}
		}
		private OrderedSet<Annotation> _annotations;
		
		public virtual OrderedSet<Annotation> annotations
		{
			get {
				if(_annotations==null){
					_annotations = new OrderedSet<Annotation>(this, Java_PackageImpl.BODYDECLARATION_ANNOTATIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.BODYDECLARATION_ANNOTATIONS);
				}
				return _annotations;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.BODYDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetAbstractTypeDeclaration((AbstractTypeDeclaration)otherEnd, msgs);
				case Java_PackageImpl.BODYDECLARATION_MODIFIER:
					if (_modifier != null){
						msgs = ((InternalEObject)_modifier).eInverseRemove(this, Java_PackageImpl.BODYDECLARATION_MODIFIER, typeof(Modifier), msgs);
					}
					return basicSetModifier((Modifier)otherEnd, msgs);
				case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetAnonymousClassDeclarationOwner((AnonymousClassDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
					return basicSetAbstractTypeDeclaration(null, msgs);
				case Java_PackageImpl.BODYDECLARATION_MODIFIER:
					return basicSetModifier(null, msgs);
				case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return basicSetAnonymousClassDeclarationOwner(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetAbstractTypeDeclaration(AbstractTypeDeclaration newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION, msgs);
				return msgs;
		}
		public NotificationChain basicSetModifier(Modifier newobj, NotificationChain msgs) {
			var oldobj = _modifier;
			_modifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.BODYDECLARATION_MODIFIER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetAnonymousClassDeclarationOwner(AnonymousClassDeclaration newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER, msgs);
				return msgs;
		}
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.BODYDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.BODYDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.BODYDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.BODYDECLARATION_NAME:
					return name;
				case Java_PackageImpl.BODYDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.BODYDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.BODYDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.BODYDECLARATION_MODIFIER:
					return modifier;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.BODYDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.BODYDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.BODYDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
