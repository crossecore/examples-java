package java_;
public interface ArrayAccess 
 extends Expression
{
	
	public static Ocllib.Set<ArrayAccess> allInstances = new Ocllib.Set<ArrayAccess>(ArrayAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
	Expression getIndex();
	void setIndex(Expression value);
	
}
