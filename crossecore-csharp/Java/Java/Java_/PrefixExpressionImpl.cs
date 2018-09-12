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
	public class PrefixExpressionImpl 
	: PrefixExpressionBase
	{
		
		public static oclstdlib.Set<PrefixExpressionImpl> allInstances_ = new oclstdlib.Set<PrefixExpressionImpl>();
		
	    public static oclstdlib.Set<PrefixExpression> allInstances()
		{
	
			var result = new oclstdlib.Set<PrefixExpression>();
		    result.AddRange(PrefixExpressionImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
