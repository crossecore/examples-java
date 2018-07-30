package java_;
public interface PrimitiveTypeChar 
 extends PrimitiveType
{
	
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
	
	/*
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances_ = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
	
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstancesClosure = new Ocllib.QuickSet<PrimitiveTypeChar>(PrimitiveTypeChar.class);
		
	public static Ocllib.QuickSet<PrimitiveTypeChar> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(PrimitiveType.allInstances_);
			allInstancesClosure.addAll(PrimitiveTypeChar.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
