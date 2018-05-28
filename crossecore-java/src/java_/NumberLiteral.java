package java_;
public interface NumberLiteral 
 extends Expression
{
	
	public static Ocllib.Set<NumberLiteral> allInstances = new Ocllib.Set<NumberLiteral>(NumberLiteral.class);
	
	java.lang.String getTokenValue();
	void setTokenValue(java.lang.String value);
	
}
