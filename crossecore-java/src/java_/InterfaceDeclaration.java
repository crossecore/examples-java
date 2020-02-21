package java_;
public interface InterfaceDeclaration 
 extends TypeDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<InterfaceDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<InterfaceDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<InterfaceDeclaration> result = new com.crossecore.ocl.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
		result.addAll(InterfaceDeclaration.allInstances_);
		
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<InterfaceDeclaration> allInstances = new com.crossecore.ocl.QuickSet<InterfaceDeclaration>(InterfaceDeclaration.class);
	
	
}
