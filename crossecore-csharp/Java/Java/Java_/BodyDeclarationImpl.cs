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
	public class BodyDeclarationImpl 
	: BodyDeclarationBase
	{
		
		public static oclstdlib.Set<BodyDeclarationImpl> allInstances_ = new oclstdlib.Set<BodyDeclarationImpl>();
		
	    public static oclstdlib.Set<BodyDeclaration> allInstances()
		{
	
			var result = new oclstdlib.Set<BodyDeclaration>();
		    result.AddRange(BodyDeclarationImpl.allInstances_);
			result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(ConstructorDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(FieldDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(AbstractMethodDeclarationImpl.allInstances_);
			result.AddRange(InitializerImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
			result.AddRange(EnumConstantDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeDeclarationImpl.allInstances_);
			result.AddRange(MethodDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedMethodDeclarationImpl.allInstances_);
			result.AddRange(AbstractTypeDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(EnumDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
