package java_;
public interface PrimitiveTypeBoolean 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeBoolean>(PrimitiveTypeBoolean.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeBoolean> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeBoolean.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
