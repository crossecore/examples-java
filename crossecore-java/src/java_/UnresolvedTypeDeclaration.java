package java_;
public interface UnresolvedTypeDeclaration 
 extends AbstractTypeDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedTypeDeclaration>(UnresolvedTypeDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedTypeDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedTypeDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
