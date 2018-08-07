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
	public class ClassDeclarationBase 
	:TypeDeclarationImpl, ClassDeclaration
	{
		private TypeAccess _superClass;
		public virtual TypeAccess superClass
		{
			get {
			
				return _superClass;
			}
			set {
				if (value != _superClass) {
					NotificationChain msgs = null;
					if (_superClass != null){
						msgs = ((InternalEObject)_superClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, null, msgs);
					}
					msgs = basicSetSuperClass(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSDECLARATION_SUPERCLASS , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CLASSDECLARATION;
		}
		
		
		public NotificationChain basicSetSuperClass(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _superClass;
			_superClass = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSDECLARATION_SUPERCLASS, oldobj, newobj);
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
				case Java_PackageImpl.CLASSDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.CLASSDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.CLASSDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.CLASSDECLARATION_NAME:
					return name;
				case Java_PackageImpl.CLASSDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.CLASSDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.CLASSDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.CLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.CLASSDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.CLASSDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.CLASSDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.CLASSDECLARATION_COMMENTSBEFOREBODY:
					return commentsBeforeBody;
				case Java_PackageImpl.CLASSDECLARATION_COMMENTSAFTERBODY:
					return commentsAfterBody;
				case Java_PackageImpl.CLASSDECLARATION_PACKAGE:
					return package;
				case Java_PackageImpl.CLASSDECLARATION_SUPERINTERFACES:
					return superInterfaces;
				case Java_PackageImpl.CLASSDECLARATION_TYPEPARAMETERS:
					return typeParameters;
				case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
					return superClass;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CLASSDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_COMMENTSBEFOREBODY:
					commentsBeforeBody.Clear();
					commentsBeforeBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_COMMENTSAFTERBODY:
					commentsAfterBody.Clear();
					commentsAfterBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.CLASSDECLARATION_SUPERINTERFACES:
					superInterfaces.Clear();
					superInterfaces.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_TYPEPARAMETERS:
					typeParameters.Clear();
					typeParameters.AddRange(((List<EObject>)newValue)?.Cast<TypeParameter>());
					return;
				case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
					superClass = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
