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
	public class ForStatementImpl 
	: ForStatementBase
	{
		
		public static oclstdlib.Set<ForStatementImpl> allInstances_ = new oclstdlib.Set<ForStatementImpl>();
		
	    public static oclstdlib.Set<ForStatement> allInstances()
		{
	
			var result = new oclstdlib.Set<ForStatement>();
		    result.AddRange(ForStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
