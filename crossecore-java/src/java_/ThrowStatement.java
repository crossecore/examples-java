package java_;
public interface ThrowStatement 
 extends Statement
{
	
	public static Ocllib.Set<ThrowStatement> allInstances = new Ocllib.Set<ThrowStatement>(ThrowStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
