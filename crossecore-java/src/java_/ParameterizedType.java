package java_;
public interface ParameterizedType 
 extends Type
{
	
	public static Ocllib.QuickSet<ParameterizedType> allInstances_ = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
	
		
	public static Ocllib.QuickSet<ParameterizedType> allInstances(){
		
		Ocllib.QuickSet<ParameterizedType> result = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
		result.addAll(ParameterizedType.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ParameterizedType> allInstances = new Ocllib.QuickSet<ParameterizedType>(ParameterizedType.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
