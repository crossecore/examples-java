package java_;
public interface PrimitiveTypeBoolean 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeBoolean> result = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
	
	
}
