package java_;
public interface SwitchCase 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<SwitchCase> allInstances_ = new com.crossecore.ocl.QuickSet<SwitchCase>(SwitchCase.class);
	
		
	public static com.crossecore.ocl.QuickSet<SwitchCase> allInstances(){
		
		com.crossecore.ocl.QuickSet<SwitchCase> result = new com.crossecore.ocl.QuickSet<SwitchCase>(SwitchCase.class);
		result.addAll(SwitchCase.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SwitchCase> allInstances = new com.crossecore.ocl.QuickSet<SwitchCase>(SwitchCase.class);
	
	boolean isDefault();
	void setDefault(boolean value);
	//public boolean isDefault();
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
