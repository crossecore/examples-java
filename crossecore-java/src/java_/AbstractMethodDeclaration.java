package java_;
public interface AbstractMethodDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances_ = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
		
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances(){
		
		Ocllib.QuickSet<AbstractMethodDeclaration> result = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
		result.addAll(AbstractMethodDeclaration.allInstances_);
		
		result.addAll(MethodDeclaration.allInstances_);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		result.addAll(ConstructorDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
	
	Block getBody();
	void setBody(Block value);
	Ocllib.OrderedSet<SingleVariableDeclaration> getParameters();
	Ocllib.OrderedSet<TypeAccess> getThrownExceptions();
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	Ocllib.Set<MethodRef> getUsagesInDocComments();
	Ocllib.Set<AbstractMethodInvocation> getUsages();
	
}
