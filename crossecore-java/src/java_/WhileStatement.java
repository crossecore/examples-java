package java_;
public interface WhileStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<WhileStatement> allInstances_ = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
	
		
	public static Ocllib.QuickSet<WhileStatement> allInstances(){
		
		Ocllib.QuickSet<WhileStatement> result = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
		result.addAll(WhileStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<WhileStatement> allInstances = new Ocllib.QuickSet<WhileStatement>(WhileStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
