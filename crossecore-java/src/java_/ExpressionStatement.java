package java_;
public interface ExpressionStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ExpressionStatement> allInstances = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
	/*
	public static Ocllib.QuickSet<ExpressionStatement> allInstances_ = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
	public static Ocllib.QuickSet<ExpressionStatement> allInstancesClosure = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
		
	public static Ocllib.QuickSet<ExpressionStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(ExpressionStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
