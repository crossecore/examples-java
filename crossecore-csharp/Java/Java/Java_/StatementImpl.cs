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
	public class StatementImpl 
	: StatementBase
	{
		
		public static oclstdlib.Set<StatementImpl> allInstances_ = new oclstdlib.Set<StatementImpl>();
		
	    public static oclstdlib.Set<Statement> allInstances()
		{
	
			var result = new oclstdlib.Set<Statement>();
		    result.AddRange(StatementImpl.allInstances_);
			result.AddRange(CatchClauseImpl.allInstances_);
			result.AddRange(EnhancedForStatementImpl.allInstances_);
			result.AddRange(TryStatementImpl.allInstances_);
			result.AddRange(ContinueStatementImpl.allInstances_);
			result.AddRange(ForStatementImpl.allInstances_);
			result.AddRange(EmptyStatementImpl.allInstances_);
			result.AddRange(ThrowStatementImpl.allInstances_);
			result.AddRange(BreakStatementImpl.allInstances_);
			result.AddRange(SwitchCaseImpl.allInstances_);
			result.AddRange(BlockImpl.allInstances_);
			result.AddRange(LabeledStatementImpl.allInstances_);
			result.AddRange(WhileStatementImpl.allInstances_);
			result.AddRange(SynchronizedStatementImpl.allInstances_);
			result.AddRange(AssertStatementImpl.allInstances_);
			result.AddRange(VariableDeclarationStatementImpl.allInstances_);
			result.AddRange(DoStatementImpl.allInstances_);
			result.AddRange(ReturnStatementImpl.allInstances_);
			result.AddRange(UnresolvedLabeledStatementImpl.allInstances_);
			result.AddRange(SuperConstructorInvocationImpl.allInstances_);
			result.AddRange(ExpressionStatementImpl.allInstances_);
			result.AddRange(ConstructorInvocationImpl.allInstances_);
			result.AddRange(TypeDeclarationStatementImpl.allInstances_);
			result.AddRange(SwitchStatementImpl.allInstances_);
			result.AddRange(IfStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
