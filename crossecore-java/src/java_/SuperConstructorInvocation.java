package java_;
public interface SuperConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static Ocllib.Set<SuperConstructorInvocation> allInstances = new Ocllib.Set<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
