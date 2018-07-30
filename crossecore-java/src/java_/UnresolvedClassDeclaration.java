package java_;
public interface UnresolvedClassDeclaration 
 extends ClassDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedClassDeclaration>(UnresolvedClassDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedClassDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(TypeDeclaration.allInstances_);
			allInstancesClosure.addAll(ClassDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedClassDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
