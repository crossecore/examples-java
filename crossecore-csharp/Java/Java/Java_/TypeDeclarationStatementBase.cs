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
	public class TypeDeclarationStatementBase 
	:StatementImpl, TypeDeclarationStatement
	{
		private AbstractTypeDeclaration _declaration;
		public virtual AbstractTypeDeclaration declaration
		{
			get {
			
				return _declaration;
			}
			set {
				if (value != _declaration) {
					NotificationChain msgs = null;
					if (_declaration != null){
						msgs = ((InternalEObject)_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION, null, msgs);
					}
					msgs = basicSetDeclaration(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TYPEDECLARATIONSTATEMENT;
		}
		
		
		public NotificationChain basicSetDeclaration(AbstractTypeDeclaration newobj, NotificationChain msgs) {
			var oldobj = _declaration;
			_declaration = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION, oldobj, newobj);
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
				case Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION:
					return declaration;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION:
					declaration = (AbstractTypeDeclaration) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.TYPEDECLARATIONSTATEMENT_DECLARATION:
					return _declaration != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
