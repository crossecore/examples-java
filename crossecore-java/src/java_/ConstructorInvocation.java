package java_;
public interface ConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<ConstructorInvocation> allInstances_ = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
		
	public static Ocllib.QuickSet<ConstructorInvocation> allInstances(){
		
		Ocllib.QuickSet<ConstructorInvocation> result = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
		result.addAll(ConstructorInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ConstructorInvocation> allInstances = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
	
}
