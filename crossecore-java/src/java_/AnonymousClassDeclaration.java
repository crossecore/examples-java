package java_;
public interface AnonymousClassDeclaration 
 extends ASTNode
{
	
	public static Ocllib.Set<AnonymousClassDeclaration> allInstances = new Ocllib.Set<AnonymousClassDeclaration>(AnonymousClassDeclaration.class);
	
	Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations();
	
	ClassInstanceCreation getClassInstanceCreation();
	void setClassInstanceCreation(ClassInstanceCreation value);
	
}
