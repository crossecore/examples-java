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
	public class MemberRefImpl 
	: MemberRefBase
	{
		
		public static oclstdlib.Set<MemberRefImpl> allInstances_ = new oclstdlib.Set<MemberRefImpl>();
		
	    public static oclstdlib.Set<MemberRef> allInstances()
		{
	
			var result = new oclstdlib.Set<MemberRef>();
		    result.AddRange(MemberRefImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
