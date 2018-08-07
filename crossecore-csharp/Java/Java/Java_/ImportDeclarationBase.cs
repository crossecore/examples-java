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
	public class ImportDeclarationBase 
	:ASTNodeImpl, ImportDeclaration
	{
		private bool _static = false;
		public virtual bool static_
		{
		get { 
			return _static;
		}
		set { _static = value; }
		}
		private NamedElement _importedElement;
		public virtual NamedElement importedElement
		{
			get {
			
				return _importedElement;
			}
			set {
				if (value != _importedElement) {
					NotificationChain msgs = null;
					if (_importedElement != null){
						msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, typeof(ImportDeclaration), msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, typeof(ImportDeclaration), msgs);
					}
					msgs = basicSetImportedElement(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.IMPORTDECLARATION;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
					if (_importedElement != null){
						msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT, typeof(NamedElement), msgs);
					}
					return basicSetImportedElement((NamedElement)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
					return basicSetImportedElement(null, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetImportedElement(NamedElement newobj, NotificationChain msgs) {
			var oldobj = _importedElement;
			_importedElement = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT, oldobj, newobj);
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
				case Java_PackageImpl.IMPORTDECLARATION_COMMENTS:
					return comments;
				case Java_PackageImpl.IMPORTDECLARATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.IMPORTDECLARATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.IMPORTDECLARATION_STATIC:
					return static_;
				case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
					return importedElement;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.IMPORTDECLARATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.IMPORTDECLARATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.IMPORTDECLARATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.IMPORTDECLARATION_STATIC:
					static_ = (bool) newValue;
					return;
				case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
					importedElement = (NamedElement) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
