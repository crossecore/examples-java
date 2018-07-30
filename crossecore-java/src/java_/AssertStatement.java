package java_;
public interface AssertStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<AssertStatement> allInstances = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
	
	/*
	public static Ocllib.QuickSet<AssertStatement> allInstances_ = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
	
	public static Ocllib.QuickSet<AssertStatement> allInstancesClosure = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
		
	public static Ocllib.QuickSet<AssertStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(AssertStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getMessage();
	void setMessage(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
