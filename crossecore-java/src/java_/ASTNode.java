package java_;
public interface ASTNode 
extends org.eclipse.emf.ecore.EObject
{
	
	public static com.crossecore.ocl.QuickSet<ASTNode> allInstances_ = new com.crossecore.ocl.QuickSet<ASTNode>(ASTNode.class);
	
		
	public static com.crossecore.ocl.QuickSet<ASTNode> allInstances(){
		
		com.crossecore.ocl.QuickSet<ASTNode> result = new com.crossecore.ocl.QuickSet<ASTNode>(ASTNode.class);
		result.addAll(ASTNode.allInstances_);
		
		result.addAll(ClassFile.allInstances_);
		result.addAll(VariableDeclarationFragment.allInstances_);
		result.addAll(MemberRef.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(ParameterizedType.allInstances_);
		result.addAll(SingleVariableAccess.allInstances_);
		result.addAll(Javadoc.allInstances_);
		result.addAll(PrimitiveTypeChar.allInstances_);
		result.addAll(Initializer.allInstances_);
		result.addAll(Statement.allInstances_);
		result.addAll(ArrayCreation.allInstances_);
		result.addAll(SuperFieldAccess.allInstances_);
		result.addAll(VariableDeclaration.allInstances_);
		result.addAll(ForStatement.allInstances_);
		result.addAll(WildCardType.allInstances_);
		result.addAll(AnonymousClassDeclaration.allInstances_);
		result.addAll(Comment.allInstances_);
		result.addAll(CharacterLiteral.allInstances_);
		result.addAll(ReturnStatement.allInstances_);
		result.addAll(AssertStatement.allInstances_);
		result.addAll(Annotation.allInstances_);
		result.addAll(FieldAccess.allInstances_);
		result.addAll(SingleVariableDeclaration.allInstances_);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		result.addAll(Expression.allInstances_);
		result.addAll(UnresolvedAnnotationDeclaration.allInstances_);
		result.addAll(ClassInstanceCreation.allInstances_);
		result.addAll(BreakStatement.allInstances_);
		result.addAll(EnumDeclaration.allInstances_);
		result.addAll(BooleanLiteral.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		result.addAll(TagElement.allInstances_);
		result.addAll(PrimitiveTypeByte.allInstances_);
		result.addAll(ThisExpression.allInstances_);
		result.addAll(UnresolvedItem.allInstances_);
		result.addAll(TypeAccess.allInstances_);
		result.addAll(ArrayAccess.allInstances_);
		result.addAll(Archive.allInstances_);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		result.addAll(SynchronizedStatement.allInstances_);
		result.addAll(AbstractTypeQualifiedExpression.allInstances_);
		result.addAll(Block.allInstances_);
		result.addAll(SuperConstructorInvocation.allInstances_);
		result.addAll(TryStatement.allInstances_);
		result.addAll(SwitchStatement.allInstances_);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		result.addAll(PrimitiveTypeInt.allInstances_);
		result.addAll(PrimitiveType.allInstances_);
		result.addAll(Assignment.allInstances_);
		result.addAll(PackageAccess.allInstances_);
		result.addAll(FieldDeclaration.allInstances_);
		result.addAll(PrefixExpression.allInstances_);
		result.addAll(BlockComment.allInstances_);
		result.addAll(ArrayInitializer.allInstances_);
		result.addAll(VariableDeclarationStatement.allInstances_);
		result.addAll(MethodDeclaration.allInstances_);
		result.addAll(MethodRefParameter.allInstances_);
		result.addAll(TypeLiteral.allInstances_);
		result.addAll(LineComment.allInstances_);
		result.addAll(PostfixExpression.allInstances_);
		result.addAll(CompilationUnit.allInstances_);
		result.addAll(AbstractVariablesContainer.allInstances_);
		result.addAll(LabeledStatement.allInstances_);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		result.addAll(NamespaceAccess.allInstances_);
		result.addAll(StringLiteral.allInstances_);
		result.addAll(TypeParameter.allInstances_);
		result.addAll(Package.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		result.addAll(CatchClause.allInstances_);
		result.addAll(NullLiteral.allInstances_);
		result.addAll(InstanceofExpression.allInstances_);
		result.addAll(MethodInvocation.allInstances_);
		result.addAll(VariableDeclarationExpression.allInstances_);
		result.addAll(ImportDeclaration.allInstances_);
		result.addAll(UnresolvedType.allInstances_);
		result.addAll(ConditionalExpression.allInstances_);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		result.addAll(SwitchCase.allInstances_);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		result.addAll(Type.allInstances_);
		result.addAll(EnumConstantDeclaration.allInstances_);
		result.addAll(ArrayType.allInstances_);
		result.addAll(TypeDeclaration.allInstances_);
		result.addAll(ConstructorInvocation.allInstances_);
		result.addAll(EnhancedForStatement.allInstances_);
		result.addAll(ThrowStatement.allInstances_);
		result.addAll(ParenthesizedExpression.allInstances_);
		result.addAll(ContinueStatement.allInstances_);
		result.addAll(NumberLiteral.allInstances_);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(PrimitiveTypeShort.allInstances_);
		result.addAll(NamedElement.allInstances_);
		result.addAll(TextElement.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(MethodRef.allInstances_);
		result.addAll(UnresolvedAnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		result.addAll(AnnotationMemberValuePair.allInstances_);
		result.addAll(ExpressionStatement.allInstances_);
		result.addAll(CastExpression.allInstances_);
		result.addAll(ConstructorDeclaration.allInstances_);
		result.addAll(AnnotationTypeDeclaration.allInstances_);
		result.addAll(EmptyStatement.allInstances_);
		result.addAll(IfStatement.allInstances_);
		result.addAll(ArrayLengthAccess.allInstances_);
		result.addAll(TypeDeclarationStatement.allInstances_);
		result.addAll(Modifier.allInstances_);
		result.addAll(UnresolvedItemAccess.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(AbstractMethodInvocation.allInstances_);
		result.addAll(AbstractTypeDeclaration.allInstances_);
		result.addAll(InfixExpression.allInstances_);
		result.addAll(WhileStatement.allInstances_);
		result.addAll(AnnotationTypeMemberDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(PrimitiveTypeLong.allInstances_);
		result.addAll(BodyDeclaration.allInstances_);
		result.addAll(AbstractMethodDeclaration.allInstances_);
		result.addAll(DoStatement.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ASTNode> allInstances = new com.crossecore.ocl.QuickSet<ASTNode>(ASTNode.class);
	
	com.crossecore.ocl.OrderedSet<Comment> getComments();
	
	CompilationUnit getOriginalCompilationUnit();
	void setOriginalCompilationUnit(CompilationUnit value);
	
	ClassFile getOriginalClassFile();
	void setOriginalClassFile(ClassFile value);
	
}
