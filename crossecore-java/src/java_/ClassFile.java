package java_;
public interface ClassFile 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<ClassFile> allInstances = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
	
	/*
	public static Ocllib.QuickSet<ClassFile> allInstances_ = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
	
	public static Ocllib.QuickSet<ClassFile> allInstancesClosure = new Ocllib.QuickSet<ClassFile>(ClassFile.class);
		
	public static Ocllib.QuickSet<ClassFile> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(ClassFile.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	
	AbstractTypeDeclaration getType();
	void setType(AbstractTypeDeclaration value);
	
	CompilationUnit getAttachedSource();
	void setAttachedSource(CompilationUnit value);
	
	Package getPackage();
	void setPackage(Package value);
	
}
