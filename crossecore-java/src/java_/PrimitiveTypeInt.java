package java_;
public interface PrimitiveTypeInt 
 extends PrimitiveType
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeInt> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeInt> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveTypeInt> result = new com.crossecore.ocl.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
		result.addAll(PrimitiveTypeInt.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveTypeInt> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
	
}
