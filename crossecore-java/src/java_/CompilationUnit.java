package java_;
public interface CompilationUnit 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<CompilationUnit> allInstances_ = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
	
		
	public static Ocllib.QuickSet<CompilationUnit> allInstances(){
		
		Ocllib.QuickSet<CompilationUnit> result = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
		result.addAll(CompilationUnit.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<CompilationUnit> allInstances = new Ocllib.QuickSet<CompilationUnit>(CompilationUnit.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.OrderedSet<Comment> getCommentList();
	Ocllib.OrderedSet<ImportDeclaration> getImports();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<AbstractTypeDeclaration> getTypes();
	
}
