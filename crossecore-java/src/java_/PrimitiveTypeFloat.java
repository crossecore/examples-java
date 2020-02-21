package java_;
public interface PrimitiveTypeFloat 
 extends PrimitiveType
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeFloat> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeFloat> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveTypeFloat> result = new com.crossecore.ocl.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveTypeFloat> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
	
}
