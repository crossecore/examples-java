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
	public class UnresolvedSingleVariableDeclarationImpl 
	: UnresolvedSingleVariableDeclarationBase
	{
		
		public static oclstdlib.Set<UnresolvedSingleVariableDeclarationImpl> allInstances_ = new oclstdlib.Set<UnresolvedSingleVariableDeclarationImpl>();
		
	    public static oclstdlib.Set<UnresolvedSingleVariableDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<UnresolvedSingleVariableDeclaration>();
		    result.AddRange(UnresolvedSingleVariableDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
