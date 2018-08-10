package java_;
public interface UnresolvedTypeDeclaration 
 extends AbstractTypeDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedTypeDeclaration> result = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
	
}
