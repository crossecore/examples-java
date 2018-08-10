package java_;
public interface ArrayType 
 extends Type
{
	
	public static Ocllib.QuickSet<ArrayType> allInstances_ = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
	
		
	public static Ocllib.QuickSet<ArrayType> allInstances(){
		
		Ocllib.QuickSet<ArrayType> result = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
		result.addAll(ArrayType.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ArrayType> allInstances = new Ocllib.QuickSet<ArrayType>(ArrayType.class);
	
	int getDimensions();
	void setDimensions(int value);
	
	TypeAccess getElementType();
	void setElementType(TypeAccess value);
	
}
