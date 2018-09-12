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
	public class ContinueStatementBase 
	:StatementImpl, ContinueStatement
	{
		private LabeledStatement _label;
		public virtual LabeledStatement label
		{
			get {
			
				return _label;
			}
			set {
				if (value != _label) {
					NotificationChain msgs = null;
					if (_label != null){
						msgs = ((InternalEObject)_label).eInverseRemove(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, typeof(ContinueStatement), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, typeof(ContinueStatement), msgs);
					}
					msgs = basicSetLabel(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CONTINUESTATEMENT_LABEL , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CONTINUESTATEMENT;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
					if (_label != null){
						msgs = ((InternalEObject)_label).eInverseRemove(this, Java_PackageImpl.CONTINUESTATEMENT_LABEL, typeof(LabeledStatement), msgs);
					}
					return basicSetLabel((LabeledStatement)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
					return basicSetLabel(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetLabel(LabeledStatement newobj, NotificationChain msgs) {
			var oldobj = _label;
			_label = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CONTINUESTATEMENT_LABEL, oldobj, newobj);
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
				case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
					return label;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
					label = (LabeledStatement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.CONTINUESTATEMENT_LABEL:
					return getLabel() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
