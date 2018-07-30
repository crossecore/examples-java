package java_;
public interface MethodInvocation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<MethodInvocation> allInstances = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
	
	/*
	public static Ocllib.QuickSet<MethodInvocation> allInstances_ = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
	
	public static Ocllib.QuickSet<MethodInvocation> allInstancesClosure = new Ocllib.QuickSet<MethodInvocation>(MethodInvocation.class);
		
	public static Ocllib.QuickSet<MethodInvocation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
			allInstancesClosure.addAll(MethodInvocation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
