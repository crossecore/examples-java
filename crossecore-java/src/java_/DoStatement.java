package java_;
public interface DoStatement 
 extends Statement
{
	
	public static Ocllib.Set<DoStatement> allInstances = new Ocllib.Set<DoStatement>(DoStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
