package java_;
public interface TypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<TypeDeclaration> allInstances = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<TypeDeclaration> allInstances_ = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
	public static Ocllib.QuickSet<TypeDeclaration> allInstancesClosure = new Ocllib.QuickSet<TypeDeclaration>(TypeDeclaration.class);
		
	public static Ocllib.QuickSet<TypeDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(TypeDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	
}
