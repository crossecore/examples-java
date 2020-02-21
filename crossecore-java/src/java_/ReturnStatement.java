package java_;
public interface ReturnStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<ReturnStatement> allInstances_ = new com.crossecore.ocl.QuickSet<ReturnStatement>(ReturnStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<ReturnStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<ReturnStatement> result = new com.crossecore.ocl.QuickSet<ReturnStatement>(ReturnStatement.class);
		result.addAll(ReturnStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ReturnStatement> allInstances = new com.crossecore.ocl.QuickSet<ReturnStatement>(ReturnStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
