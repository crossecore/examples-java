package java_;
public interface ForStatement 
 extends Statement
{
	
	public static Ocllib.Set<ForStatement> allInstances = new Ocllib.Set<ForStatement>(ForStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Expression> getUpdaters();
	Ocllib.OrderedSet<Expression> getInitializers();
	
	Statement getBody();
	void setBody(Statement value);
	
}
