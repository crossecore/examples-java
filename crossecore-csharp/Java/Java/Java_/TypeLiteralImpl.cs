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
	public class TypeLiteralImpl 
	: TypeLiteralBase
	{
		
		public static oclstdlib.Set<TypeLiteralImpl> allInstances_ = new oclstdlib.Set<TypeLiteralImpl>();
		
	    public static oclstdlib.Set<TypeLiteral> allInstances()
		{
	
			var result = new oclstdlib.Set<TypeLiteral>();
		    result.AddRange(TypeLiteralImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
