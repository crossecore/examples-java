package java_;
public interface UnresolvedType 
 extends Type,UnresolvedItem
{
	
	public static com.crossecore.ocl.QuickSet<UnresolvedType> allInstances_ = new com.crossecore.ocl.QuickSet<UnresolvedType>(UnresolvedType.class);
	
		
	public static com.crossecore.ocl.QuickSet<UnresolvedType> allInstances(){
		
		com.crossecore.ocl.QuickSet<UnresolvedType> result = new com.crossecore.ocl.QuickSet<UnresolvedType>(UnresolvedType.class);
		result.addAll(UnresolvedType.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<UnresolvedType> allInstances = new com.crossecore.ocl.QuickSet<UnresolvedType>(UnresolvedType.class);
	
	
}
