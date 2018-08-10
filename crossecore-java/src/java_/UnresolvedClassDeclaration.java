package java_;
public interface UnresolvedClassDeclaration 
 extends ClassDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedClassDeclaration> result = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
	
}
