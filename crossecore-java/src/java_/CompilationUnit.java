package java_;
public interface CompilationUnit 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<CompilationUnit> allInstances_ = new com.crossecore.ocl.QuickSet<CompilationUnit>(CompilationUnit.class);
	
		
	public static com.crossecore.ocl.QuickSet<CompilationUnit> allInstances(){
		
		com.crossecore.ocl.QuickSet<CompilationUnit> result = new com.crossecore.ocl.QuickSet<CompilationUnit>(CompilationUnit.class);
		result.addAll(CompilationUnit.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<CompilationUnit> allInstances = new com.crossecore.ocl.QuickSet<CompilationUnit>(CompilationUnit.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	com.crossecore.ocl.OrderedSet<Comment> getCommentList();
	com.crossecore.ocl.OrderedSet<ImportDeclaration> getImports();
	
	Package getPackage();
	void setPackage(Package value);
	com.crossecore.ocl.OrderedSet<AbstractTypeDeclaration> getTypes();
	
}
