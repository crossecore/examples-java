package java_;
public interface ClassInstanceCreation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstances_ = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
		
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstances(){
		
		Ocllib.QuickSet<ClassInstanceCreation> result = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
		result.addAll(ClassInstanceCreation.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ClassInstanceCreation> allInstances = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
