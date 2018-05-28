package java_;
public interface AssertStatement 
 extends Statement
{
	
	public static Ocllib.Set<AssertStatement> allInstances = new Ocllib.Set<AssertStatement>(AssertStatement.class);
	
	
	Expression getMessage();
	void setMessage(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
