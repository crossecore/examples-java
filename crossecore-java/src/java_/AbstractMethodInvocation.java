package java_;
public interface AbstractMethodInvocation 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<AbstractMethodInvocation> allInstances_ = new com.crossecore.ocl.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
		
	public static com.crossecore.ocl.QuickSet<AbstractMethodInvocation> allInstances(){
		
		com.crossecore.ocl.QuickSet<AbstractMethodInvocation> result = new com.crossecore.ocl.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
		result.addAll(AbstractMethodInvocation.allInstances_);
		
		result.addAll(MethodInvocation.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		result.addAll(ConstructorInvocation.allInstances_);
		result.addAll(SuperConstructorInvocation.allInstances_);
		result.addAll(ClassInstanceCreation.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AbstractMethodInvocation> allInstances = new com.crossecore.ocl.QuickSet<AbstractMethodInvocation>(AbstractMethodInvocation.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	com.crossecore.ocl.OrderedSet<Expression> getArguments();
	com.crossecore.ocl.OrderedSet<TypeAccess> getTypeArguments();
	
}
