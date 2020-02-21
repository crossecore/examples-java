package java_;
public interface BreakStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<BreakStatement> allInstances_ = new com.crossecore.ocl.QuickSet<BreakStatement>(BreakStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<BreakStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<BreakStatement> result = new com.crossecore.ocl.QuickSet<BreakStatement>(BreakStatement.class);
		result.addAll(BreakStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<BreakStatement> allInstances = new com.crossecore.ocl.QuickSet<BreakStatement>(BreakStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
