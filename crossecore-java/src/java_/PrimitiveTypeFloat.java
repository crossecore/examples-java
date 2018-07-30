package java_;
public interface PrimitiveTypeFloat 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeFloat>(PrimitiveTypeFloat.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeFloat> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeFloat.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
