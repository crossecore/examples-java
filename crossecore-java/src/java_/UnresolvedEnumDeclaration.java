package java_;
public interface UnresolvedEnumDeclaration 
 extends EnumDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
	
}
