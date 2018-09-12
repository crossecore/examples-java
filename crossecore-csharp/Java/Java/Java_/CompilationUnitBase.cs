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
	public class CompilationUnitBase 
	:NamedElementImpl, CompilationUnit
	{
		private string _originalFilePath = "";
		public virtual string originalFilePath
		{
		get { 
			return _originalFilePath;
		}
		set { _originalFilePath = value; }
		}
		private OrderedSet<Comment> _commentList;
		
		public virtual OrderedSet<Comment> commentList
		{
			get {
				if(_commentList==null){
					_commentList = new OrderedSet<Comment>(this, Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST);
				}
				return _commentList;
			}
		
		}
		private OrderedSet<ImportDeclaration> _imports;
		
		public virtual OrderedSet<ImportDeclaration> imports
		{
			get {
				if(_imports==null){
					_imports = new OrderedSet<ImportDeclaration>(this, Java_PackageImpl.COMPILATIONUNIT_IMPORTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_IMPORTS);
				}
				return _imports;
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
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.COMPILATIONUNIT_PACKAGE , oldvalue, value));
				}
				}
		}
		private OrderedSet<AbstractTypeDeclaration> _types;
		
		public virtual OrderedSet<AbstractTypeDeclaration> types
		{
			get {
				if(_types==null){
					_types = new OrderedSet<AbstractTypeDeclaration>(this, Java_PackageImpl.COMPILATIONUNIT_TYPES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.COMPILATIONUNIT_TYPES);
				}
				return _types;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.COMPILATIONUNIT;
		}
		
		
		public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			var oldobj = _package;
			_package = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.COMPILATIONUNIT_PACKAGE, oldobj, newobj);
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
				case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
					return originalFilePath;
				case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
					return commentList;
				case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
					return imports;
				case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
					return package;
				case Java_PackageImpl.COMPILATIONUNIT_TYPES:
					return types;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
					originalFilePath = (string) newValue;
					return;
				case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
					commentList.Clear();
					commentList.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
					imports.Clear();
					imports.AddRange(((List<EObject>)newValue)?.Cast<ImportDeclaration>());
					return;
				case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
					package = (Package) newValue;
					return;
				case Java_PackageImpl.COMPILATIONUNIT_TYPES:
					types.Clear();
					types.AddRange(((List<EObject>)newValue)?.Cast<AbstractTypeDeclaration>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.COMPILATIONUNIT_ORIGINALFILEPATH:
					return ORIGINALFILEPATH_EDEFAULT == null ? _originalFilePath != null : !ORIGINALFILEPATH_EDEFAULT.equals(_originalFilePath);
				case Java_PackageImpl.COMPILATIONUNIT_COMMENTLIST:
					return getCommentList().isEmpty(); //many, volatile
				case Java_PackageImpl.COMPILATIONUNIT_IMPORTS:
					return _imports != null && !_imports.isEmpty();
				case Java_PackageImpl.COMPILATIONUNIT_PACKAGE:
					return getPackage() != null; //single, volatile
				case Java_PackageImpl.COMPILATIONUNIT_TYPES:
					return getTypes().isEmpty(); //many, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
