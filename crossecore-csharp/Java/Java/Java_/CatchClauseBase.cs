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
	public class CatchClauseBase 
	:StatementImpl, CatchClause
	{
		private SingleVariableDeclaration _exception;
		public virtual SingleVariableDeclaration exception
		{
			get {
			
				return _exception;
			}
			set {
				if (value != _exception) {
					NotificationChain msgs = null;
					if (_exception != null){
						msgs = ((InternalEObject)_exception).eInverseRemove(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, typeof(CatchClause), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.SINGLEVARIABLEDECLARATION_CATCHCLAUSE, typeof(CatchClause), msgs);
					}
					msgs = basicSetException(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CATCHCLAUSE_EXCEPTION , value, value));
				}
				}
		}
		private Block _body;
		public virtual Block body
		{
			get {
			
				return _body;
			}
			set {
				if (value != _body) {
					NotificationChain msgs = null;
					if (_body != null){
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CATCHCLAUSE_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.CATCHCLAUSE_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CATCHCLAUSE_BODY , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CATCHCLAUSE;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CATCHCLAUSE_EXCEPTION:
					if (_exception != null){
						msgs = ((InternalEObject)_exception).eInverseRemove(this, Java_PackageImpl.CATCHCLAUSE_EXCEPTION, typeof(SingleVariableDeclaration), msgs);
					}
					return basicSetException((SingleVariableDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.CATCHCLAUSE_EXCEPTION:
					return basicSetException(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetException(SingleVariableDeclaration newobj, NotificationChain msgs) {
			var oldobj = _exception;
			_exception = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CATCHCLAUSE_EXCEPTION, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CATCHCLAUSE_BODY, oldobj, newobj);
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
				case Java_PackageImpl.CATCHCLAUSE_EXCEPTION:
					return exception;
				case Java_PackageImpl.CATCHCLAUSE_BODY:
					return body;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CATCHCLAUSE_EXCEPTION:
					exception = (SingleVariableDeclaration) newValue;
					return;
				case Java_PackageImpl.CATCHCLAUSE_BODY:
					body = (Block) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.CATCHCLAUSE_EXCEPTION:
					return _exception != null; //single != null;
				case Java_PackageImpl.CATCHCLAUSE_BODY:
					return _body != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
