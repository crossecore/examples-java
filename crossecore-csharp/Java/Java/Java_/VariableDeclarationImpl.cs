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
	public class VariableDeclarationImpl 
	: VariableDeclarationBase
	{
		
		public static oclstdlib.Set<VariableDeclarationImpl> allInstances_ = new oclstdlib.Set<VariableDeclarationImpl>();
		
	    public static oclstdlib.Set<VariableDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<VariableDeclaration>();
		    result.AddRange(VariableDeclarationImpl.allInstances_);
			result.AddRange(EnumConstantDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedSingleVariableDeclarationImpl.allInstances_);
			result.AddRange(SingleVariableDeclarationImpl.allInstances_);
			result.AddRange(VariableDeclarationFragmentImpl.allInstances_);
			result.AddRange(UnresolvedVariableDeclarationFragmentImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
