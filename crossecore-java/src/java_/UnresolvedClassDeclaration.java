package java_;
public interface UnresolvedClassDeclaration 
 extends ClassDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
	
}
