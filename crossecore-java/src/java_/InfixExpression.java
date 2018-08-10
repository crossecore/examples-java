package java_;
public interface InfixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<InfixExpression> allInstances_ = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
	
		
	public static Ocllib.QuickSet<InfixExpression> allInstances(){
		
		Ocllib.QuickSet<InfixExpression> result = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
		result.addAll(InfixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<InfixExpression> allInstances = new Ocllib.QuickSet<InfixExpression>(InfixExpression.class);
	
	InfixExpressionKind getOperator();
	void setOperator(InfixExpressionKind value);
	
	Expression getRightOperand();
	void setRightOperand(Expression value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	Ocllib.OrderedSet<Expression> getExtendedOperands();
	
}
