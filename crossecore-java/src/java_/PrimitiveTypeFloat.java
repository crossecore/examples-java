package java_;
public interface PrimitiveTypeFloat 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeFloat> result = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
	
}
