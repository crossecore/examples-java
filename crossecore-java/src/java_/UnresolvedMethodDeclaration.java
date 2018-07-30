package java_;
public interface UnresolvedMethodDeclaration 
 extends MethodDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedMethodDeclaration>(UnresolvedMethodDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedMethodDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(AbstractMethodDeclaration.allInstances_);
			allInstancesClosure.addAll(MethodDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedMethodDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
