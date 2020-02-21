package java_;
public interface PrimitiveTypeLong 
 extends PrimitiveType
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeLong> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveTypeLong> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveTypeLong> result = new com.crossecore.ocl.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
		result.addAll(PrimitiveTypeLong.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveTypeLong> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
	
}
