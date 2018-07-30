package java_;
public interface PrimitiveTypeDouble 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeDouble>(PrimitiveTypeDouble.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeDouble> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeDouble.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
