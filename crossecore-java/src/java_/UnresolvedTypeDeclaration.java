package java_;
public interface UnresolvedTypeDeclaration 
 extends AbstractTypeDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
		result.addAll(UnresolvedTypeDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
	
}
