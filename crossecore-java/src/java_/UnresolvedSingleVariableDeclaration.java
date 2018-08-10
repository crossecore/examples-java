package java_;
public interface UnresolvedSingleVariableDeclaration 
 extends SingleVariableDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
		
	public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances(){
		
		Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> result = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedSingleVariableDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedSingleVariableDeclaration>(UnresolvedSingleVariableDeclaration.class);
	
	
}
