package java_;
public interface ContinueStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<ContinueStatement> allInstances_ = new com.crossecore.ocl.QuickSet<ContinueStatement>(ContinueStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<ContinueStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<ContinueStatement> result = new com.crossecore.ocl.QuickSet<ContinueStatement>(ContinueStatement.class);
		result.addAll(ContinueStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ContinueStatement> allInstances = new com.crossecore.ocl.QuickSet<ContinueStatement>(ContinueStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
