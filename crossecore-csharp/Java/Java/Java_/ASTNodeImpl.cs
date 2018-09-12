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
	public class ASTNodeImpl 
	: ASTNodeBase
	{
		
		public static oclstdlib.Set<ASTNodeImpl> allInstances_ = new oclstdlib.Set<ASTNodeImpl>();
		
	    public static oclstdlib.Set<ASTNode> allInstances()
		{
	
			var result = new oclstdlib.Set<ASTNode>();
		    result.AddRange(ASTNodeImpl.allInstances_);
			result.AddRange(AbstractMethodInvocationImpl.allInstances_);
			result.AddRange(ArchiveImpl.allInstances_);
			result.AddRange(TypeParameterImpl.allInstances_);
			result.AddRange(ContinueStatementImpl.allInstances_);
			result.AddRange(EmptyStatementImpl.allInstances_);
			result.AddRange(ThrowStatementImpl.allInstances_);
			result.AddRange(InitializerImpl.allInstances_);
			result.AddRange(WhileStatementImpl.allInstances_);
			result.AddRange(NullLiteralImpl.allInstances_);
			result.AddRange(ConditionalExpressionImpl.allInstances_);
			result.AddRange(UnresolvedEnumDeclarationImpl.allInstances_);
			result.AddRange(ClassInstanceCreationImpl.allInstances_);
			result.AddRange(VariableDeclarationStatementImpl.allInstances_);
			result.AddRange(AbstractTypeQualifiedExpressionImpl.allInstances_);
			result.AddRange(ParameterizedTypeImpl.allInstances_);
			result.AddRange(CastExpressionImpl.allInstances_);
			result.AddRange(TypeDeclarationStatementImpl.allInstances_);
			result.AddRange(NamespaceAccessImpl.allInstances_);
			result.AddRange(WildCardTypeImpl.allInstances_);
			result.AddRange(AnnotationImpl.allInstances_);
			result.AddRange(NumberLiteralImpl.allInstances_);
			result.AddRange(VariableDeclarationImpl.allInstances_);
			result.AddRange(AbstractMethodDeclarationImpl.allInstances_);
			result.AddRange(BlockImpl.allInstances_);
			result.AddRange(CommentImpl.allInstances_);
			result.AddRange(ThisExpressionImpl.allInstances_);
			result.AddRange(StringLiteralImpl.allInstances_);
			result.AddRange(AssertStatementImpl.allInstances_);
			result.AddRange(MethodDeclarationImpl.allInstances_);
			result.AddRange(TypeImpl.allInstances_);
			result.AddRange(UnresolvedSingleVariableDeclarationImpl.allInstances_);
			result.AddRange(EnumDeclarationImpl.allInstances_);
			result.AddRange(ParenthesizedExpressionImpl.allInstances_);
			result.AddRange(PrimitiveTypeByteImpl.allInstances_);
			result.AddRange(BodyDeclarationImpl.allInstances_);
			result.AddRange(PrimitiveTypeDoubleImpl.allInstances_);
			result.AddRange(PrimitiveTypeIntImpl.allInstances_);
			result.AddRange(PrimitiveTypeImpl.allInstances_);
			result.AddRange(UnresolvedVariableDeclarationFragmentImpl.allInstances_);
			result.AddRange(TypeDeclarationImpl.allInstances_);
			result.AddRange(ModifierImpl.allInstances_);
			result.AddRange(SuperMethodInvocationImpl.allInstances_);
			result.AddRange(PrimitiveTypeBooleanImpl.allInstances_);
			result.AddRange(CompilationUnitImpl.allInstances_);
			result.AddRange(UnresolvedInterfaceDeclarationImpl.allInstances_);
			result.AddRange(LabeledStatementImpl.allInstances_);
			result.AddRange(PackageAccessImpl.allInstances_);
			result.AddRange(DoStatementImpl.allInstances_);
			result.AddRange(PrimitiveTypeFloatImpl.allInstances_);
			result.AddRange(PrefixExpressionImpl.allInstances_);
			result.AddRange(SwitchStatementImpl.allInstances_);
			result.AddRange(MethodRefParameterImpl.allInstances_);
			result.AddRange(ClassDeclarationImpl.allInstances_);
			result.AddRange(InfixExpressionImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationDeclarationImpl.allInstances_);
			result.AddRange(BreakStatementImpl.allInstances_);
			result.AddRange(LineCommentImpl.allInstances_);
			result.AddRange(InterfaceDeclarationImpl.allInstances_);
			result.AddRange(AnnotationTypeDeclarationImpl.allInstances_);
			result.AddRange(TypeAccessImpl.allInstances_);
			result.AddRange(UnresolvedLabeledStatementImpl.allInstances_);
			result.AddRange(AbstractTypeDeclarationImpl.allInstances_);
			result.AddRange(ExpressionStatementImpl.allInstances_);
			result.AddRange(PrimitiveTypeVoidImpl.allInstances_);
			result.AddRange(ConstructorInvocationImpl.allInstances_);
			result.AddRange(JavadocImpl.allInstances_);
			result.AddRange(ArrayCreationImpl.allInstances_);
			result.AddRange(UnresolvedTypeDeclarationImpl.allInstances_);
			result.AddRange(VariableDeclarationExpressionImpl.allInstances_);
			result.AddRange(StatementImpl.allInstances_);
			result.AddRange(TagElementImpl.allInstances_);
			result.AddRange(PackageImpl.allInstances_);
			result.AddRange(ReturnStatementImpl.allInstances_);
			result.AddRange(ImportDeclarationImpl.allInstances_);
			result.AddRange(VariableDeclarationFragmentImpl.allInstances_);
			result.AddRange(IfStatementImpl.allInstances_);
			result.AddRange(ConstructorDeclarationImpl.allInstances_);
			result.AddRange(EnhancedForStatementImpl.allInstances_);
			result.AddRange(TryStatementImpl.allInstances_);
			result.AddRange(CharacterLiteralImpl.allInstances_);
			result.AddRange(TextElementImpl.allInstances_);
			result.AddRange(AnonymousClassDeclarationImpl.allInstances_);
			result.AddRange(MemberRefImpl.allInstances_);
			result.AddRange(UnresolvedItemAccessImpl.allInstances_);
			result.AddRange(PostfixExpressionImpl.allInstances_);
			result.AddRange(BooleanLiteralImpl.allInstances_);
			result.AddRange(AnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(ArrayAccessImpl.allInstances_);
			result.AddRange(AssignmentImpl.allInstances_);
			result.AddRange(PrimitiveTypeShortImpl.allInstances_);
			result.AddRange(InstanceofExpressionImpl.allInstances_);
			result.AddRange(ArrayInitializerImpl.allInstances_);
			result.AddRange(FieldAccessImpl.allInstances_);
			result.AddRange(ForStatementImpl.allInstances_);
			result.AddRange(SuperFieldAccessImpl.allInstances_);
			result.AddRange(UnresolvedClassDeclarationImpl.allInstances_);
			result.AddRange(MethodInvocationImpl.allInstances_);
			result.AddRange(PrimitiveTypeCharImpl.allInstances_);
			result.AddRange(SynchronizedStatementImpl.allInstances_);
			result.AddRange(EnumConstantDeclarationImpl.allInstances_);
			result.AddRange(SuperConstructorInvocationImpl.allInstances_);
			result.AddRange(MethodRefImpl.allInstances_);
			result.AddRange(UnresolvedTypeImpl.allInstances_);
			result.AddRange(AbstractVariablesContainerImpl.allInstances_);
			result.AddRange(BlockCommentImpl.allInstances_);
			result.AddRange(AnnotationMemberValuePairImpl.allInstances_);
			result.AddRange(SingleVariableDeclarationImpl.allInstances_);
			result.AddRange(ArrayTypeImpl.allInstances_);
			result.AddRange(CatchClauseImpl.allInstances_);
			result.AddRange(UnresolvedAnnotationTypeMemberDeclarationImpl.allInstances_);
			result.AddRange(UnresolvedItemImpl.allInstances_);
			result.AddRange(PrimitiveTypeLongImpl.allInstances_);
			result.AddRange(FieldDeclarationImpl.allInstances_);
			result.AddRange(SingleVariableAccessImpl.allInstances_);
			result.AddRange(SwitchCaseImpl.allInstances_);
			result.AddRange(UnresolvedMethodDeclarationImpl.allInstances_);
			result.AddRange(ClassFileImpl.allInstances_);
			result.AddRange(TypeLiteralImpl.allInstances_);
			result.AddRange(ExpressionImpl.allInstances_);
			result.AddRange(NamedElementImpl.allInstances_);
			result.AddRange(ArrayLengthAccessImpl.allInstances_);
		
		    return result;
	    }
		
		//implement your generated class here	
	}
}
