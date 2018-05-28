package java_;
public interface CharacterLiteral 
 extends Expression
{
	
	public static Ocllib.Set<CharacterLiteral> allInstances = new Ocllib.Set<CharacterLiteral>(CharacterLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
