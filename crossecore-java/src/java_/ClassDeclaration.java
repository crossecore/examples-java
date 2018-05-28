package java_;
public interface ClassDeclaration 
 extends TypeDeclaration
{
	
	public static Ocllib.Set<ClassDeclaration> allInstances = new Ocllib.Set<ClassDeclaration>(ClassDeclaration.class);
	
	
	TypeAccess getSuperClass();
	void setSuperClass(TypeAccess value);
	
}
