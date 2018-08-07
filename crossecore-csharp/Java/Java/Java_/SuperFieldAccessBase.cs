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
	public class SuperFieldAccessBase 
	:AbstractTypeQualifiedExpressionImpl, SuperFieldAccess
	{
		private SingleVariableAccess _field;
		public virtual SingleVariableAccess field
		{
			get {
			
				return _field;
			}
			set {
				if (value != _field) {
					NotificationChain msgs = null;
					if (_field != null){
						msgs = ((InternalEObject)_field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERFIELDACCESS_FIELD, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.SUPERFIELDACCESS_FIELD, null, msgs);
					}
					msgs = basicSetField(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.SUPERFIELDACCESS_FIELD , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.SUPERFIELDACCESS;
		}
		
		
		public NotificationChain basicSetField(SingleVariableAccess newobj, NotificationChain msgs) {
			var oldobj = _field;
			_field = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.SUPERFIELDACCESS_FIELD, oldobj, newobj);
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
				case Java_PackageImpl.SUPERFIELDACCESS_COMMENTS:
					return comments;
				case Java_PackageImpl.SUPERFIELDACCESS_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.SUPERFIELDACCESS_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.SUPERFIELDACCESS_QUALIFIER:
					return qualifier;
				case Java_PackageImpl.SUPERFIELDACCESS_FIELD:
					return field;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.SUPERFIELDACCESS_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.SUPERFIELDACCESS_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.SUPERFIELDACCESS_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.SUPERFIELDACCESS_QUALIFIER:
					qualifier = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.SUPERFIELDACCESS_FIELD:
					field = (SingleVariableAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
