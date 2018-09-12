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
	public class TypeDeclarationStatementImpl 
	: TypeDeclarationStatementBase
	{
		
		public static oclstdlib.Set<TypeDeclarationStatementImpl> allInstances_ = new oclstdlib.Set<TypeDeclarationStatementImpl>();
		
	    public static oclstdlib.Set<TypeDeclarationStatement> allInstances()
		{
	
			var result = new oclstdlib.Set<TypeDeclarationStatement>();
		    result.AddRange(TypeDeclarationStatementImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
