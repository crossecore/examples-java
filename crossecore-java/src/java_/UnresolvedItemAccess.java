package java_;
public interface UnresolvedItemAccess 
 extends Expression,NamespaceAccess
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedItemAccess> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedItemAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedItemAccess> result = new com.crossecore.ocl.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
		result.addAll(UnresolvedItemAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedItemAccess> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
	
	UnresolvedItem getElement();
	void setElement(UnresolvedItem value);
	
	ASTNode getQualifier();
	void setQualifier(ASTNode value);
	
}
