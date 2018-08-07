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
	public class TryStatementBase 
	:StatementImpl, TryStatement
	{
		private Block _body;
		public virtual Block body
		{
			get {
			
				return _body;
			}
			set {
				if (value != _body) {
					NotificationChain msgs = null;
					if (_body != null){
						msgs = ((InternalEObject)_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_BODY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_BODY, null, msgs);
					}
					msgs = basicSetBody(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRYSTATEMENT_BODY , value, value));
				}
				}
		}
		private OrderedSet<CatchClause> _catchClauses;
		
		public virtual OrderedSet<CatchClause> catchClauses
		{
			get {
				if(_catchClauses==null){
					_catchClauses = new OrderedSet<CatchClause>(this, Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES);
				}
				return _catchClauses;
			}
		
		}
		private Block _finally;
		public virtual Block finally_
		{
			get {
			
				return _finally;
			}
			set {
				if (value != _finally) {
					NotificationChain msgs = null;
					if (_finally != null){
						msgs = ((InternalEObject)_finally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_FINALLY, null, msgs);
					}
					if (value != null){
						msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TRYSTATEMENT_FINALLY, null, msgs);
					}
					msgs = basicSetFinally(value, msgs);
					if (msgs != null) {
						msgs.dispatch();
					}
				}
				else if (eNotificationRequired()){
					eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TRYSTATEMENT_FINALLY , value, value));
				}
				}
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.TRYSTATEMENT;
		}
		
		
		public NotificationChain basicSetBody(Block newobj, NotificationChain msgs) {
			var oldobj = _body;
			_body = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRYSTATEMENT_BODY, oldobj, newobj);
				if (msgs == null){
					msgs = notification;
				}
				else{
					msgs.add(notification);
				}
			}
			return msgs;
		}
		public NotificationChain basicSetFinally(Block newobj, NotificationChain msgs) {
			var oldobj = _finally;
			_finally = newobj;
			if (eNotificationRequired()) {
				var notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TRYSTATEMENT_FINALLY, oldobj, newobj);
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
				case Java_PackageImpl.TRYSTATEMENT_COMMENTS:
					return comments;
				case Java_PackageImpl.TRYSTATEMENT_ORIGINALCOMPILATIONUNIT:
					return originalCompilationUnit;
				case Java_PackageImpl.TRYSTATEMENT_ORIGINALCLASSFILE:
					return originalClassFile;
				case Java_PackageImpl.TRYSTATEMENT_BODY:
					return body;
				case Java_PackageImpl.TRYSTATEMENT_FINALLY:
					return finally_;
				case Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES:
					return catchClauses;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.TRYSTATEMENT_COMMENTS:
					comments.Clear();
					comments.AddRange(((List<EObject>)newValue)?.Cast<Comment>());
					return;
				case Java_PackageImpl.TRYSTATEMENT_ORIGINALCOMPILATIONUNIT:
					originalCompilationUnit = (CompilationUnit) newValue;
					return;
				case Java_PackageImpl.TRYSTATEMENT_ORIGINALCLASSFILE:
					originalClassFile = (ClassFile) newValue;
					return;
				case Java_PackageImpl.TRYSTATEMENT_BODY:
					body = (Block) newValue;
					return;
				case Java_PackageImpl.TRYSTATEMENT_FINALLY:
					finally_ = (Block) newValue;
					return;
				case Java_PackageImpl.TRYSTATEMENT_CATCHCLAUSES:
					catchClauses.Clear();
					catchClauses.AddRange(((List<EObject>)newValue)?.Cast<CatchClause>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		
	}
}
