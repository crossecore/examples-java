package java_;
public interface UnresolvedItemAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.Set<UnresolvedItemAccess> allInstances = new Ocllib.Set<UnresolvedItemAccess>(UnresolvedItemAccess.class);
	
	
	UnresolvedItem getElement();
	void setElement(UnresolvedItem value);
	
	ASTNode getQualifier();
	void setQualifier(ASTNode value);
	
}
