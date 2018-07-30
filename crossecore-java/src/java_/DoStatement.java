package java_;
public interface DoStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<DoStatement> allInstances = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
	
	/*
	public static Ocllib.QuickSet<DoStatement> allInstances_ = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
	
	public static Ocllib.QuickSet<DoStatement> allInstancesClosure = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
		
	public static Ocllib.QuickSet<DoStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(DoStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
