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
	public class AbstractMethodInvocationImpl 
	: AbstractMethodInvocationBase
	{
		
		public static oclstdlib.Set<AbstractMethodInvocationImpl> allInstances_ = new oclstdlib.Set<AbstractMethodInvocationImpl>();
		
	    public static oclstdlib.Set<AbstractMethodInvocation> allInstances()
		{
	
			var result = new oclstdlib.Set<AbstractMethodInvocation>();
		    result.AddRange(AbstractMethodInvocationImpl.allInstances_);
			result.AddRange(ClassInstanceCreationImpl.allInstances_);
			result.AddRange(SuperMethodInvocationImpl.allInstances_);
			result.AddRange(SuperConstructorInvocationImpl.allInstances_);
			result.AddRange(ConstructorInvocationImpl.allInstances_);
			result.AddRange(MethodInvocationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
