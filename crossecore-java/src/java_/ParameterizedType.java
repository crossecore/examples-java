package java_;
public interface ParameterizedType 
 extends Type
{
	
	public static Ocllib.QuickSet<ParameterizedType> allInstances = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
	
	/*
	public static Ocllib.QuickSet<ParameterizedType> allInstances_ = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
	
	public static Ocllib.QuickSet<ParameterizedType> allInstancesClosure = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
		
	public static Ocllib.QuickSet<ParameterizedType> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Type.allInstances_);
			allInstancesClosure.addAll(ParameterizedType.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
