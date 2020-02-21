package java_;
public interface PrimitiveTypeVoid 
 extends PrimitiveType
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeVoid> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeVoid> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveTypeVoid> result = new com.crossecore.ocl.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveTypeVoid> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
	
}
