package java_;
public interface ClassFile 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<ClassFile> allInstances_ = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
	
		
	public static Ocllib.QuickSet<ClassFile> allInstances(){
		
		Ocllib.QuickSet<ClassFile> result = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
		result.addAll(ClassFile.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ClassFile> allInstances = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	
	AbstractTypeDeclaration getType();
	void setType(AbstractTypeDeclaration value);
	
	CompilationUnit getAttachedSource();
	void setAttachedSource(CompilationUnit value);
	
	Package getPackage();
	void setPackage(Package value);
	
}
