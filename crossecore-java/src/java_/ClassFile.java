package java_;
public interface ClassFile 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<ClassFile> allInstances_ = new com.crossecore.ocl.QuickSet<ClassFile>(ClassFile.class);
	
		
	public static com.crossecore.ocl.QuickSet<ClassFile> allInstances(){
		
		com.crossecore.ocl.QuickSet<ClassFile> result = new com.crossecore.ocl.QuickSet<ClassFile>(ClassFile.class);
		result.addAll(ClassFile.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ClassFile> allInstances = new com.crossecore.ocl.QuickSet<ClassFile>(ClassFile.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	
	AbstractTypeDeclaration getType();
	void setType(AbstractTypeDeclaration value);
	
	CompilationUnit getAttachedSource();
	void setAttachedSource(CompilationUnit value);
	
	Package getPackage();
	void setPackage(Package value);
	
}
