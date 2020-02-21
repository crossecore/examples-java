package java_;
public interface SuperConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static com.crossecore.ocl.QuickSet<SuperConstructorInvocation> allInstances_ = new com.crossecore.ocl.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
		
	public static com.crossecore.ocl.QuickSet<SuperConstructorInvocation> allInstances(){
		
		com.crossecore.ocl.QuickSet<SuperConstructorInvocation> result = new com.crossecore.ocl.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
		result.addAll(SuperConstructorInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SuperConstructorInvocation> allInstances = new com.crossecore.ocl.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
