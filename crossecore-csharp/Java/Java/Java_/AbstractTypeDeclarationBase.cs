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
	public class AbstractTypeDeclarationBase 
	:BodyDeclarationImpl, AbstractTypeDeclaration
	{
		public virtual Package package
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE) return default(Package);
				return (Package)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, typeof(AbstractTypeDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, typeof(AbstractTypeDeclaration), msgs);
					}
					msgs = basicSetPackage(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE , value, value));
				}
				}
		}
		private OrderedSet<TypeAccess> _superInterfaces;
		
		public virtual OrderedSet<TypeAccess> superInterfaces
		{
			get {
				if(_superInterfaces==null){
					_superInterfaces = new OrderedSet<TypeAccess>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES);
				}
				return _superInterfaces;
			}
		
		}
		private OrderedSet<BodyDeclaration> _bodyDeclarations;
		
		public virtual OrderedSet<BodyDeclaration> bodyDeclarations
		{
			get {
				if(_bodyDeclarations==null){
					_bodyDeclarations = new OrderedSet<BodyDeclaration>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION);
				}
				return _bodyDeclarations;
			}
		
		}
		private OrderedSet<Comment> _commentsAfterBody;
		
		public virtual OrderedSet<Comment> commentsAfterBody
		{
			get {
				if(_commentsAfterBody==null){
					_commentsAfterBody = new OrderedSet<Comment>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY);
				}
				return _commentsAfterBody;
			}
		
		}
		private OrderedSet<Comment> _commentsBeforeBody;
		
		public virtual OrderedSet<Comment> commentsBeforeBody
		{
			get {
				if(_commentsBeforeBody==null){
					_commentsBeforeBody = new OrderedSet<Comment>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY);
				}
				return _commentsBeforeBody;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ABSTRACTTYPEDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetPackage((Package)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicAdd((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					return basicSetPackage(null, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicRemove((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE, msgs);
				return msgs;
		}
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_NAME:
					return name;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
					return commentsBeforeBody;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
					return commentsAfterBody;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					return package;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
					return superInterfaces;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
					commentsBeforeBody.Clear();
					commentsBeforeBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
					commentsAfterBody.Clear();
					commentsAfterBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
					superInterfaces.Clear();
					superInterfaces.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
