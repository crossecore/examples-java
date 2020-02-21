package java_;
public interface SynchronizedStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<SynchronizedStatement> allInstances_ = new com.crossecore.ocl.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<SynchronizedStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<SynchronizedStatement> result = new com.crossecore.ocl.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
		result.addAll(SynchronizedStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SynchronizedStatement> allInstances = new com.crossecore.ocl.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
