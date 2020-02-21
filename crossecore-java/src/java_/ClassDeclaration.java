package java_;
public interface ClassDeclaration 
 extends TypeDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<ClassDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<ClassDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<ClassDeclaration> result = new com.crossecore.ocl.QuickSet<ClassDeclaration>(ClassDeclaration.class);
		result.addAll(ClassDeclaration.allInstances_);
		
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ClassDeclaration> allInstances = new com.crossecore.ocl.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
	
	TypeAccess getSuperClass();
	void setSuperClass(TypeAccess value);
	
}
