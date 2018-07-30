package java_;
public interface PrimitiveType 
 extends Type
{
	
	public static Ocllib.QuickSet<PrimitiveType> allInstances = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveType> allInstances_ = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
	
	public static Ocllib.QuickSet<PrimitiveType> allInstancesClosure = new Ocllib.QuickSet<PrimitiveType>(PrimitiveType.class);
		
	public static Ocllib.QuickSet<PrimitiveType> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
