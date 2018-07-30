package java_;
public interface PrimitiveTypeInt 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeInt>(PrimitiveTypeInt.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeInt> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeInt.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
