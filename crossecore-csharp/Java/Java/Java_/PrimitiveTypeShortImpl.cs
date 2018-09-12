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
	public class PrimitiveTypeShortImpl 
	: PrimitiveTypeShortBase
	{
		
		public static oclstdlib.Set<PrimitiveTypeShortImpl> allInstances_ = new oclstdlib.Set<PrimitiveTypeShortImpl>();
		
	    public static oclstdlib.Set<PrimitiveTypeShort> allInstances()
		{
	
			var result = new oclstdlib.Set<PrimitiveTypeShort>();
		    result.AddRange(PrimitiveTypeShortImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
