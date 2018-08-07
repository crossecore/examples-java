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
	public class PackageAccessBase 
	:NamespaceAccessImpl, PackageAccess
	{
		private Package _package;
		public virtual Package package
		{
			get {
			
				return _package;
			}
			set {
				if (value != _package) {
					NotificationChain msgs = null;
					if (_package != null){
						msgs = ((InternalEObject)_package).eInverseRemove(this, Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS, typeof(PackageAccess), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_USAGESINPACKAGEACCESS, typeof(PackageAccess), msgs);
					}
					msgs = basicSetPackage(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGEACCESS_PACKAGE , value, value));
				}
				}
		}
		private PackageAccess _qualifier;
		public virtual PackageAccess qualifier
		{
			get {
			
				return _qualifier;
			}
			set {
				if (value != _qualifier) {
					NotificationChain msgs = null;
					if (_qualifier != null){
						msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PACKAGEACCESS_QUALIFIER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.PACKAGEACCESS_QUALIFIER, null, msgs);
					}
					msgs = basicSetQualifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.PACKAGEACCESS_QUALIFIER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.PACKAGEACCESS;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGEACCESS_PACKAGE:
					if (_package != null){
						msgs = ((InternalEObject)_package).eInverseRemove(this, Java_PackageImpl.PACKAGEACCESS_PACKAGE, typeof(Package), msgs);
					}
					return basicSetPackage((Package)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGEACCESS_PACKAGE:
					return basicSetPackage(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			var oldobj = _package;
			_package = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PACKAGEACCESS_PACKAGE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetQualifier(PackageAccess newobj, NotificationChain msgs) {
			var oldobj = _qualifier;
			_qualifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.PACKAGEACCESS_QUALIFIER, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGEACCESS_COMMENTS:
					return comments;
				case Java_PackageImpl.PACKAGEACCESS_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.PACKAGEACCESS_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.PACKAGEACCESS_PACKAGE:
					return package;
				case Java_PackageImpl.PACKAGEACCESS_QUALIFIER:
					return qualifier;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.PACKAGEACCESS_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.PACKAGEACCESS_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.PACKAGEACCESS_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.PACKAGEACCESS_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.PACKAGEACCESS_QUALIFIER:
					qualifier = (PackageAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
