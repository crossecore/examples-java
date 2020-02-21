package java_;
public interface ConditionalExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ConditionalExpression> allInstances_ = new com.crossecore.ocl.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<ConditionalExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<ConditionalExpression> result = new com.crossecore.ocl.QuickSet<ConditionalExpression>(ConditionalExpression.class);
		result.addAll(ConditionalExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ConditionalExpression> allInstances = new com.crossecore.ocl.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
	
	Expression getElseExpression();
	void setElseExpression(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Expression getThenExpression();
	void setThenExpression(Expression value);
	
}
