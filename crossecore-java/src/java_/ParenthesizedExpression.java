package java_;
public interface ParenthesizedExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<ParenthesizedExpression> allInstances_ = new com.crossecore.ocl.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<ParenthesizedExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<ParenthesizedExpression> result = new com.crossecore.ocl.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
		result.addAll(ParenthesizedExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ParenthesizedExpression> allInstances = new com.crossecore.ocl.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
