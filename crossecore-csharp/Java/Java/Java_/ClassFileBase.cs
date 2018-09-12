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
	public class ClassFileBase 
	:NamedElementImpl, ClassFile
	{
		private string _originalFilePath = "";
		public virtual string originalFilePath
		{
		get { 
			return _originalFilePath;
		}
		set { _originalFilePath = value; }
		}
		private AbstractTypeDeclaration _type;
		public virtual AbstractTypeDeclaration type
		{
			get {
			
				return _type;
			}
			set {
				var oldvalue = _type;
				_type = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_TYPE , oldvalue, value));
				}
				}
		}
		private CompilationUnit _attachedSource;
		public virtual CompilationUnit attachedSource
		{
			get {
			
				return _attachedSource;
			}
			set {
				var oldvalue = _attachedSource;
				_attachedSource = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE , oldvalue, value));
				}
				}
		}
		private Package _package;
		public virtual Package package
		{
			get {
			
				return _package;
			}
			set {
				var oldvalue = _package;
				_package = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.CLASSFILE_PACKAGE , oldvalue, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.CLASSFILE;
		}
		
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			var oldobj = _package;
			_package = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_PACKAGE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetType(AbstractTypeDeclaration newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_TYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetAttachedSource(CompilationUnit newobj, NotificationChain msgs) {
			var oldobj = _attachedSource;
			_attachedSource = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE, oldobj, newobj);
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
				case Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH:
					return originalFilePath;
				case Java_PackageImpl.CLASSFILE_TYPE:
					return type;
				case Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE:
					return attachedSource;
				case Java_PackageImpl.CLASSFILE_PACKAGE:
					return package;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH:
					originalFilePath = (string) newValue;
					return;
				case Java_PackageImpl.CLASSFILE_TYPE:
					type = (AbstractTypeDeclaration) newValue;
					return;
				case Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE:
					attachedSource = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.CLASSFILE_PACKAGE:
					package = (Package) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.CLASSFILE_ORIGINALFILEPATH:
					return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
				case Java_PackageImpl.CLASSFILE_TYPE:
					return getType() != null; //single, volatile
				case Java_PackageImpl.CLASSFILE_ATTACHEDSOURCE:
					return getAttachedSource() != null; //single, volatile
				case Java_PackageImpl.CLASSFILE_PACKAGE:
					return getPackage() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
