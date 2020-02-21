package java_;
public interface UnresolvedVariableDeclarationFragment 
 extends VariableDeclarationFragment,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment> result = new com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
	
}
