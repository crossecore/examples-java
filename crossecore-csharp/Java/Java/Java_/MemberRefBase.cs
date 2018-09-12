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
	public class MemberRefBase 
	:ASTNodeImpl, MemberRef
	{
		private NamedElement _member;
		public virtual NamedElement member
		{
			get {
			
				return _member;
			}
			set {
				var oldvalue = _member;
				_member = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MEMBERREF_MEMBER , oldvalue, value));
				}
				}
		}
		private TypeAccess _qualifier;
		public virtual TypeAccess qualifier
		{
			get {
			
				return _qualifier;
			}
			set {
				if (value != _qualifier) {
					NotificationChain msgs = null;
					if (_qualifier != null){
						msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MEMBERREF_QUALIFIER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.MEMBERREF_QUALIFIER, null, msgs);
					}
					msgs = basicSetQualifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.MEMBERREF_QUALIFIER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.MEMBERREF;
		}
		
		
		public NotificationChain basicSetQualifier(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _qualifier;
			_qualifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.MEMBERREF_QUALIFIER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetMember(NamedElement newobj, NotificationChain msgs) {
			var oldobj = _member;
			_member = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.MEMBERREF_MEMBER, oldobj, newobj);
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
				case Java_PackageImpl.MEMBERREF_MEMBER:
					return member;
				case Java_PackageImpl.MEMBERREF_QUALIFIER:
					return qualifier;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.MEMBERREF_MEMBER:
					member = (NamedElement) newValue;
					return;
				case Java_PackageImpl.MEMBERREF_QUALIFIER:
					qualifier = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.MEMBERREF_MEMBER:
					return getMember() != null; //single, volatile
				case Java_PackageImpl.MEMBERREF_QUALIFIER:
					return _qualifier != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
