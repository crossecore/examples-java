package java_;
public interface TypeParameter 
 extends Type
{
	
	public static Ocllib.QuickSet<TypeParameter> allInstances = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
	
	/*
	public static Ocllib.QuickSet<TypeParameter> allInstances_ = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
	
	public static Ocllib.QuickSet<TypeParameter> allInstancesClosure = new Ocllib.QuickSet<TypeParameter>(TypeParameter.class);
		
	public static Ocllib.QuickSet<TypeParameter> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(TypeParameter.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.OrderedSet<TypeAccess> getBounds();
	
}
