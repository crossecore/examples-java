package java_;
public interface PrefixExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<PrefixExpression> allInstances_ = new com.crossecore.ocl.QuickSet<PrefixExpression>(PrefixExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrefixExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrefixExpression> result = new com.crossecore.ocl.QuickSet<PrefixExpression>(PrefixExpression.class);
		result.addAll(PrefixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrefixExpression> allInstances = new com.crossecore.ocl.QuickSet<PrefixExpression>(PrefixExpression.class);
	
	PrefixExpressionKind getOperator();
	void setOperator(PrefixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
