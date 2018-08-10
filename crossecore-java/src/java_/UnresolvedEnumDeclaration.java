package java_;
public interface UnresolvedEnumDeclaration 
 extends EnumDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedEnumDeclaration> result = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
	
}
