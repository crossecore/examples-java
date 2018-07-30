package java_;
public interface UnresolvedItem 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<UnresolvedItem> allInstances = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedItem> allInstances_ = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
	
	public static Ocllib.QuickSet<UnresolvedItem> allInstancesClosure = new Ocllib.QuickSet<UnresolvedItem>(UnresolvedItem.class);
		
	public static Ocllib.QuickSet<UnresolvedItem> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(UnresolvedItem.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
