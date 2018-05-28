package java_;
public interface CompilationUnit 
 extends NamedElement
{
	
	public static Ocllib.Set<CompilationUnit> allInstances = new Ocllib.Set<CompilationUnit>(CompilationUnit.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.OrderedSet<Comment> getCommentList();
	Ocllib.OrderedSet<ImportDeclaration> getImports();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.OrderedSet<AbstractTypeDeclaration> getTypes();
	
}
