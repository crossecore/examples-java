package java_;
public interface ClassInstanceCreation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.Set<ClassInstanceCreation> allInstances = new Ocllib.Set<ClassInstanceCreation>(ClassInstanceCreation.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
