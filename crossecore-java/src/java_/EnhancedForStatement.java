package java_;
public interface EnhancedForStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<EnhancedForStatement> allInstances = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
	/*
	public static Ocllib.QuickSet<EnhancedForStatement> allInstances_ = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
	public static Ocllib.QuickSet<EnhancedForStatement> allInstancesClosure = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
		
	public static Ocllib.QuickSet<EnhancedForStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(EnhancedForStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Statement getBody();
	void setBody(Statement value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	SingleVariableDeclaration getParameter();
	void setParameter(SingleVariableDeclaration value);
	
}
