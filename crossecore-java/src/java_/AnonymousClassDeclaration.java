package java_;
public interface AnonymousClassDeclaration 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances_ = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
		
	public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances(){
		
		Ocllib.QuickSet<AnonymousClassDeclaration> result = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
		result.addAll(AnonymousClassDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AnonymousClassDeclaration> allInstances = new Ocllib.QuickSet<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	
	ClassInstanceCreation getClassInstanceCreation();
	void setClassInstanceCreation(ClassInstanceCreation value);
	
}
