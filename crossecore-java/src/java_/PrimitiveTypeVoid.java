package java_;
public interface PrimitiveTypeVoid 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeVoid> result = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
	
}
