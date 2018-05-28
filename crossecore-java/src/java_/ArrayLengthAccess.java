package java_;
public interface ArrayLengthAccess 
 extends Expression
{
	
	public static Ocllib.Set<ArrayLengthAccess> allInstances = new Ocllib.Set<ArrayLengthAccess>(ArrayLengthAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
}
