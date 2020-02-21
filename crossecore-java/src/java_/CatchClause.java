package java_;
public interface CatchClause 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<CatchClause> allInstances_ = new com.crossecore.ocl.QuickSet<CatchClause>(CatchClause.class);
	
		
	public static com.crossecore.ocl.QuickSet<CatchClause> allInstances(){
		
		com.crossecore.ocl.QuickSet<CatchClause> result = new com.crossecore.ocl.QuickSet<CatchClause>(CatchClause.class);
		result.addAll(CatchClause.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<CatchClause> allInstances = new com.crossecore.ocl.QuickSet<CatchClause>(CatchClause.class);
	
	
	SingleVariableDeclaration getException();
	void setException(SingleVariableDeclaration value);
	
	Block getBody();
	void setBody(Block value);
	
}
