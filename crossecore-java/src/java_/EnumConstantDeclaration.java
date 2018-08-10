package java_;
public interface EnumConstantDeclaration 
 extends BodyDeclaration,VariableDeclaration
{
	
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances_ = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
		
	public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances(){
		
		Ocllib.QuickSet<EnumConstantDeclaration> result = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
		result.addAll(EnumConstantDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<EnumConstantDeclaration> allInstances = new Ocllib.QuickSet<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	
}
