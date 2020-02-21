package java_;
public interface AbstractMethodDeclaration 
 extends BodyDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<AbstractMethodDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<AbstractMethodDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<AbstractMethodDeclaration> result = new com.crossecore.ocl.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
		result.addAll(AbstractMethodDeclaration.allInstances_);
		
		result.addAll(MethodDeclaration.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(ConstructorDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AbstractMethodDeclaration> allInstances = new com.crossecore.ocl.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
	
	Block getBody();
	void setBody(Block value);
	com.crossecore.ocl.OrderedSet<SingleVariableDeclaration> getParameters();
	com.crossecore.ocl.OrderedSet<TypeAccess> getThrownExceptions();
	com.crossecore.ocl.OrderedSet<TypeParameter> getTypeParameters();
	com.crossecore.ocl.Set<MethodRef> getUsagesInDocComments();
	com.crossecore.ocl.Set<AbstractMethodInvocation> getUsages();
	
}
