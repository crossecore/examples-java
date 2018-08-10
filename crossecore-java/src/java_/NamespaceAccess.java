package java_;
public interface NamespaceAccess 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<NamespaceAccess> allInstances_ = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
		
	public static Ocllib.QuickSet<NamespaceAccess> allInstances(){
		
		Ocllib.QuickSet<NamespaceAccess> result = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
		result.addAll(NamespaceAccess.allInstances_);
		
		result.addAll(UnresolvedItemAccess.allInstances_);
		result.addAll(TypeAccess.allInstances_);
		result.addAll(PackageAccess.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<NamespaceAccess> allInstances = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
	
}
