package java_;
public interface MethodRef 
 extends ASTNode
{
	
	public static Ocllib.Set<MethodRef> allInstances = new Ocllib.Set<MethodRef>(MethodRef.class);
	
	
	AbstractMethodDeclaration getMethod();
	void setMethod(AbstractMethodDeclaration value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	Ocllib.OrderedSet<MethodRefParameter> getParameters();
	
}
