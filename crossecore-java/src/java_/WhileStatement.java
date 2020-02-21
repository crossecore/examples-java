package java_;
public interface WhileStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<WhileStatement> allInstances_ = new com.crossecore.ocl.QuickSet<WhileStatement>(WhileStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<WhileStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<WhileStatement> result = new com.crossecore.ocl.QuickSet<WhileStatement>(WhileStatement.class);
		result.addAll(WhileStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<WhileStatement> allInstances = new com.crossecore.ocl.QuickSet<WhileStatement>(WhileStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
