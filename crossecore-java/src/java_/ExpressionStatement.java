package java_;
public interface ExpressionStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<ExpressionStatement> allInstances_ = new com.crossecore.ocl.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<ExpressionStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<ExpressionStatement> result = new com.crossecore.ocl.QuickSet<ExpressionStatement>(ExpressionStatement.class);
		result.addAll(ExpressionStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ExpressionStatement> allInstances = new com.crossecore.ocl.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
