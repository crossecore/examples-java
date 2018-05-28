package java_;
public interface TypeAccess 
 extends Expression,NamespaceAccess
{
	
	public static Ocllib.Set<TypeAccess> allInstances = new Ocllib.Set<TypeAccess>(TypeAccess.class);
	
	
	Type getType();
	void setType(Type value);
	
	NamespaceAccess getQualifier();
	void setQualifier(NamespaceAccess value);
	
}
