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
	public class TypeDeclarationImpl 
	: TypeDeclarationBase
	{
		
		public static oclstdlib.Set<TypeDeclarationImpl> allInstances_ = new oclstdlib.Set<TypeDeclarationImpl>();
		
	    public static oclstdlib.Set<TypeDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<TypeDeclaration>();
		    result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
