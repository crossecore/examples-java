package java_;
public interface SingleVariableAccess 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<SingleVariableAccess> allInstances_ = new com.crossecore.ocl.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<SingleVariableAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<SingleVariableAccess> result = new com.crossecore.ocl.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
		result.addAll(SingleVariableAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SingleVariableAccess> allInstances = new com.crossecore.ocl.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
	
	VariableDeclaration getVariable();
	void setVariable(VariableDeclaration value);
	
	Expression getQualifier();
	void setQualifier(Expression value);
	
}
