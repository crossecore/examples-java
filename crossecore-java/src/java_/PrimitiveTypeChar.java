package java_;
public interface PrimitiveTypeChar 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
	
		
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances(){
		
		Ocllib.QuickSet<PrimitiveTypeChar> result = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
		result.addAll(PrimitiveTypeChar.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
	
	
}
