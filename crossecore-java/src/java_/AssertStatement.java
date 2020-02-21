package java_;
public interface AssertStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<AssertStatement> allInstances_ = new com.crossecore.ocl.QuickSet<AssertStatement>(AssertStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<AssertStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<AssertStatement> result = new com.crossecore.ocl.QuickSet<AssertStatement>(AssertStatement.class);
		result.addAll(AssertStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AssertStatement> allInstances = new com.crossecore.ocl.QuickSet<AssertStatement>(AssertStatement.class);
	
	
	Expression getMessage();
	void setMessage(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
