package java_;
public interface UnresolvedMethodDeclaration 
 extends MethodDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
	
}
