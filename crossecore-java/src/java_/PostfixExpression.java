package java_;
public interface PostfixExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<PostfixExpression> allInstances_ = new com.crossecore.ocl.QuickSet<PostfixExpression>(PostfixExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<PostfixExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<PostfixExpression> result = new com.crossecore.ocl.QuickSet<PostfixExpression>(PostfixExpression.class);
		result.addAll(PostfixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PostfixExpression> allInstances = new com.crossecore.ocl.QuickSet<PostfixExpression>(PostfixExpression.class);
	
	PostfixExpressionKind getOperator();
	void setOperator(PostfixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
