package java_;
public interface ClassFile 
 extends NamedElement
{
	
	public static Ocllib.Set<ClassFile> allInstances = new Ocllib.Set<ClassFile>(ClassFile.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	
	AbstractTypeDeclaration getType();
	void setType(AbstractTypeDeclaration value);
	
	CompilationUnit getAttachedSource();
	void setAttachedSource(CompilationUnit value);
	
	Package getPackage();
	void setPackage(Package value);
	
}
