package java_;
public interface InterfaceDeclaration 
 extends TypeDeclaration
{
	
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstances = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstances_ = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstancesClosure = new Ocllib.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
		
	public static Ocllib.QuickSet<InterfaceDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(TypeDeclaration.allInstances_);
			allInstancesClosure.addAll(InterfaceDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
