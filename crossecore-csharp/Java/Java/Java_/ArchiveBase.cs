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
		
		public override Object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.ARCHIVE_COMMENTS:
					return comments;
				case Java_PackageImpl.ARCHIVE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ARCHIVE_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ARCHIVE_NAME:
					return name;
				case Java_PackageImpl.ARCHIVE_PROXY:
					return proxy;
				case Java_PackageImpl.ARCHIVE_USAGESINIMPORTS:
					return usagesInImports;
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
				case Java_PackageImpl.ARCHIVE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ARCHIVE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ARCHIVE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ARCHIVE_NAME:
					name = (string) newValue;
					return;
				case Java_PackageImpl.ARCHIVE_PROXY:
					proxy = (bool) newValue;
					return;
				case Java_PackageImpl.ARCHIVE_USAGESINIMPORTS:
					usagesInImports.Clear();
					usagesInImports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
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
		
		
	}
}
