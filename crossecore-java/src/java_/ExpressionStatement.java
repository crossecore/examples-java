package java_;
public interface ExpressionStatement 
 extends Statement
{
	
	public static Ocllib.Set<ExpressionStatement> allInstances = new Ocllib.Set<ExpressionStatement>(ExpressionStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
