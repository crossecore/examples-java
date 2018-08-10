package java_;
public interface ClassDeclaration 
 extends TypeDeclaration
{
	
	public static Ocllib.QuickSet<ClassDeclaration> allInstances_ = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
		
	public static Ocllib.QuickSet<ClassDeclaration> allInstances(){
		
		Ocllib.QuickSet<ClassDeclaration> result = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
		result.addAll(ClassDeclaration.allInstances_);
		
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ClassDeclaration> allInstances = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
	
	TypeAccess getSuperClass();
	void setSuperClass(TypeAccess value);
	
}
