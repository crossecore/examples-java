package java_;
public interface UnresolvedSingleVariableDeclaration 
 extends SingleVariableDeclaration,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration> result = new com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
	
}
