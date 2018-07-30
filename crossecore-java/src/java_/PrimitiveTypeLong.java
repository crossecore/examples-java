package java_;
public interface PrimitiveTypeLong 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeLong>(PrimitiveTypeLong.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeLong> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeLong.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
