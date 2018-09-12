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
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYTYPE_DIMENSIONS:
					return dimensions;
				case Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE:
					return elementType;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYTYPE_DIMENSIONS:
					dimensions = (int) newValue;
					return;
				case Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE:
					elementType = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYTYPE_DIMENSIONS:
					return _dimensions != DIMENSIONS_EDEFAULT;
				case Java_PackageImpl.ARRAYTYPE_ELEMENTTYPE:
					return _elementType != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
