package java_;
public interface InfixExpression 
 extends Expression
{
	
	public static Ocllib.Set<InfixExpression> allInstances = new Ocllib.Set<InfixExpression>(InfixExpression.class);
	
	InfixExpressionKind getOperator();
	void setOperator(InfixExpressionKind value);
	
	Expression getRightOperand();
	void setRightOperand(Expression value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	Ocllib.OrderedSet<Expression> getExtendedOperands();
	
}
