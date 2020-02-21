package java_;
public interface ConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static com.crossecore.ocl.QuickSet<ConstructorInvocation> allInstances_ = new com.crossecore.ocl.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
		
	public static com.crossecore.ocl.QuickSet<ConstructorInvocation> allInstances(){
		
		com.crossecore.ocl.QuickSet<ConstructorInvocation> result = new com.crossecore.ocl.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
		result.addAll(ConstructorInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ConstructorInvocation> allInstances = new com.crossecore.ocl.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
	
}
