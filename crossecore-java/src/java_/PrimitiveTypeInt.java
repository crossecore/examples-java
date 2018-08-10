package java_;
public interface PrimitiveTypeInt 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeInt> result = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
		result.addAll(PrimitiveTypeInt.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
	
}
