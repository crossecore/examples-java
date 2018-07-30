package java_;
public interface InfixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<InfixExpression> allInstances = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
	
	/*
	public static Ocllib.QuickSet<InfixExpression> allInstances_ = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
	
	public static Ocllib.QuickSet<InfixExpression> allInstancesClosure = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
		
	public static Ocllib.QuickSet<InfixExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(InfixExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	InfixExpressionKind getOperator();
	void setOperator(InfixExpressionKind value);
	
	Expression getRightOperand();
	void setRightOperand(Expression value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	Ocllib.OrderedSet<Expression> getExtendedOperands();
	
}
