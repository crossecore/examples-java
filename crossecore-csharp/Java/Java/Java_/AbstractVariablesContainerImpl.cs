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
	public class AbstractVariablesContainerImpl 
	: AbstractVariablesContainerBase
	{
		
		public static oclstdlib.Set<AbstractVariablesContainerImpl> allInstances_ = new oclstdlib.Set<AbstractVariablesContainerImpl>();
		
	    public static oclstdlib.Set<AbstractVariablesContainer> allInstances()
		{
	
			var result = new oclstdlib.Set<AbstractVariablesContainer>();
		    result.AddRange(AbstractVariablesContainerImpl.allInstances_);
			result.AddRange(VariableDeclarationStatementImpl.allInstances_);
			result.AddRange(FieldDeclarationImpl.allInstances_);
			result.AddRange(VariableDeclarationExpressionImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
