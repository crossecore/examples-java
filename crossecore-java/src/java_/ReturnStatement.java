package java_;
public interface ReturnStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ReturnStatement> allInstances = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
	
	/*
	public static Ocllib.QuickSet<ReturnStatement> allInstances_ = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
	
	public static Ocllib.QuickSet<ReturnStatement> allInstancesClosure = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
		
	public static Ocllib.QuickSet<ReturnStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(ReturnStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
