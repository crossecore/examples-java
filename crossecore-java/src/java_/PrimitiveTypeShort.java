package java_;
public interface PrimitiveTypeShort 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeShort> result = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
		result.addAll(PrimitiveTypeShort.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
	
	
}
