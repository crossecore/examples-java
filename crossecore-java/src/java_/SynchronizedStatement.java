package java_;
public interface SynchronizedStatement 
 extends Statement
{
	
	public static Ocllib.Set<SynchronizedStatement> allInstances = new Ocllib.Set<SynchronizedStatement>(SynchronizedStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
