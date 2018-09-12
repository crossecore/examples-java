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
	public class MethodRefParameterBase 
	:ASTNodeImpl, MethodRefParameter
	{
		private string _name = "";
		public virtual string name
		{
		get { 
			return _name;
		}
		set { _name = value; }
		}
		private bool _varargs = false;
		public virtual bool varargs
		{
		get { 
			return _varargs;
		}
		set { _varargs = value; }
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODREFPARAMETER_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.METHODREFPARAMETER_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.METHODREFPARAMETER_TYPE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.METHODREFPARAMETER;
		}
		
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.METHODREFPARAMETER_TYPE, oldobj, newobj);
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
				case Java_PackageImpl.METHODREFPARAMETER_NAME:
					return name;
				case Java_PackageImpl.METHODREFPARAMETER_VARARGS:
					return varargs;
				case Java_PackageImpl.METHODREFPARAMETER_TYPE:
					return type;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.METHODREFPARAMETER_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.METHODREFPARAMETER_VARARGS:
					varargs = (bool) newValue;
					return;
				case Java_PackageImpl.METHODREFPARAMETER_TYPE:
					type = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.METHODREFPARAMETER_NAME:
					return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
				case Java_PackageImpl.METHODREFPARAMETER_VARARGS:
					return _varargs != VARARGS_EDEFAULT;
				case Java_PackageImpl.METHODREFPARAMETER_TYPE:
					return _type != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
