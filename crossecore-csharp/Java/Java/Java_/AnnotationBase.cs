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
	public class AnnotationBase 
	:ExpressionImpl, Annotation
	{
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANNOTATION_TYPE , value, value));
				}
				}
		}
		private OrderedSet<AnnotationMemberValuePair> _values;
		
		public virtual OrderedSet<AnnotationMemberValuePair> values
		{
			get {
				if(_values==null){
					_values = new OrderedSet<AnnotationMemberValuePair>(this, Java_PackageImpl.ANNOTATION_VALUES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ANNOTATION_VALUES);
				}
				return _values;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ANNOTATION;
		}
		
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ANNOTATION_TYPE, oldobj, newobj);
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
				case Java_PackageImpl.ANNOTATION_TYPE:
					return type;
				case Java_PackageImpl.ANNOTATION_VALUES:
					return values;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATION_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.ANNOTATION_VALUES:
					values.Clear();
					values.AddRange(((List<EObject>)newValue)?.Cast<AnnotationMemberValuePair>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ANNOTATION_TYPE:
					return _type != null; //single != null;
				case Java_PackageImpl.ANNOTATION_VALUES:
					return _values != null && !_values.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
