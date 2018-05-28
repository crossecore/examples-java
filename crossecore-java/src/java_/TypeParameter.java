package java_;
public interface TypeParameter 
 extends Type
{
	
	public static Ocllib.Set<TypeParameter> allInstances = new Ocllib.Set<TypeParameter>(TypeParameter.class);
	
	Ocllib.OrderedSet<TypeAccess> getBounds();
	
}
