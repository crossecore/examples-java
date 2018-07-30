package java_;
public interface ArrayAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<ArrayAccess> allInstances = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
	
	/*
	public static Ocllib.QuickSet<ArrayAccess> allInstances_ = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
	
	public static Ocllib.QuickSet<ArrayAccess> allInstancesClosure = new Ocllib.QuickSet<ArrayAccess>(ArrayAccess.class);
		
	public static Ocllib.QuickSet<ArrayAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ArrayAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getArray();
	void setArray(Expression value);
	
	Expression getIndex();
	void setIndex(Expression value);
	
}
