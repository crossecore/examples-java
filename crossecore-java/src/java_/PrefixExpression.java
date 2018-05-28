package java_;
public interface PrefixExpression 
 extends Expression
{
	
	public static Ocllib.Set<PrefixExpression> allInstances = new Ocllib.Set<PrefixExpression>(PrefixExpression.class);
	
	PrefixExpressionKind getOperator();
	void setOperator(PrefixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
