package java_;
public interface PrimitiveTypeByte 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeByte> result = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
		result.addAll(PrimitiveTypeByte.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
	
	
}
