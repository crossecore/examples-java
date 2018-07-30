package java_;
public interface PostfixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<PostfixExpression> allInstances = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
	
	/*
	public static Ocllib.QuickSet<PostfixExpression> allInstances_ = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
	
	public static Ocllib.QuickSet<PostfixExpression> allInstancesClosure = new Ocllib.QuickSet<PostfixExpression>(PostfixExpression.class);
		
	public static Ocllib.QuickSet<PostfixExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(PostfixExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	PostfixExpressionKind getOperator();
	void setOperator(PostfixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
