package java_;
public interface EnumConstantDeclaration 
 extends BodyDeclaration,VariableDeclaration
{
	
	public static Ocllib.Set<EnumConstantDeclaration> allInstances = new Ocllib.Set<EnumConstantDeclaration>(EnumConstantDeclaration.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	Ocllib.OrderedSet<Expression> getArguments();
	
}
