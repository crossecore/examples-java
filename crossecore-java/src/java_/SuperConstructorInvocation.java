package java_;
public interface SuperConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances_ = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
		
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances(){
		
		Ocllib.QuickSet<SuperConstructorInvocation> result = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
		result.addAll(SuperConstructorInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
