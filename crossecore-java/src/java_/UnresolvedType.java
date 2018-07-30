package java_;
public interface UnresolvedType 
 extends Type,UnresolvedItem
{
	
	public static Ocllib.QuickSet<UnresolvedType> allInstances = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedType> allInstances_ = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
	
	public static Ocllib.QuickSet<UnresolvedType> allInstancesClosure = new Ocllib.QuickSet<UnresolvedType>(UnresolvedType.class);
		
	public static Ocllib.QuickSet<UnresolvedType> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
			allInstancesClosure.addAll(UnresolvedType.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
