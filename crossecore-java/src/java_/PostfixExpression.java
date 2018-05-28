package java_;
public interface PostfixExpression 
 extends Expression
{
	
	public static Ocllib.Set<PostfixExpression> allInstances = new Ocllib.Set<PostfixExpression>(PostfixExpression.class);
	
	PostfixExpressionKind getOperator();
	void setOperator(PostfixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
