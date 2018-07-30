package java_;
public interface UnresolvedSingleVariableDeclaration 
 extends SingleVariableDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
			allInstancesClosure.addAll(SingleVariableDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
