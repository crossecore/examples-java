package java_;
public interface DoStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<DoStatement> allInstances_ = new com.crossecore.ocl.QuickSet<DoStatement>(DoStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<DoStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<DoStatement> result = new com.crossecore.ocl.QuickSet<DoStatement>(DoStatement.class);
		result.addAll(DoStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<DoStatement> allInstances = new com.crossecore.ocl.QuickSet<DoStatement>(DoStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
