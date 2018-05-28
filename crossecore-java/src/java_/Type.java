package java_;
public interface Type 
 extends NamedElement
{
	
	public static Ocllib.Set<Type> allInstances = new Ocllib.Set<Type>(Type.class);
	
	Ocllib.Set<TypeAccess> getUsagesInTypeAccess();
	
}
