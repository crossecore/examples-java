package java_;
public interface ImportDeclaration 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<ImportDeclaration> allInstances_ = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
		
	public static Ocllib.QuickSet<ImportDeclaration> allInstances(){
		
		Ocllib.QuickSet<ImportDeclaration> result = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
		result.addAll(ImportDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ImportDeclaration> allInstances = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
	boolean isStatic();
	void setStatic(boolean value);
	//public boolean isStatic();
	
	NamedElement getImportedElement();
	void setImportedElement(NamedElement value);
	
}
