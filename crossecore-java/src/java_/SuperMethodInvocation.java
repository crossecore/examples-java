package java_;
public interface SuperMethodInvocation 
 extends AbstractTypeQualifiedExpression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstances = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
	/*
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstances_ = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
	
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstancesClosure = new Ocllib.QuickSet<SuperMethodInvocation>(SuperMethodInvocation.class);
		
	public static Ocllib.QuickSet<SuperMethodInvocation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractTypeQualifiedExpression.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
			allInstancesClosure.addAll(SuperMethodInvocation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
