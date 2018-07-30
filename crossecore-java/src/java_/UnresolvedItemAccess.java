package java_;
public interface UnresolvedItemAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
	/*
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances_ = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstancesClosure = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
		
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(NamespaceAccess.allInstances_);
			allInstancesClosure.addAll(UnresolvedItemAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	UnresolvedItem getElement();
	void setElement(UnresolvedItem value);
	
	ASTNode getQualifier();
	void setQualifier(ASTNode value);
	
}
