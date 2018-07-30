package java_;
public interface SuperConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
	/*
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances_ = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
	
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstancesClosure = new Ocllib.QuickSet<SuperConstructorInvocation>(SuperConstructorInvocation.class);
		
	public static Ocllib.QuickSet<SuperConstructorInvocation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
			allInstancesClosure.addAll(SuperConstructorInvocation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
