package java_;
public interface UnresolvedVariableDeclarationFragment 
 extends VariableDeclarationFragment,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances_ = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
		
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances(){
		
		Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> result = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
	
}
