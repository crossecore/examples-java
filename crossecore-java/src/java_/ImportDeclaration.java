package java_;
public interface ImportDeclaration 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<ImportDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<ImportDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<ImportDeclaration> result = new com.crossecore.ocl.QuickSet<ImportDeclaration>(ImportDeclaration.class);
		result.addAll(ImportDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ImportDeclaration> allInstances = new com.crossecore.ocl.QuickSet<ImportDeclaration>(ImportDeclaration.class);
	
	boolean isStatic();
	void setStatic(boolean value);
	//public boolean isStatic();
	
	NamedElement getImportedElement();
	void setImportedElement(NamedElement value);
	
}
