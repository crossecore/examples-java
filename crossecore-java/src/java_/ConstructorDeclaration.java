package java_;
public interface ConstructorDeclaration 
 extends AbstractMethodDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<ConstructorDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<ConstructorDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<ConstructorDeclaration> result = new com.crossecore.ocl.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
		result.addAll(ConstructorDeclaration.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ConstructorDeclaration> allInstances = new com.crossecore.ocl.QuickSet<ConstructorDeclaration>(ConstructorDeclaration.class);
	
	
}
