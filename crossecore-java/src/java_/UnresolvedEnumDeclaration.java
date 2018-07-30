package java_;
public interface UnresolvedEnumDeclaration 
 extends EnumDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedEnumDeclaration>(UnresolvedEnumDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedEnumDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(EnumDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedEnumDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
