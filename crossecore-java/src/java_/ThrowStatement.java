package java_;
public interface ThrowStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<ThrowStatement> allInstances_ = new com.crossecore.ocl.QuickSet<ThrowStatement>(ThrowStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<ThrowStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<ThrowStatement> result = new com.crossecore.ocl.QuickSet<ThrowStatement>(ThrowStatement.class);
		result.addAll(ThrowStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ThrowStatement> allInstances = new com.crossecore.ocl.QuickSet<ThrowStatement>(ThrowStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
