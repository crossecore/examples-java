package java_;
public interface WhileStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<WhileStatement> allInstances = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
	
	/*
	public static Ocllib.QuickSet<WhileStatement> allInstances_ = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
	
	public static Ocllib.QuickSet<WhileStatement> allInstancesClosure = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
		
	public static Ocllib.QuickSet<WhileStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(WhileStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
