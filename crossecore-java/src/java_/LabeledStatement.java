package java_;
public interface LabeledStatement 
 extends NamedElement,Statement
{
	
	public static com.crossecore.ocl.QuickSet<LabeledStatement> allInstances_ = new com.crossecore.ocl.QuickSet<LabeledStatement>(LabeledStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<LabeledStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<LabeledStatement> result = new com.crossecore.ocl.QuickSet<LabeledStatement>(LabeledStatement.class);
		result.addAll(LabeledStatement.allInstances_);
		
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<LabeledStatement> allInstances = new com.crossecore.ocl.QuickSet<LabeledStatement>(LabeledStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	com.crossecore.ocl.Set<BreakStatement> getUsagesInBreakStatements();
	com.crossecore.ocl.Set<ContinueStatement> getUsagesInContinueStatements();
	
}
