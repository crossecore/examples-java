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
	public class InitializerBase 
	:BodyDeclarationImpl, Initializer
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
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INITIALIZER_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.INITIALIZER_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.INITIALIZER_BODY , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.INITIALIZER;
		}
		
		
		public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.INITIALIZER_BODY, oldobj, newobj);
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
				case Java_PackageImpl.INITIALIZER_COMMENTS:
					return comments;
				case Java_PackageImpl.INITIALIZER_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.INITIALIZER_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.INITIALIZER_NAME:
					return name;
				case Java_PackageImpl.INITIALIZER_PROXY:
					return proxy;
				case Java_PackageImpl.INITIALIZER_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.INITIALIZER_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.INITIALIZER_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.INITIALIZER_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.INITIALIZER_MODIFIER:
					return modifier;
				case Java_PackageImpl.INITIALIZER_BODY:
					return body;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.INITIALIZER_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.INITIALIZER_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.INITIALIZER_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.INITIALIZER_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.INITIALIZER_BODY:
					body = (Block) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
