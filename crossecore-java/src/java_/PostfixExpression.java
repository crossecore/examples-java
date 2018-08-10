package java_;
public interface PostfixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<PostfixExpression> allInstances_ = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
	
		
	public static Ocllib.QuickSet<PostfixExpression> allInstances(){
		
		Ocllib.QuickSet<PostfixExpression> result = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
		result.addAll(PostfixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PostfixExpression> allInstances = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
	
	PostfixExpressionKind getOperator();
	void setOperator(PostfixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
