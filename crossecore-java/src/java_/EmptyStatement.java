package java_;
public interface EmptyStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<EmptyStatement> allInstances_ = new com.crossecore.ocl.QuickSet<EmptyStatement>(EmptyStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<EmptyStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<EmptyStatement> result = new com.crossecore.ocl.QuickSet<EmptyStatement>(EmptyStatement.class);
		result.addAll(EmptyStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<EmptyStatement> allInstances = new com.crossecore.ocl.QuickSet<EmptyStatement>(EmptyStatement.class);
	
	
}
