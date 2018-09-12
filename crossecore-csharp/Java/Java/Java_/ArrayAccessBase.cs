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
	public class ArrayAccessBase 
	:ExpressionImpl, ArrayAccess
	{
		private Expression _array;
		public virtual Expression array
		{
			get {
			
				return _array;
			}
			set {
				if (value != _array) {
					NotificationChain msgs = null;
					if (_array != null){
						msgs = ((InternalEObject)_array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYACCESS_ARRAY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYACCESS_ARRAY, null, msgs);
					}
					msgs = basicSetArray(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAYACCESS_ARRAY , value, value));
				}
				}
		}
		private Expression _index;
		public virtual Expression index
		{
			get {
			
				return _index;
			}
			set {
				if (value != _index) {
					NotificationChain msgs = null;
					if (_index != null){
						msgs = ((InternalEObject)_index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYACCESS_INDEX, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYACCESS_INDEX, null, msgs);
					}
					msgs = basicSetIndex(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAYACCESS_INDEX , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ARRAYACCESS;
		}
		
		
		public NotificationChain basicSetArray(Expression newobj, NotificationChain msgs) {
			var oldobj = _array;
			_array = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAYACCESS_ARRAY, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetIndex(Expression newobj, NotificationChain msgs) {
			var oldobj = _index;
			_index = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAYACCESS_INDEX, oldobj, newobj);
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
				case Java_PackageImpl.ARRAYACCESS_ARRAY:
					return array;
				case Java_PackageImpl.ARRAYACCESS_INDEX:
					return index;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYACCESS_ARRAY:
					array = (Expression) newValue;
					return;
				case Java_PackageImpl.ARRAYACCESS_INDEX:
					index = (Expression) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYACCESS_ARRAY:
					return _array != null; //single != null;
				case Java_PackageImpl.ARRAYACCESS_INDEX:
					return _index != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
