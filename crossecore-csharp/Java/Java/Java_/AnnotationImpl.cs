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
	public class AnnotationImpl 
	: AnnotationBase
	{
		
		public static oclstdlib.Set<AnnotationImpl> allInstances_ = new oclstdlib.Set<AnnotationImpl>();
		
	    public static oclstdlib.Set<Annotation> allInstances()
		{
	
			var result = new oclstdlib.Set<Annotation>();
		    result.AddRange(AnnotationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
