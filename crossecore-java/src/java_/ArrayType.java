package java_;
public interface ArrayType 
 extends Type
{
	
	public static com.crossecore.ocl.QuickSet<ArrayType> allInstances_ = new com.crossecore.ocl.QuickSet<ArrayType>(ArrayType.class);
	
		
	public static com.crossecore.ocl.QuickSet<ArrayType> allInstances(){
		
		com.crossecore.ocl.QuickSet<ArrayType> result = new com.crossecore.ocl.QuickSet<ArrayType>(ArrayType.class);
		result.addAll(ArrayType.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ArrayType> allInstances = new com.crossecore.ocl.QuickSet<ArrayType>(ArrayType.class);
	
	int getDimensions();
	void setDimensions(int value);
	
	TypeAccess getElementType();
	void setElementType(TypeAccess value);
	
}
