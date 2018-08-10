package java_;
public interface Expression 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<Expression> allInstances_ = new Ocllib.QuickSet<Expression>(Expression.class);
	
		
	public static Ocllib.QuickSet<Expression> allInstances(){
		
		Ocllib.QuickSet<Expression> result = new Ocllib.QuickSet<Expression>(Expression.class);
		result.addAll(Expression.allInstances_);
		
		result.addAll(ArrayInitializer.allInstances_);
		result.addAll(ParenthesizedExpression.allInstances_);
		result.addAll(ThisExpression.allInstances_);
		result.addAll(FieldAccess.allInstances_);
		result.addAll(UnresolvedItemAccess.allInstances_);
		result.addAll(NullLiteral.allInstances_);
		result.addAll(PrefixExpression.allInstances_);
		result.addAll(TypeAccess.allInstances_);
		result.addAll(ConditionalExpression.allInstances_);
		result.addAll(StringLiteral.allInstances_);
		result.addAll(ArrayAccess.allInstances_);
		result.addAll(ArrayCreation.allInstances_);
		result.addAll(CastExpression.allInstances_);
		result.addAll(PostfixExpression.allInstances_);
		result.addAll(SuperFieldAccess.allInstances_);
		result.addAll(InstanceofExpression.allInstances_);
		result.addAll(TypeLiteral.allInstances_);
		result.addAll(AbstractTypeQualifiedExpression.allInstances_);
		result.addAll(Assignment.allInstances_);
		result.addAll(ClassInstanceCreation.allInstances_);
		result.addAll(NumberLiteral.allInstances_);
		result.addAll(ArrayLengthAccess.allInstances_);
		result.addAll(VariableDeclarationExpression.allInstances_);
		result.addAll(CharacterLiteral.allInstances_);
		result.addAll(Annotation.allInstances_);
		result.addAll(InfixExpression.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		result.addAll(BooleanLiteral.allInstances_);
		result.addAll(MethodInvocation.allInstances_);
		result.addAll(SingleVariableAccess.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Expression> allInstances = new Ocllib.QuickSet<Expression>(Expression.class);
	
	
}
