package java_;
public interface MethodDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<MethodDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<MethodDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<MethodDeclaration> result = new com.crossecore.ocl.QuickSet<MethodDeclaration>(MethodDeclaration.class);
		result.addAll(MethodDeclaration.allInstances_);
		
		result.addAll(UnresolvedMethodDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<MethodDeclaration> allInstances = new com.crossecore.ocl.QuickSet<MethodDeclaration>(MethodDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	TypeAccess getReturnType();
	void setReturnType(TypeAccess value);
	
	MethodDeclaration getRedefinedMethodDeclaration();
	void setRedefinedMethodDeclaration(MethodDeclaration value);
	com.crossecore.ocl.Set<MethodDeclaration> getRedefinitions();
	
}
