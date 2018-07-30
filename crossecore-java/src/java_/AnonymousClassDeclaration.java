package java_;
public interface AnonymousClassDeclaration 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances_ = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstancesClosure = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
		
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(AnonymousClassDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	
	ClassInstanceCreation getClassInstanceCreation();
	void setClassInstanceCreation(ClassInstanceCreation value);
	
}
