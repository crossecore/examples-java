package java_;
public interface ParameterizedType 
 extends Type
{
	
	public static Ocllib.Set<ParameterizedType> allInstances = new Ocllib.Set<ParameterizedType>(ParameterizedType.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<TypeAccess> getTypeArguments();
	
}
