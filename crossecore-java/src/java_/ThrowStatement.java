package java_;
public interface ThrowStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ThrowStatement> allInstances = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
	
	/*
	public static Ocllib.QuickSet<ThrowStatement> allInstances_ = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
	
	public static Ocllib.QuickSet<ThrowStatement> allInstancesClosure = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
		
	public static Ocllib.QuickSet<ThrowStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(ThrowStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
