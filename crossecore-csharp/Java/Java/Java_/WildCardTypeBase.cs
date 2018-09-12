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
	public class WildCardTypeBase 
	:TypeImpl, WildCardType
	{
		private bool _upperBound = false;
		public virtual bool upperBound
		{
		get { 
			return _upperBound;
		}
		set { _upperBound = value; }
		}
		private TypeAccess _bound;
		public virtual TypeAccess bound
		{
			get {
			
				return _bound;
			}
			set {
				if (value != _bound) {
					NotificationChain msgs = null;
					if (_bound != null){
						msgs = ((InternalEObject)_bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.WILDCARDTYPE_BOUND, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.WILDCARDTYPE_BOUND, null, msgs);
					}
					msgs = basicSetBound(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.WILDCARDTYPE_BOUND , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.WILDCARDTYPE;
		}
		
		
		public NotificationChain basicSetBound(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _bound;
			_bound = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.WILDCARDTYPE_BOUND, oldobj, newobj);
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
				case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
					return upperBound;
				case Java_PackageImpl.WILDCARDTYPE_BOUND:
					return bound;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
					upperBound = (bool) newValue;
					return;
				case Java_PackageImpl.WILDCARDTYPE_BOUND:
					bound = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.WILDCARDTYPE_UPPERBOUND:
					return _upperBound != UPPERBOUND_EDEFAULT;
				case Java_PackageImpl.WILDCARDTYPE_BOUND:
					return _bound != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
