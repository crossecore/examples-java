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
	public class ParameterizedTypeBase 
	:TypeImpl, ParameterizedType
	{
		private OrderedSet<TypeAccess> _typeArguments;
		
		public virtual OrderedSet<TypeAccess> typeArguments
		{
			get {
				if(_typeArguments==null){
					_typeArguments = new OrderedSet<TypeAccess>(this, Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS);
				}
				return _typeArguments;
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PARAMETERIZEDTYPE_TYPE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.PARAMETERIZEDTYPE;
		}
		
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PARAMETERIZEDTYPE_TYPE, oldobj, newobj);
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
				case Java_PackageImpl.PARAMETERIZEDTYPE_COMMENTS:
					return comments;
				case Java_PackageImpl.PARAMETERIZEDTYPE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.PARAMETERIZEDTYPE_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.PARAMETERIZEDTYPE_NAME:
					return name;
				case Java_PackageImpl.PARAMETERIZEDTYPE_PROXY:
					return proxy;
				case Java_PackageImpl.PARAMETERIZEDTYPE_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.PARAMETERIZEDTYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.PARAMETERIZEDTYPE_TYPE:
					return type;
				case Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS:
					return typeArguments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.PARAMETERIZEDTYPE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.PARAMETERIZEDTYPE_TYPEARGUMENTS:
					typeArguments.Clear();
					typeArguments.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
