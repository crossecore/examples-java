package java_;
public interface UnresolvedLabeledStatement 
 extends LabeledStatement,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement> result = new com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedLabeledStatement>(UnresolvedLabeledStatement.class);
	
	
}
