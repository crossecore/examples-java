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
	public class BlockBase 
	:StatementImpl, Block
	{
		private OrderedSet<Statement> _statements;
		
		public virtual OrderedSet<Statement> statements
		{
			get {
				if(_statements==null){
					_statements = new OrderedSet<Statement>(this, Java_PackageImpl.BLOCK_STATEMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.BLOCK_STATEMENTS);
				}
				return _statements;
			}
		
		}
		
		protected override EClass eStaticClass() {
			return Java_PackageImpl.Literals.BLOCK;
		}
		
		
		
		public override object eGet(int featureID, bool resolve, bool coreType) {
			switch (featureID) {
				case Java_PackageImpl.BLOCK_STATEMENTS:
					return statements;
			}
			return base.eGet(featureID, resolve, coreType);
		}
		
		
		public override void eSet(int featureID, object newValue) {
			switch (featureID) {
				case Java_PackageImpl.BLOCK_STATEMENTS:
					statements.Clear();
					statements.AddRange(((List<EObject>)newValue)?.Cast<Statement>());
					return;
			}
			base.eSet(featureID, newValue);
		}
		
		/*
		public override bool eIsSet(int featureID) {
			switch (featureID) {
				case Java_PackageImpl.BLOCK_STATEMENTS:
					return _statements != null && !_statements.isEmpty();
			}
			return base.eIsSet(featureID);
		}
		*/
		
		
		
	}
}
