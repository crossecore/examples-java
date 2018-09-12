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
	public class ArchiveBase 
	:NamedElementImpl, Archive
	{
		private string _originalFilePath = "";
		public virtual string originalFilePath
		{
		get { 
			return _originalFilePath;
		}
		set { _originalFilePath = value; }
		}
		private Set<ClassFile> _classFiles;
		
		public virtual Set<ClassFile> classFiles
		{
			get {
				if(_classFiles==null){
					_classFiles = new Set<ClassFile>(this, Java_PackageImpl.ARCHIVE_CLASSFILES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE_CLASSFILES);
				}
				return _classFiles;
			}
		
		}
		private Manifest _manifest;
		public virtual Manifest manifest
		{
			get {
			
				return _manifest;
			}
			set {
				if (value != _manifest) {
					NotificationChain msgs = null;
					if (_manifest != null){
						msgs = ((InternalEObject)_manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE_MANIFEST, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARCHIVE_MANIFEST, null, msgs);
					}
					msgs = basicSetManifest(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARCHIVE_MANIFEST , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ARCHIVE;
		}
		
		
		public NotificationChain basicSetManifest(Manifest newobj, NotificationChain msgs) {
			var oldobj = _manifest;
			_manifest = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARCHIVE_MANIFEST, oldobj, newobj);
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
				case Java_PackageImpl.ARCHIVE_ORIGINALFILEPATH:
					return originalFilePath;
				case Java_PackageImpl.ARCHIVE_CLASSFILES:
					return classFiles;
				case Java_PackageImpl.ARCHIVE_MANIFEST:
					return manifest;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARCHIVE_ORIGINALFILEPATH:
					originalFilePath = (string) newValue;
					return;
				case Java_PackageImpl.ARCHIVE_CLASSFILES:
					classFiles.Clear();
					classFiles.AddRange(((List<EObject>)newValue)?.Cast<ClassFile>());
					return;
				case Java_PackageImpl.ARCHIVE_MANIFEST:
					manifest = (Manifest) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ARCHIVE_ORIGINALFILEPATH:
					return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
				case Java_PackageImpl.ARCHIVE_CLASSFILES:
					return _classFiles != null && !_classFiles.isEmpty();
				case Java_PackageImpl.ARCHIVE_MANIFEST:
					return _manifest != null; //single != null;
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
