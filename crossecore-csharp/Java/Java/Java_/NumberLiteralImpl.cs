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
	public class NumberLiteralImpl 
	: NumberLiteralBase
	{
		
		public static oclstdlib.Set<NumberLiteralImpl> allInstances_ = new oclstdlib.Set<NumberLiteralImpl>();
		
	    public static oclstdlib.Set<NumberLiteral> allInstances()
		{
	
			var result = new oclstdlib.Set<NumberLiteral>();
		    result.AddRange(NumberLiteralImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
