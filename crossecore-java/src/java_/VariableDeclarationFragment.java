package java_;
public interface VariableDeclarationFragment 
 extends VariableDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<VariableDeclarationFragment> allInstances_ = new com.crossecore.ocl.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
		
	public static com.crossecore.ocl.QuickSet<VariableDeclarationFragment> allInstances(){
		
		com.crossecore.ocl.QuickSet<VariableDeclarationFragment> result = new com.crossecore.ocl.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
		result.addAll(VariableDeclarationFragment.allInstances_);
		
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<VariableDeclarationFragment> allInstances = new com.crossecore.ocl.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
	
	AbstractVariablesContainer getVariablesContainer();
	void setVariablesContainer(AbstractVariablesContainer value);
	
}
