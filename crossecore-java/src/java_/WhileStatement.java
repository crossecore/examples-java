package java_;
public interface WhileStatement 
 extends Statement
{
	
	public static Ocllib.Set<WhileStatement> allInstances = new Ocllib.Set<WhileStatement>(WhileStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
