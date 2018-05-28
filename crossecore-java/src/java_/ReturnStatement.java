package java_;
public interface ReturnStatement 
 extends Statement
{
	
	public static Ocllib.Set<ReturnStatement> allInstances = new Ocllib.Set<ReturnStatement>(ReturnStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
