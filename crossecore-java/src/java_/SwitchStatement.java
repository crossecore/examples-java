package java_;
public interface SwitchStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<SwitchStatement> allInstances_ = new com.crossecore.ocl.QuickSet<SwitchStatement>(SwitchStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<SwitchStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<SwitchStatement> result = new com.crossecore.ocl.QuickSet<SwitchStatement>(SwitchStatement.class);
		result.addAll(SwitchStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SwitchStatement> allInstances = new com.crossecore.ocl.QuickSet<SwitchStatement>(SwitchStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	com.crossecore.ocl.OrderedSet<Statement> getStatements();
	
}
