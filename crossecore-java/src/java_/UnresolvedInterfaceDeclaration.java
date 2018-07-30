package java_;
public interface UnresolvedInterfaceDeclaration 
 extends InterfaceDeclaration,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances_ = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
	
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstancesClosure = new Ocllib.QuickSet<UnresolvedInterfaceDeclaration>(UnresolvedInterfaceDeclaration.class);
		
	public static Ocllib.QuickSet<UnresolvedInterfaceDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(TypeDeclaration.allInstances_);
			allInstancesClosure.addAll(InterfaceDeclaration.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
