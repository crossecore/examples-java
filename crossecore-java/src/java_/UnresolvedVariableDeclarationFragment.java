package java_;
public interface UnresolvedVariableDeclarationFragment 
 extends VariableDeclarationFragment,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances_ = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
	
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstancesClosure = new Ocllib.QuickSet<UnresolvedVariableDeclarationFragment>(UnresolvedVariableDeclarationFragment.class);
		
	public static Ocllib.QuickSet<UnresolvedVariableDeclarationFragment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
			allInstancesClosure.addAll(VariableDeclarationFragment.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
