package java_;
public interface EnumDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static Ocllib.QuickSet<EnumDeclaration> allInstances = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<EnumDeclaration> allInstances_ = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
	public static Ocllib.QuickSet<EnumDeclaration> allInstancesClosure = new Ocllib.QuickSet<EnumDeclaration>(EnumDeclaration.class);
		
	public static Ocllib.QuickSet<EnumDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(AbstractTypeDeclaration.allInstances_);
			allInstancesClosure.addAll(EnumDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<EnumConstantDeclaration> getEnumConstants();
	
}
