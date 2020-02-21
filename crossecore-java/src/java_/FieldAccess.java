package java_;
public interface FieldAccess 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<FieldAccess> allInstances_ = new com.crossecore.ocl.QuickSet<FieldAccess>(FieldAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<FieldAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<FieldAccess> result = new com.crossecore.ocl.QuickSet<FieldAccess>(FieldAccess.class);
		result.addAll(FieldAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<FieldAccess> allInstances = new com.crossecore.ocl.QuickSet<FieldAccess>(FieldAccess.class);
	
	
	SingleVariableAccess getField();
	void setField(SingleVariableAccess value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
