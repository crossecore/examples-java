package java_;
public interface ImportDeclaration 
 extends ASTNode
{
	
	public static Ocllib.Set<ImportDeclaration> allInstances = new Ocllib.Set<ImportDeclaration>(ImportDeclaration.class);
	
	boolean isStatic();
	void setStatic(boolean value);
	//public boolean isStatic();
	
	NamedElement getImportedElement();
	void setImportedElement(NamedElement value);
	
}
