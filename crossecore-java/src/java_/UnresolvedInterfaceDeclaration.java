package java_;
public interface UnresolvedInterfaceDeclaration 
 extends InterfaceDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedInterfaceDeclaration> result = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
	
}
