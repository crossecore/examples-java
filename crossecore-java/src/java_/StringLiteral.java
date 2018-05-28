package java_;
public interface StringLiteral 
 extends Expression
{
	
	public static Ocllib.Set<StringLiteral> allInstances = new Ocllib.Set<StringLiteral>(StringLiteral.class);
	
	java.lang.String getEscapedValue();
	void setEscapedValue(java.lang.String value);
	
}
