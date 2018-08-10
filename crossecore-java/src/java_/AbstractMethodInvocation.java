package java_;
public interface AbstractMethodInvocation 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances_ = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
		
	public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances(){
		
		Ocllib.QuickSet<AbstractMethodInvocation> result = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
		result.addAll(AbstractMethodInvocation.allInstances_);
		
		result.addAll(ConstructorInvocation.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		result.addAll(ClassInstanceCreation.allInstances_);
		result.addAll(MethodInvocation.allInstances_);
		result.addAll(SuperConstructorInvocation.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AbstractMethodInvocation> allInstances = new Ocllib.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
