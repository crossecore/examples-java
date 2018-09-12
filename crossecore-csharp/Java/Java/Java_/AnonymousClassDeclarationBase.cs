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
	public class AnonymousClassDeclarationBase 
	:ASTNodeImpl, AnonymousClassDeclaration
	{
		private OrderedSet<BodyDeclaration> _bodyDeclarations;
		
		public virtual OrderedSet<BodyDeclaration> bodyDeclarations
		{
			get {
				if(_bodyDeclarations==null){
					_bodyDeclarations = new OrderedSet<BodyDeclaration>(this, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS, Java_PackageImpl.BODYDECLARATION_ANONYMOUSCLASSDECLARATIONOWNER);
				}
				return _bodyDeclarations;
			}
		
		}
		public virtual ClassInstanceCreation classInstanceCreation
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION) return default(ClassInstanceCreation);
				return (ClassInstanceCreation)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, typeof(AnonymousClassDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION, typeof(AnonymousClassDeclaration), msgs);
					}
					msgs = basicSetClassInstanceCreation(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ANONYMOUSCLASSDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetClassInstanceCreation((ClassInstanceCreation)otherEnd, msgs);
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicAdd((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
					return basicSetClassInstanceCreation(null, msgs);
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicRemove((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetClassInstanceCreation(ClassInstanceCreation newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
					return classInstanceCreation;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
					classInstanceCreation = (ClassInstanceCreation) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_BODYDECLARATIONS:
					return _bodyDeclarations != null && !_bodyDeclarations.isEmpty();
				case Java_PackageImpl.ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION:
					return getClassInstanceCreation() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
