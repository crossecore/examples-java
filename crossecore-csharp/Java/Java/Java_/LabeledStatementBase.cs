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
	public class LabeledStatementBase 
	:NamedElementImpl, LabeledStatement
	{
		private Statement _body;
		public virtual Statement body
		{
			get {
			
				return _body;
			}
			set {
				if (value != _body) {
					NotificationChain msgs = null;
					if (_body != null){
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.LABELEDSTATEMENT_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.LABELEDSTATEMENT_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.LABELEDSTATEMENT_BODY , value, value));
				}
				}
		}
		private Set<BreakStatement> _usagesInBreakStatements;
		
		public virtual Set<BreakStatement> usagesInBreakStatements
		{
			get {
				if(_usagesInBreakStatements==null){
					_usagesInBreakStatements = new Set<BreakStatement>(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS, Java_PackageImpl.BREAKSTATEMENT_LABEL);
				}
				return _usagesInBreakStatements;
			}
		
		}
		private Set<ContinueStatement> _usagesInContinueStatements;
		
		public virtual Set<ContinueStatement> usagesInContinueStatements
		{
			get {
				if(_usagesInContinueStatements==null){
					_usagesInContinueStatements = new Set<ContinueStatement>(this, Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS, Java_PackageImpl.CONTINUESTATEMENT_LABEL);
				}
				return _usagesInContinueStatements;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.LABELEDSTATEMENT;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					return usagesInBreakStatements.basicAdd((BreakStatement)otherEnd, msgs);
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					return usagesInContinueStatements.basicAdd((ContinueStatement)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					return usagesInBreakStatements.basicRemove((BreakStatement)otherEnd, msgs);
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					return usagesInContinueStatements.basicRemove((ContinueStatement)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetBody(Statement newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.LABELEDSTATEMENT_BODY, oldobj, newobj);
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
				case Java_PackageImpl.LABELEDSTATEMENT_BODY:
					return body;
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					return usagesInBreakStatements;
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					return usagesInContinueStatements;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.LABELEDSTATEMENT_BODY:
					body = (Statement) newValue;
					return;
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					usagesInBreakStatements.Clear();
					usagesInBreakStatements.AddRange(((List<EObject>)newValue)?.Cast<BreakStatement>());
					return;
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					usagesInContinueStatements.Clear();
					usagesInContinueStatements.AddRange(((List<EObject>)newValue)?.Cast<ContinueStatement>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.LABELEDSTATEMENT_BODY:
					return _body != null; //single != null;
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINBREAKSTATEMENTS:
					return getUsagesInBreakStatements().isEmpty(); //many, volatile
				case Java_PackageImpl.LABELEDSTATEMENT_USAGESINCONTINUESTATEMENTS:
					return getUsagesInContinueStatements().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(Statement)) {
				switch (derivedFeatureID) {
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(Statement)) {
				switch (baseFeatureID) {
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
