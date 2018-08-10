package java_;
public interface UnresolvedItemAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances_ = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
		
	public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances(){
		
		Ocllib.QuickSet<UnresolvedItemAccess> result = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
		result.addAll(UnresolvedItemAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<UnresolvedItemAccess> allInstances = new Ocllib.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
	
	UnresolvedItem getElement();
	void setElement(UnresolvedItem value);
	
	ASTNode getQualifier();
	void setQualifier(ASTNode value);
	
}
