package java_;
public interface NamespaceAccess 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<NamespaceAccess> allInstances_ = new com.crossecore.ocl.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<NamespaceAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<NamespaceAccess> result = new com.crossecore.ocl.QuickSet<NamespaceAccess>(NamespaceAccess.class);
		result.addAll(NamespaceAccess.allInstances_);
		
		result.addAll(PackageAccess.allInstances_);
		result.addAll(UnresolvedItemAccess.allInstances_);
		result.addAll(TypeAccess.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<NamespaceAccess> allInstances = new com.crossecore.ocl.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
	
}
