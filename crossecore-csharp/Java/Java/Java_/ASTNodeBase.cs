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
	public class ASTNodeBase 
	:BasicEObjectImpl, ASTNode
	{
		private OrderedSet<Comment> _comments;
		
		public virtual OrderedSet<Comment> comments
		{
			get {
				if(_comments==null){
					_comments = new OrderedSet<Comment>(this, Java_PackageImpl.ASTNODE_COMMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ASTNODE_COMMENTS);
				}
				return _comments;
			}
		
		}
		private CompilationUnit _originalCompilationUnit;
		public virtual CompilationUnit originalCompilationUnit
		{
			get {
			
				return _originalCompilationUnit;
			}
			set {
				var oldvalue = _originalCompilationUnit;
				_originalCompilationUnit = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASTNODE_ORIGINALCOMPILATIONUNIT , oldvalue, value));
				}
				}
		}
		private ClassFile _originalClassFile;
		public virtual ClassFile originalClassFile
		{
			get {
			
				return _originalClassFile;
			}
			set {
				var oldvalue = _originalClassFile;
				_originalClassFile = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ASTNODE_ORIGINALCLASSFILE , oldvalue, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ASTNODE;
		}
		
		
		public NotificationChain basicSetOriginalCompilationUnit(CompilationUnit newobj, NotificationChain msgs) {
			var oldobj = _originalCompilationUnit;
			_originalCompilationUnit = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASTNODE_ORIGINALCOMPILATIONUNIT, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetOriginalClassFile(ClassFile newobj, NotificationChain msgs) {
			var oldobj = _originalClassFile;
			_originalClassFile = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ASTNODE_ORIGINALCLASSFILE, oldobj, newobj);
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
				case Java_PackageImpl.ASTNODE_COMMENTS:
					return comments;
				case Java_PackageImpl.ASTNODE_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ASTNODE_ORIGINALCLASSFILE:
					return originalClassFile;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ASTNODE_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ASTNODE_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ASTNODE_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.ASTNODE_COMMENTS:
					return _comments != null && !_comments.isEmpty();
				case Java_PackageImpl.ASTNODE_ORIGINALCOMPILATIONUNIT:
					return getOriginalCompilationUnit() != null; //single, volatile
				case Java_PackageImpl.ASTNODE_ORIGINALCLASSFILE:
					return getOriginalClassFile() != null; //single, volatile
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
