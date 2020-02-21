package java_;
public interface MethodRefParameter 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<MethodRefParameter> allInstances_ = new com.crossecore.ocl.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
		
	public static com.crossecore.ocl.QuickSet<MethodRefParameter> allInstances(){
		
		com.crossecore.ocl.QuickSet<MethodRefParameter> result = new com.crossecore.ocl.QuickSet<MethodRefParameter>(MethodRefParameter.class);
		result.addAll(MethodRefParameter.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<MethodRefParameter> allInstances = new com.crossecore.ocl.QuickSet<MethodRefParameter>(MethodRefParameter.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
