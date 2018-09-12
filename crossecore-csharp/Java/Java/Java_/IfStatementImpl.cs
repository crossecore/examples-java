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
	public class IfStatementImpl 
	: IfStatementBase
	{
		
		public static oclstdlib.Set<IfStatementImpl> allInstances_ = new oclstdlib.Set<IfStatementImpl>();
		
	    public static oclstdlib.Set<IfStatement> allInstances()
		{
	
			var result = new oclstdlib.Set<IfStatement>();
		    result.AddRange(IfStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
