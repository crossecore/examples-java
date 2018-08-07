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
	public class ArrayCreationBase 
	:ExpressionImpl, ArrayCreation
	{
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
						msgs = ((InternalEObject)_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYCREATION_TYPE, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYCREATION_TYPE, null, msgs);
					}
					msgs = basicSetType(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAYCREATION_TYPE , value, value));
				}
				}
		}
		private OrderedSet<Expression> _dimensions;
		
		public virtual OrderedSet<Expression> dimensions
		{
			get {
				if(_dimensions==null){
					_dimensions = new OrderedSet<Expression>(this, Java_PackageImpl.ARRAYCREATION_DIMENSIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYCREATION_DIMENSIONS);
				}
				return _dimensions;
			}
		
		}
		private ArrayInitializer _initializer;
		public virtual ArrayInitializer initializer
		{
			get {
			
				return _initializer;
			}
			set {
				if (value != _initializer) {
					NotificationChain msgs = null;
					if (_initializer != null){
						msgs = ((InternalEObject)_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYCREATION_INITIALIZER, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYCREATION_INITIALIZER, null, msgs);
					}
					msgs = basicSetInitializer(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ARRAYCREATION_INITIALIZER , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.ARRAYCREATION;
		}
		
		
		public NotificationChain basicSetType(TypeAccess newobj, NotificationChain msgs) {
			var oldobj = _type;
			_type = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAYCREATION_TYPE, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetInitializer(ArrayInitializer newobj, NotificationChain msgs) {
			var oldobj = _initializer;
			_initializer = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.ARRAYCREATION_INITIALIZER, oldobj, newobj);
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
				case Java_PackageImpl.ARRAYCREATION_COMMENTS:
					return comments;
				case Java_PackageImpl.ARRAYCREATION_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.ARRAYCREATION_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.ARRAYCREATION_DIMENSIONS:
					return dimensions;
				case Java_PackageImpl.ARRAYCREATION_INITIALIZER:
					return initializer;
				case Java_PackageImpl.ARRAYCREATION_TYPE:
					return type;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.ARRAYCREATION_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.ARRAYCREATION_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.ARRAYCREATION_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.ARRAYCREATION_DIMENSIONS:
					dimensions.Clear();
					dimensions.AddRange(((List<EObject>)newValue)?.Cast<Expression>());
					return;
				case Java_PackageImpl.ARRAYCREATION_INITIALIZER:
					initializer = (ArrayInitializer) newValue;
					return;
				case Java_PackageImpl.ARRAYCREATION_TYPE:
					type = (TypeAccess) newValue;
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
