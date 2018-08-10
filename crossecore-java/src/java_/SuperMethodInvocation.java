package java_;
public interface SuperMethodInvocation 
 extends AbstractTypeQualifiedExpression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstances_ = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
		
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstances(){
		
		Ocllib.QuickSet<SuperMethodInvocation> result = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
		result.addAll(SuperMethodInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SuperMethodInvocation> allInstances = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
	
}
