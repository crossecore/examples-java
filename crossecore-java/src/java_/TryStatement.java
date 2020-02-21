package java_;
public interface TryStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<TryStatement> allInstances_ = new com.crossecore.ocl.QuickSet<TryStatement>(TryStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<TryStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<TryStatement> result = new com.crossecore.ocl.QuickSet<TryStatement>(TryStatement.class);
		result.addAll(TryStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TryStatement> allInstances = new com.crossecore.ocl.QuickSet<TryStatement>(TryStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Block getFinally();
	void setFinally(Block value);
	com.crossecore.ocl.OrderedSet<CatchClause> getCatchClauses();
	
}
