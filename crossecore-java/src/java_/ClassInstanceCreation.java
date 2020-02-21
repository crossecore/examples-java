package java_;
public interface ClassInstanceCreation 
 extends Expression,AbstractMethodInvocation
{
	
	public static com.crossecore.ocl.QuickSet<ClassInstanceCreation> allInstances_ = new com.crossecore.ocl.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
		
	public static com.crossecore.ocl.QuickSet<ClassInstanceCreation> allInstances(){
		
		com.crossecore.ocl.QuickSet<ClassInstanceCreation> result = new com.crossecore.ocl.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
		result.addAll(ClassInstanceCreation.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ClassInstanceCreation> allInstances = new com.crossecore.ocl.QuickSet<ClassInstanceCreation>(ClassInstanceCreation.class);
	
	
	AnonymousClassDeclaration getAnonymousClassDeclaration();
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
