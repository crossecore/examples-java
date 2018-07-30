package java_;
public interface AbstractMethodInvocation 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
	/*
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances_ = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstancesClosure = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
		
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
