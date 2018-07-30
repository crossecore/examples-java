package java_;
public interface PrimitiveTypeShort 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeShort>(PrimitiveTypeShort.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeShort> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeShort.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
