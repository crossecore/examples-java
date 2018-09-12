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
	public class AbstractTypeDeclarationBase 
	:BodyDeclarationImpl, AbstractTypeDeclaration
	{
		private Set<TypeAccess> _usagesInTypeAccess;
		
		public virtual Set<TypeAccess> usagesInTypeAccess
		{
			get {
				if(_usagesInTypeAccess==null){
					_usagesInTypeAccess = new Set<TypeAccess>(this, Java_PackageImpl.TYPE_USAGESINTYPEACCESS, Java_PackageImpl.TYPEACCESS_TYPE);
				}
				return _usagesInTypeAccess;
			}
		
		}
		private OrderedSet<BodyDeclaration> _bodyDeclarations;
		
		public virtual OrderedSet<BodyDeclaration> bodyDeclarations
		{
			get {
				if(_bodyDeclarations==null){
					_bodyDeclarations = new OrderedSet<BodyDeclaration>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION);
				}
				return _bodyDeclarations;
			}
		
		}
		private OrderedSet<Comment> _commentsBeforeBody;
		
		public virtual OrderedSet<Comment> commentsBeforeBody
		{
			get {
				if(_commentsBeforeBody==null){
					_commentsBeforeBody = new OrderedSet<Comment>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY);
				}
				return _commentsBeforeBody;
			}
		
		}
		private OrderedSet<Comment> _commentsAfterBody;
		
		public virtual OrderedSet<Comment> commentsAfterBody
		{
			get {
				if(_commentsAfterBody==null){
					_commentsAfterBody = new OrderedSet<Comment>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY);
				}
				return _commentsAfterBody;
			}
		
		}
		public virtual Package package
		{
			get {
			
				if (eContainerFeatureID() != Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE) return default(Package);
				return (Package)eInternalContainer();
			}
			set {
				if (value != eInternalContainer()) {
					NotificationChain msgs = null;
					if (eInternalContainer() != null){
						msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, typeof(AbstractTypeDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, typeof(AbstractTypeDeclaration), msgs);
					}
					msgs = basicSetPackage(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE , value, value));
				}
				}
		}
		private OrderedSet<TypeAccess> _superInterfaces;
		
		public virtual OrderedSet<TypeAccess> superInterfaces
		{
			get {
				if(_superInterfaces==null){
					_superInterfaces = new OrderedSet<TypeAccess>(this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES);
				}
				return _superInterfaces;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ABSTRACTTYPEDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					if (eInternalContainer() != null) {
						msgs = eBasicRemoveFromContainer(msgs);
					}
					return basicSetPackage((Package)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess.basicAdd((TypeAccess)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicAdd((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					return basicSetPackage(null, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess.basicRemove((TypeAccess)otherEnd, msgs);
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations.basicRemove((BodyDeclaration)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
				msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE, msgs);
				return msgs;
		}
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					return usagesInTypeAccess;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return bodyDeclarations;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
					return commentsBeforeBody;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
					return commentsAfterBody;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					return package;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
					return superInterfaces;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					usagesInTypeAccess.Clear();
					usagesInTypeAccess.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					bodyDeclarations.Clear();
					bodyDeclarations.AddRange(((List<EObject>)newValue)?.Cast<BodyDeclaration>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
					commentsBeforeBody.Clear();
					commentsBeforeBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
					commentsAfterBody.Clear();
					commentsAfterBody.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
					superInterfaces.Clear();
					superInterfaces.AddRange(((List<EObject>)newValue)?.Cast<TypeAccess>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
					return getUsagesInTypeAccess().isEmpty(); //many, volatile
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
					return _bodyDeclarations != null && !_bodyDeclarations.isEmpty();
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
					return _commentsBeforeBody != null && !_commentsBeforeBody.isEmpty();
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
					return _commentsAfterBody != null && !_commentsAfterBody.isEmpty();
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
					return getPackage() != null; //single, volatile
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
					return _superInterfaces != null && !_superInterfaces.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		public override int eBaseStructuralFeatureID(int derivedFeatureID, System.Type baseClass) {
			if (baseClass == typeof(Type)) {
				switch (derivedFeatureID) {
					case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS: return Java_PackageImpl.TYPE_USAGESINTYPEACCESS;
					default: return -1;
				}
			}
			return base.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
		}
		
					
		public override int eDerivedStructuralFeatureID(int baseFeatureID, System.Type baseClass) {
			if (baseClass == typeof(Type)) {
				switch (baseFeatureID) {
					case Java_PackageImpl.TYPE_USAGESINTYPEACCESS: return Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS;
					default: return -1;
				}
			}
			return base.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
		}
		
		
	}
}
