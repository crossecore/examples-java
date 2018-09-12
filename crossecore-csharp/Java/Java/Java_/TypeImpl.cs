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
	public class TypeImpl 
	: TypeBase
	{
		
		public static oclstdlib.Set<TypeImpl> allInstances_ = new oclstdlib.Set<TypeImpl>();
		
	    public static oclstdlib.Set<Type> allInstances()
		{
	
			var result = new oclstdlib.Set<Type>();
		    result.AddRange(TypeImpl.allInstances_);
			result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(TypeParameterImpl.allInstances_);
			result.AddRange(PrimitiveTypeBooleanImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeCharImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
			result.AddRange(ParameterizedTypeImpl.allInstances_);
			result.AddRange(PrimitiveTypeFloatImpl.allInstances_);
			result.AddRange(UnresolvedTypeImpl.allInstances_);
			result.AddRange(WildCardTypeImpl.allInstances_);
			result.AddRange(ArrayTypeImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeLongImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeDeclarationImpl.allInstances_);
			result.AddRange(AbstractTypeDeclarationImpl.allInstances_);
			result.AddRange(EnumDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeByteImpl.allInstances_);
			result.AddRange(PrimitiveTypeVoidImpl.allInstances_);
			result.AddRange(PrimitiveTypeDoubleImpl.allInstances_);
			result.AddRange(PrimitiveTypeIntImpl.allInstances_);
			result.AddRange(PrimitiveTypeShortImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
