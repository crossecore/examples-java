package java_;
public interface PrimitiveTypeLong 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeLong> result = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
		result.addAll(PrimitiveTypeLong.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
	
}
