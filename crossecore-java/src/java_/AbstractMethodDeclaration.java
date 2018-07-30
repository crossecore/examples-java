package java_;
public interface AbstractMethodDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances_ = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstancesClosure = new Ocllib.QuickSet<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
		
	public static Ocllib.QuickSet<AbstractMethodDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AbstractMethodDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Block getBody();
	void setBody(Block value);
	Ocllib.OrderedSet<SingleVariableDeclaration> getParameters();
	Ocllib.OrderedSet<TypeAccess> getThrownExceptions();
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	Ocllib.Set<MethodRef> getUsagesInDocComments();
	Ocllib.Set<AbstractMethodInvocation> getUsages();
	
}
