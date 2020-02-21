package java_;
public interface EnhancedForStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<EnhancedForStatement> allInstances_ = new com.crossecore.ocl.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<EnhancedForStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<EnhancedForStatement> result = new com.crossecore.ocl.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
		result.addAll(EnhancedForStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<EnhancedForStatement> allInstances = new com.crossecore.ocl.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	SingleVariableDeclaration getParameter();
	void setParameter(SingleVariableDeclaration value);
	
}
