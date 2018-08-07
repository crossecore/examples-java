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
	public class UnresolvedItemAccessBase 
	:ExpressionImpl, UnresolvedItemAccess
	{
		private UnresolvedItem _element;
		public virtual UnresolvedItem element
		{
			get {
			
				return _element;
			}
			set {
				var oldvalue = _element;
				_element = value;
				if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT , oldvalue, value));
				}
				}
		}
		private ASTNode _qualifier;
		public virtual ASTNode qualifier
		{
			get {
			
				return _qualifier;
			}
			set {
				if (value != _qualifier) {
					NotificationChain msgs = null;
					if (_qualifier != null){
						msgs = ((InternalEObject)_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, null, msgs);
					}
					msgs = basicSetQualifier(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.UNRESOLVEDITEMACCESS;
		}
		
		
		public NotificationChain basicSetElement(UnresolvedItem newobj, NotificationChain msgs) {
			var oldobj = _element;
			_element = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetQualifier(ASTNode newobj, NotificationChain msgs) {
			var oldobj = _qualifier;
			_qualifier = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER, oldobj, newobj);
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
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_COMMENTS:
					return comments;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT:
					return element;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER:
					return qualifier;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_ELEMENT:
					element = (UnresolvedItem) newValue;
					return;
				case Java_PackageImpl.UNRESOLVEDITEMACCESS_QUALIFIER:
					qualifier = (ASTNode) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
