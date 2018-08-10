package java_;
public interface PrimitiveTypeDouble 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeDouble> result = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
	
}
