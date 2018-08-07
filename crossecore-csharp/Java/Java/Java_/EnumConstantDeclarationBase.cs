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
	public class EnumConstantDeclarationBase 
	:BodyDeclarationImpl, EnumConstantDeclaration
	{
		private OrderedSet<Expression> _arguments;
		
		public virtual OrderedSet<Expression> arguments
		{
			get {
				if(_arguments==null){
					_arguments = new OrderedSet<Expression>(this, Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS);
				}
				return _arguments;
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
						msgs = ((InternalEObject)_anonymousClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, null, msgs);
					}
					msgs = basicSetAnonymousClassDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ENUMCONSTANTDECLARATION;
		}
		
		
		public NotificationChain basicSetAnonymousClassDeclaration(AnonymousClassDeclaration newobj, NotificationChain msgs) {
			var oldobj = _anonymousClassDeclaration;
			_anonymousClassDeclaration = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION, oldobj, newobj);
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
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_NAME:
					return name;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_PROXY:
					return proxy;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ABSTRACTTYPEDECLARATION:
					return abstractTypeDeclaration;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANNOTATIONS:
					return annotations;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					return anonymousClassDeclarationOwner;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_MODIFIER:
					return modifier;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
					return initializer;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
					return anonymousClassDeclaration;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
					return arguments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ABSTRACTTYPEDECLARATION:
					abstractTypeDeclaration = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANNOTATIONS:
					annotations.Clear();
					annotations.AddRange(((List<EObject>)newValue)?.Cast<Annotation>());
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER:
					anonymousClassDeclarationOwner = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_MODIFIER:
					modifier = (Modifier) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ANONYMOUSCLASSDECLARATION:
					anonymousClassDeclaration = (AnonymousClassDeclaration) newValue;
					return;
				case Java_PackageImpl.ENUMCONSTANTDECLARATION_ARGUMENTS:
					arguments.Clear();
					arguments.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
