package java_;
public interface UnresolvedInterfaceDeclaration 
 extends InterfaceDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
	
}
