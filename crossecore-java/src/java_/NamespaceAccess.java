package java_;
public interface NamespaceAccess 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<NamespaceAccess> allInstances = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
	/*
	public static Ocllib.QuickSet<NamespaceAccess> allInstances_ = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
	
	public static Ocllib.QuickSet<NamespaceAccess> allInstancesClosure = new Ocllib.QuickSet<NamespaceAccess>(NamespaceAccess.class);
		
	public static Ocllib.QuickSet<NamespaceAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamespaceAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
