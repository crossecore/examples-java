package java_;
public interface ArrayLengthAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstances = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
	/*
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstances_ = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
	
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstancesClosure = new Ocllib.QuickSet<ArrayLengthAccess>(ArrayLengthAccess.class);
		
	public static Ocllib.QuickSet<ArrayLengthAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ArrayLengthAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getArray();
	void setArray(Expression value);
	
}
