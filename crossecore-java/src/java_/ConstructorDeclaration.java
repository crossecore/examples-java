package java_;
public interface ConstructorDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstances = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstances_ = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstancesClosure = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
		
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AbstractMethodDeclaration.allInstances_);
			allInstancesClosure.addAll(ConstructorDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
