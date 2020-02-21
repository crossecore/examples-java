package java_;
public interface ParameterizedType 
 extends Type
{
	
	public static com.crossecore.ocl.QuickSet<ParameterizedType> allInstances_ = new com.crossecore.ocl.QuickSet<ParameterizedType>(ParameterizedType.class);
	
		
	public static com.crossecore.ocl.QuickSet<ParameterizedType> allInstances(){
		
		com.crossecore.ocl.QuickSet<ParameterizedType> result = new com.crossecore.ocl.QuickSet<ParameterizedType>(ParameterizedType.class);
		result.addAll(ParameterizedType.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ParameterizedType> allInstances = new com.crossecore.ocl.QuickSet<ParameterizedType>(ParameterizedType.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	com.crossecore.ocl.OrderedSet<TypeAccess> getTypeArguments();
	
}
