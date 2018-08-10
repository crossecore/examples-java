package java_;
public interface ConstructorDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstances_ = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
		
	public static Ocllib.QuickSet<ConstructorDeclaration> allInstances(){
		
		Ocllib.QuickSet<ConstructorDeclaration> result = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
		result.addAll(ConstructorDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ConstructorDeclaration> allInstances = new Ocllib.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
	
}
