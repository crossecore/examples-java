package java_;
public interface ClassDeclaration 
 extends TypeDeclaration
{
	
	public static Ocllib.QuickSet<ClassDeclaration> allInstances = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<ClassDeclaration> allInstances_ = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
	
	public static Ocllib.QuickSet<ClassDeclaration> allInstancesClosure = new Ocllib.QuickSet<ClassDeclaration>(ClassDeclaration.class);
		
	public static Ocllib.QuickSet<ClassDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(TypeDeclaration.allInstances_);
			allInstancesClosure.addAll(ClassDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getSuperClass();
	void setSuperClass(TypeAccess value);
	
}
