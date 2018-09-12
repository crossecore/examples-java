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
	public class LabeledStatementImpl 
	: LabeledStatementBase
	{
		
		public static oclstdlib.Set<LabeledStatementImpl> allInstances_ = new oclstdlib.Set<LabeledStatementImpl>();
		
	    public static oclstdlib.Set<LabeledStatement> allInstances()
		{
	
			var result = new oclstdlib.Set<LabeledStatement>();
		    result.AddRange(LabeledStatementImpl.allInstances_);
			result.AddRange(UnresolvedLabeledStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
