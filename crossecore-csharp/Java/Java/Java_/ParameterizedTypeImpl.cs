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
	public class ParameterizedTypeImpl 
	: ParameterizedTypeBase
	{
		
		public static oclstdlib.Set<ParameterizedTypeImpl> allInstances_ = new oclstdlib.Set<ParameterizedTypeImpl>();
		
	    public static oclstdlib.Set<ParameterizedType> allInstances()
		{
	
			var result = new oclstdlib.Set<ParameterizedType>();
		    result.AddRange(ParameterizedTypeImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
