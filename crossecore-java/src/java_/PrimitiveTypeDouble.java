package java_;
public interface PrimitiveTypeDouble 
 extends PrimitiveType
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeDouble> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeDouble> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveTypeDouble> result = new com.crossecore.ocl.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveTypeDouble> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
	
}
