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
	public class DoStatementImpl 
	: DoStatementBase
	{
		
		public static oclstdlib.Set<DoStatementImpl> allInstances_ = new oclstdlib.Set<DoStatementImpl>();
		
	    public static oclstdlib.Set<DoStatement> allInstances()
		{
	
			var result = new oclstdlib.Set<DoStatement>();
		    result.AddRange(DoStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
