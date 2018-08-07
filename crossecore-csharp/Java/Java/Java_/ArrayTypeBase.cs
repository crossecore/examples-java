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
	public class ArrayTypeBase 
	:TypeImpl, ArrayType
	{
		private int _dimensions = 0;
		public virtual int dimensions
		{
		get { 
			return _dimensions;
		}
		set { _dimensions = value; }
		}
		private TypeAccess _elementType;
		public virtual TypeAccess elementType
		{
			get {
			
				return _elementType;
			}
			set {
				if (value != _elementType) {
					NotificationChain msgs = null;
					if (_elementType != null){
						msgs = ((InternalEObject)_elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE, null, msgs);
					}
					msgs = basicSetElementType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ARRAYTYPE;
		}
		
		
		public NotificationChain basicSetElementType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _elementType;
			_elementType = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE, oldobj, newobj);
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
				case Java_PackageImpl.ARRAYTYPE_COMMENTS:
					return comments;
				case Java_PackageImpl.ARRAYTYPE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ARRAYTYPE_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ARRAYTYPE_NAME:
					return name;
				case Java_PackageImpl.ARRAYTYPE_PROXY:
					return proxy;
				case Java_PackageImpl.ARRAYTYPE_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.ARRAYTYPE_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.ARRAYTYPE_DIMENSIONS:
					return dimensions;
				case Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE:
					return elementType;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYTYPE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ARRAYTYPE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.ARRAYTYPE_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ARRAYTYPE_DIMENSIONS:
					dimensions = (int) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE:
					elementType = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
