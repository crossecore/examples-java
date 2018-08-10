package java_;
public interface MethodDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static Ocllib.QuickSet<MethodDeclaration> allInstances_ = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
		
	public static Ocllib.QuickSet<MethodDeclaration> allInstances(){
		
		Ocllib.QuickSet<MethodDeclaration> result = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
		result.addAll(MethodDeclaration.allInstances_);
		
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<MethodDeclaration> allInstances = new Ocllib.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	TypeAccess getReturnType();
	void setReturnType(TypeAccess value);
	
	MethodDeclaration getRedefinedMethodDeclaration();
	void setRedefinedMethodDeclaration(MethodDeclaration value);
	Ocllib.Set<MethodDeclaration> getRedefinitions();
	
}
