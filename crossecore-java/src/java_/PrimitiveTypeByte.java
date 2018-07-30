package java_;
public interface PrimitiveTypeByte 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeByte>(PrimitiveTypeByte.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeByte> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeByte.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
