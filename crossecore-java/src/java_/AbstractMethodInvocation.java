package java_;
public interface AbstractMethodInvocation 
 extends ASTNode
{
	
	public static Ocllib.Set<AbstractMethodInvocation> allInstances = new Ocllib.Set<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
