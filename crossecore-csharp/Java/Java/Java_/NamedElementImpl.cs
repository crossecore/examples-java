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
	public class NamedElementImpl 
	: NamedElementBase
	{
		
		public static oclstdlib.Set<NamedElementImpl> allInstances_ = new oclstdlib.Set<NamedElementImpl>();
		
	    public static oclstdlib.Set<NamedElement> allInstances()
		{
	
			var result = new oclstdlib.Set<NamedElement>();
		    result.AddRange(NamedElementImpl.allInstances_);
			result.AddRange(ArchiveImpl.allInstances_);
			result.AddRange(TypeParameterImpl.allInstances_);
			result.AddRange(InitializerImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
			result.AddRange(ParameterizedTypeImpl.allInstances_);
			result.AddRange(PackageImpl.allInstances_);
			result.AddRange(WildCardTypeImpl.allInstances_);
			result.AddRange(VariableDeclarationFragmentImpl.allInstances_);
			result.AddRange(ConstructorDeclarationImpl.allInstances_);
			result.AddRange(VariableDeclarationImpl.allInstances_);
			result.AddRange(AbstractMethodDeclarationImpl.allInstances_);
			result.AddRange(MethodDeclarationImpl.allInstances_);
			result.AddRange(TypeImpl.allInstances_);
			result.AddRange(UnresolvedSingleVariableDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(EnumDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeByteImpl.allInstances_);
			result.AddRange(BodyDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeDoubleImpl.allInstances_);
			result.AddRange(PrimitiveTypeIntImpl.allInstances_);
			result.AddRange(PrimitiveTypeShortImpl.allInstances_);
			result.AddRange(PrimitiveTypeImpl.allInstances_);
			result.AddRange(UnresolvedVariableDeclarationFragmentImpl.allInstances_);
			result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeBooleanImpl.allInstances_);
			result.AddRange(CompilationUnitImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(LabeledStatementImpl.allInstances_);
			result.AddRange(PrimitiveTypeCharImpl.allInstances_);
			result.AddRange(EnumConstantDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeFloatImpl.allInstances_);
			result.AddRange(UnresolvedTypeImpl.allInstances_);
			result.AddRange(AnnotationMemberValuePairImpl.allInstances_);
			result.AddRange(SingleVariableDeclarationImpl.allInstances_);
			result.AddRange(ArrayTypeImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedItemImpl.allInstances_);
			result.AddRange(PrimitiveTypeLongImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(FieldDeclarationImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedMethodDeclarationImpl.allInstances_);
			result.AddRange(ClassFileImpl.allInstances_);
			result.AddRange(UnresolvedLabeledStatementImpl.allInstances_);
			result.AddRange(AbstractTypeDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeVoidImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
