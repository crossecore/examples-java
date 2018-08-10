package java_;
public interface UnresolvedMethodDeclaration 
 extends MethodDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedMethodDeclaration> result = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
	
}
