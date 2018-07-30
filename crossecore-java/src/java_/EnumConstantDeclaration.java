package java_;
public interface EnumConstantDeclaration 
 extends BodyDeclaration,VariableDeclaration
{
	
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances_ = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstancesClosure = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
		
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(BodyDeclaration.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
			allInstancesClosure.addAll(EnumConstantDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	
}
