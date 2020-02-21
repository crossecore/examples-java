package java_;
public interface WildCardType 
 extends Type
{
	
	public static com.crossecore.ocl.QuickSet<WildCardType> allInstances_ = new com.crossecore.ocl.QuickSet<WildCardType>(WildCardType.class);
	
		
	public static com.crossecore.ocl.QuickSet<WildCardType> allInstances(){
		
		com.crossecore.ocl.QuickSet<WildCardType> result = new com.crossecore.ocl.QuickSet<WildCardType>(WildCardType.class);
		result.addAll(WildCardType.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<WildCardType> allInstances = new com.crossecore.ocl.QuickSet<WildCardType>(WildCardType.class);
	
	boolean isUpperBound();
	void setUpperBound(boolean value);
	//public boolean isUpperBound();
	
	TypeAccess getBound();
	void setBound(TypeAccess value);
	
}
