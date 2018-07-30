package java_;
public interface CompilationUnit 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<CompilationUnit> allInstances = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
	
	/*
	public static Ocllib.QuickSet<CompilationUnit> allInstances_ = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
	
	public static Ocllib.QuickSet<CompilationUnit> allInstancesClosure = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
		
	public static Ocllib.QuickSet<CompilationUnit> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(CompilationUnit.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.OrderedSet<Comment> getCommentList();
	Ocllib.OrderedSet<ImportDeclaration> getImports();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<AbstractTypeDeclaration> getTypes();
	
}
