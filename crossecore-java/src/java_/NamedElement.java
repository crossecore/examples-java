package java_;
public interface NamedElement 
 extends ASTNode
{
	
	public static Ocllib.Set<NamedElement> allInstances = new Ocllib.Set<NamedElement>(NamedElement.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	boolean isProxy();
	void setProxy(boolean value);
	//public boolean isProxy();
	Ocllib.Set<ImportDeclaration> getUsagesInImports();
	
}
