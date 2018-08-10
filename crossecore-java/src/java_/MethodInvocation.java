package java_;
public interface MethodInvocation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<MethodInvocation> allInstances_ = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
	
		
	public static Ocllib.QuickSet<MethodInvocation> allInstances(){
		
		Ocllib.QuickSet<MethodInvocation> result = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
		result.addAll(MethodInvocation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<MethodInvocation> allInstances = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
