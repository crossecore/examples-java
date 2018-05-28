package java_;
public interface MethodDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static Ocllib.Set<MethodDeclaration> allInstances = new Ocllib.Set<MethodDeclaration>(MethodDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	TypeAccess getReturnType();
	void setReturnType(TypeAccess value);
	
	MethodDeclaration getRedefinedMethodDeclaration();
	void setRedefinedMethodDeclaration(MethodDeclaration value);
	Ocllib.Set<MethodDeclaration> getRedefinitions();
	
}
