package java_;
public interface EnumDeclaration 
 extends AbstractTypeDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<EnumDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<EnumDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<EnumDeclaration> result = new com.crossecore.ocl.QuickSet<EnumDeclaration>(EnumDeclaration.class);
		result.addAll(EnumDeclaration.allInstances_);
		
		result.addAll(UnresolvedEnumDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<EnumDeclaration> allInstances = new com.crossecore.ocl.QuickSet<EnumDeclaration>(EnumDeclaration.class);
	
	com.crossecore.ocl.OrderedSet<EnumConstantDeclaration> getEnumConstants();
	
}
