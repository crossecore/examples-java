package java_;
public interface ImportDeclaration 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<ImportDeclaration> allInstances = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<ImportDeclaration> allInstances_ = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
	public static Ocllib.QuickSet<ImportDeclaration> allInstancesClosure = new Ocllib.QuickSet<ImportDeclaration>(ImportDeclaration.class);
		
	public static Ocllib.QuickSet<ImportDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(ImportDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	boolean isStatic();
	void setStatic(boolean value);
	//public boolean isStatic();
	
	NamedElement getImportedElement();
	void setImportedElement(NamedElement value);
	
}
