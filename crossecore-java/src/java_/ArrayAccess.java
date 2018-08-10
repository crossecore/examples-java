package java_;
public interface ArrayAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayAccess> allInstances_ = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
	
		
	public static Ocllib.QuickSet<ArrayAccess> allInstances(){
		
		Ocllib.QuickSet<ArrayAccess> result = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
		result.addAll(ArrayAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ArrayAccess> allInstances = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
	
	
	Expression getArray();
	void setArray(Expression value);
	
	Expression getIndex();
	void setIndex(Expression value);
	
}
