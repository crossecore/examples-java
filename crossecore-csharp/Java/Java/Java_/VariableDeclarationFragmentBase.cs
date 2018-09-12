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
	public class VariableDeclarationFragmentBase 
	:VariableDeclarationImpl, VariableDeclarationFragment
	{
		public virtual AbstractVariablesContainer variablesContainer
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER) return default(AbstractVariablesContainer);
				return (AbstractVariablesContainer)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, typeof(VariableDeclarationFragment), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, typeof(VariableDeclarationFragment), msgs);
					}
					msgs = basicSetVariablesContainer(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.VARIABLEDECLARATIONFRAGMENT;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetVariablesContainer((AbstractVariablesContainer)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					return basicSetVariablesContainer(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetVariablesContainer(AbstractVariablesContainer newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					return variablesContainer;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					variablesContainer = (AbstractVariablesContainer) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					return getVariablesContainer() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
