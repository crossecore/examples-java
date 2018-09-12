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
	public class PrimitiveTypeImpl 
	: PrimitiveTypeBase
	{
		
		public static oclstdlib.Set<PrimitiveTypeImpl> allInstances_ = new oclstdlib.Set<PrimitiveTypeImpl>();
		
	    public static oclstdlib.Set<PrimitiveType> allInstances()
		{
	
			var result = new oclstdlib.Set<PrimitiveType>();
		    result.AddRange(PrimitiveTypeImpl.allInstances_);
			result.AddRange(PrimitiveTypeBooleanImpl.allInstances_);
			result.AddRange(PrimitiveTypeLongImpl.allInstances_);
			result.AddRange(PrimitiveTypeByteImpl.allInstances_);
			result.AddRange(PrimitiveTypeVoidImpl.allInstances_);
			result.AddRange(PrimitiveTypeDoubleImpl.allInstances_);
			result.AddRange(PrimitiveTypeFloatImpl.allInstances_);
			result.AddRange(PrimitiveTypeIntImpl.allInstances_);
			result.AddRange(PrimitiveTypeCharImpl.allInstances_);
			result.AddRange(PrimitiveTypeShortImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
