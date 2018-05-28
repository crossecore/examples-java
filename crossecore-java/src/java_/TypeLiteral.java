package java_;
public interface TypeLiteral 
 extends Expression
{
	
	public static Ocllib.Set<TypeLiteral> allInstances = new Ocllib.Set<TypeLiteral>(TypeLiteral.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
