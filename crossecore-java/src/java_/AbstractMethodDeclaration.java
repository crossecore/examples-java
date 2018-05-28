package java_;
public interface AbstractMethodDeclaration 
 extends BodyDeclaration
{
	
	public static Ocllib.Set<AbstractMethodDeclaration> allInstances = new Ocllib.Set<AbstractMethodDeclaration>(AbstractMethodDeclaration.class);
	
	
	Block getBody();
	void setBody(Block value);
	Ocllib.OrderedSet<SingleVariableDeclaration> getParameters();
	Ocllib.OrderedSet<TypeAccess> getThrownExceptions();
	Ocllib.OrderedSet<TypeParameter> getTypeParameters();
	Ocllib.Set<MethodRef> getUsagesInDocComments();
	Ocllib.Set<AbstractMethodInvocation> getUsages();
	
}
