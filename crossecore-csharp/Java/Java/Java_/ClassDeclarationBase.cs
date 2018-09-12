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
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
					return superClass;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
					superClass = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.CLASSDECLARATION_SUPERCLASS:
					return _superClass != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
