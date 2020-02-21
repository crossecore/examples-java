package java_;
public interface SuperMethodInvocation 
 extends AbstractTypeQualifiedExpression,AbstractMethodInvocation
{
	
	public static com.crossecore.ocl.QuickSet<SuperMethodInvocation> allInstances_ = new com.crossecore.ocl.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
		
	public static com.crossecore.ocl.QuickSet<SuperMethodInvocation> allInstances(){
		
		com.crossecore.ocl.QuickSet<SuperMethodInvocation> result = new com.crossecore.ocl.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
		result.addAll(SuperMethodInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SuperMethodInvocation> allInstances = new com.crossecore.ocl.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
	
}
