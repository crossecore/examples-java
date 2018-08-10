package java_;
public interface ArrayLengthAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstances_ = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
		
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstances(){
		
		Ocllib.QuickSet<ArrayLengthAccess> result = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
		result.addAll(ArrayLengthAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ArrayLengthAccess> allInstances = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
}
