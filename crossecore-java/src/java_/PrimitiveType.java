package java_;
public interface PrimitiveType 
 extends Type
{
	
	public static com.crossecore.ocl.QuickSet<PrimitiveType> allInstances_ = new com.crossecore.ocl.QuickSet<PrimitiveType>(PrimitiveType.class);
	
		
	public static com.crossecore.ocl.QuickSet<PrimitiveType> allInstances(){
		
		com.crossecore.ocl.QuickSet<PrimitiveType> result = new com.crossecore.ocl.QuickSet<PrimitiveType>(PrimitiveType.class);
		result.addAll(PrimitiveType.allInstances_);
		
		result.addAll(PrimitiveTypeChar.allInstances_);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		result.addAll(PrimitiveTypeLong.allInstances_);
		result.addAll(PrimitiveTypeByte.allInstances_);
		result.addAll(PrimitiveTypeShort.allInstances_);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		result.addAll(PrimitiveTypeInt.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PrimitiveType> allInstances = new com.crossecore.ocl.QuickSet<PrimitiveType>(PrimitiveType.class);
	
	
}
