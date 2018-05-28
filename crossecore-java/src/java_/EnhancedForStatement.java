package java_;
public interface EnhancedForStatement 
 extends Statement
{
	
	public static Ocllib.Set<EnhancedForStatement> allInstances = new Ocllib.Set<EnhancedForStatement>(EnhancedForStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	SingleVariableDeclaration getParameter();
	void setParameter(SingleVariableDeclaration value);
	
}
