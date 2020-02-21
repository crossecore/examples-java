package java_;
public interface MethodInvocation 
 extends Expression,AbstractMethodInvocation
{
	
	public static com.crossecore.ocl.QuickSet<MethodInvocation> allInstances_ = new com.crossecore.ocl.QuickSet<MethodInvocation>(MethodInvocation.class);
	
		
	public static com.crossecore.ocl.QuickSet<MethodInvocation> allInstances(){
		
		com.crossecore.ocl.QuickSet<MethodInvocation> result = new com.crossecore.ocl.QuickSet<MethodInvocation>(MethodInvocation.class);
		result.addAll(MethodInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<MethodInvocation> allInstances = new com.crossecore.ocl.QuickSet<MethodInvocation>(MethodInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
