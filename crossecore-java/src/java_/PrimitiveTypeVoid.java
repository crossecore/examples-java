package java_;
public interface PrimitiveTypeVoid 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeVoid>(PrimitiveTypeVoid.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeVoid> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeVoid.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
