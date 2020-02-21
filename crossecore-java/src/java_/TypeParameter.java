package java_;
public interface TypeParameter 
 extends Type
{
	
	public static com.crossecore.ocl.QuickSet<TypeParameter> allInstances_ = new com.crossecore.ocl.QuickSet<TypeParameter>(TypeParameter.class);
	
		
	public static com.crossecore.ocl.QuickSet<TypeParameter> allInstances(){
		
		com.crossecore.ocl.QuickSet<TypeParameter> result = new com.crossecore.ocl.QuickSet<TypeParameter>(TypeParameter.class);
		result.addAll(TypeParameter.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TypeParameter> allInstances = new com.crossecore.ocl.QuickSet<TypeParameter>(TypeParameter.class);
	
	com.crossecore.ocl.OrderedSet<TypeAccess> getBounds();
	
}
