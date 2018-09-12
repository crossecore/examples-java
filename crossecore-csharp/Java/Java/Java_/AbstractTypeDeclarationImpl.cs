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
	public class AbstractTypeDeclarationImpl 
	: AbstractTypeDeclarationBase
	{
		
		public static oclstdlib.Set<AbstractTypeDeclarationImpl> allInstances_ = new oclstdlib.Set<AbstractTypeDeclarationImpl>();
		
	    public static oclstdlib.Set<AbstractTypeDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<AbstractTypeDeclaration>();
		    result.AddRange(AbstractTypeDeclarationImpl.allInstances_);
			result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeDeclarationImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(EnumDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
