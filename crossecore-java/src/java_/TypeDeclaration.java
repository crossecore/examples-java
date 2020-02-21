package java_;
public interface TypeDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<TypeDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<TypeDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<TypeDeclaration> result = new com.crossecore.ocl.QuickSet<TypeDeclaration>(TypeDeclaration.class);
		result.addAll(TypeDeclaration.allInstances_);
		
		result.addAll(UnresolvedClassDeclaration.allInstances_);
		result.addAll(InterfaceDeclaration.allInstances_);
		result.addAll(UnresolvedInterfaceDeclaration.allInstances_);
		result.addAll(ClassDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TypeDeclaration> allInstances = new com.crossecore.ocl.QuickSet<TypeDeclaration>(TypeDeclaration.class);
	
	com.crossecore.ocl.OrderedSet<TypeParameter> getTypeParameters();
	
}
