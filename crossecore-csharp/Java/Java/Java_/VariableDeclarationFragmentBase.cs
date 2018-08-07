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
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_NAME:
					return name;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_PROXY:
					return proxy;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS:
					return usagesInImports;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS:
					return extraArrayDimensions;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_INITIALIZER:
					return initializer;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS:
					return usageInVariableAccess;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					return variablesContainer;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_EXTRAARRAYDIMENSIONS:
					extraArrayDimensions = (int) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_INITIALIZER:
					initializer = (Expression) newValue;
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_USAGEINVARIABLEACCESS:
					usageInVariableAccess.Clear();
					usageInVariableAccess.AddRange(((List<EObject>)newValue)?.Cast<SingleVariableAccess>());
					return;
				case Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER:
					variablesContainer = (AbstractVariablesContainer) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
