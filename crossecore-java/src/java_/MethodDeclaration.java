package java_;
public interface MethodDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static Ocllib.QuickSet<MethodDeclaration> allInstances = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<MethodDeclaration> allInstances_ = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
	public static Ocllib.QuickSet<MethodDeclaration> allInstancesClosure = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
		
	public static Ocllib.QuickSet<MethodDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AbstractMethodDeclaration.allInstances_);
			allInstancesClosure.addAll(MethodDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	TypeAccess getReturnType();
	void setReturnType(TypeAccess value);
	
	MethodDeclaration getRedefinedMethodDeclaration();
	void setRedefinedMethodDeclaration(MethodDeclaration value);
	Ocllib.Set<MethodDeclaration> getRedefinitions();
	
}
