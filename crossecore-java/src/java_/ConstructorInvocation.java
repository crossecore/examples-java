package java_;
public interface ConstructorInvocation 
 extends Statement,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<ConstructorInvocation> allInstances = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
	/*
	public static Ocllib.QuickSet<ConstructorInvocation> allInstances_ = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
	
	public static Ocllib.QuickSet<ConstructorInvocation> allInstancesClosure = new Ocllib.QuickSet<ConstructorInvocation>(ConstructorInvocation.class);
		
	public static Ocllib.QuickSet<ConstructorInvocation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
			allInstancesClosure.addAll(ConstructorInvocation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
