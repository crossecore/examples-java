package java_;
public interface MethodInvocation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.Set<MethodInvocation> allInstances = new Ocllib.Set<MethodInvocation>(MethodInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
