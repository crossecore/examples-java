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
	public class AbstractVariablesContainerBase 
	:ASTNodeImpl, AbstractVariablesContainer
	{
		private OrderedSet<VariableDeclarationFragment> _fragments;
		
		public virtual OrderedSet<VariableDeclarationFragment> fragments
		{
			get {
				if(_fragments==null){
					_fragments = new OrderedSet<VariableDeclarationFragment>(this, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS, Java_PackageImpl.VARIABLEDECLARATIONFRAGMENT_VARIABLESCONTAINER);
				}
				return _fragments;
			}
		
		}
		private TypeAccess _type;
		public virtual TypeAccess type
		{
			get {
			
				return _type;
			}
			set {
				if (value != _type) {
					NotificationChain msgs = null;
					if (_type != null){
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ABSTRACTVARIABLESCONTAINER;
		}
		
		public override NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
					return fragments.basicAdd((VariableDeclarationFragment)otherEnd, msgs);
			}
			return base.eInverseAdd(otherEnd, featureID, msgs);
		}
		
		public override NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
					return fragments.basicRemove((VariableDeclarationFragment)otherEnd, msgs);
			}
			return base.eInverseRemove(otherEnd, featureID, msgs);
		}
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE, oldobj, newobj);
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
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_COMMENTS:
					return comments;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE:
					return type;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
					return fragments;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_TYPE:
					type = (TypeAccess) newValue;
					return;
				case Java_PackageImpl.ABSTRACTVARIABLESCONTAINER_FRAGMENTS:
					fragments.Clear();
					fragments.AddRange(((List<EObject>)newValue)?.Cast<VariableDeclarationFragment>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
