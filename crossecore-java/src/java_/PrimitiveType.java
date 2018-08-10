package java_;
public interface PrimitiveType 
 extends Type
{
	
	public static Ocllib.QuickSet<PrimitiveType> allInstances_ = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
	
		
	public static Ocllib.QuickSet<PrimitiveType> allInstances(){
		
		Ocllib.QuickSet<PrimitiveType> result = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
		result.addAll(PrimitiveType.allInstances_);
		
		result.addAll(PrimitiveTypeChar.allInstances_);
		result.addAll(PrimitiveTypeBoolean.allInstances_);
		result.addAll(PrimitiveTypeInt.allInstances_);
		result.addAll(PrimitiveTypeDouble.allInstances_);
		result.addAll(PrimitiveTypeLong.allInstances_);
		result.addAll(PrimitiveTypeFloat.allInstances_);
		result.addAll(PrimitiveTypeVoid.allInstances_);
		result.addAll(PrimitiveTypeByte.allInstances_);
		result.addAll(PrimitiveTypeShort.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrimitiveType> allInstances = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
	
	
}
