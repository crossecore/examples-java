package java_;
public interface NamedElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<NamedElement> allInstances = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
	
	/*
	public static Ocllib.QuickSet<NamedElement> allInstances_ = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
	
	public static Ocllib.QuickSet<NamedElement> allInstancesClosure = new Ocllib.QuickSet<NamedElement>(NamedElement.class);
		
	public static Ocllib.QuickSet<NamedElement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isProxy();
	void setProxy(boolean value);
	//public boolean isProxy();
	Ocllib.Set<ImportDeclaration> getUsagesInImports();
	
}
