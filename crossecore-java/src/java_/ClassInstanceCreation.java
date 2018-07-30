package java_;
public interface ClassInstanceCreation 
 extends Expression,AbstractMethodInvocation
{
	
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstances = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
	/*
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstances_ = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstancesClosure = new Ocllib.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
		
	public static Ocllib.QuickSet<ClassInstanceCreation> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractMethodInvocation.allInstances_);
			allInstancesClosure.addAll(ClassInstanceCreation.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
