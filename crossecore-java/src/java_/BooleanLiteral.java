package java_;
public interface BooleanLiteral 
 extends Expression
{
	
	public static Ocllib.Set<BooleanLiteral> allInstances = new Ocllib.Set<BooleanLiteral>(BooleanLiteral.class);
	
	boolean isValue();
	void setValue(boolean value);
	//public boolean isValue();
	
}
