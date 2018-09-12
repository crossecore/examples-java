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
	public class AbstractMethodDeclarationImpl 
	: AbstractMethodDeclarationBase
	{
		
		public static oclstdlib.Set<AbstractMethodDeclarationImpl> allInstances_ = new oclstdlib.Set<AbstractMethodDeclarationImpl>();
		
	    public static oclstdlib.Set<AbstractMethodDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<AbstractMethodDeclaration>();
		    result.AddRange(AbstractMethodDeclarationImpl.allInstances_);
			result.AddRange(ConstructorDeclarationImpl.allInstances_);
			result.AddRange(MethodDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedMethodDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
