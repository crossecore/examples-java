package java_;
public interface SwitchStatement 
 extends Statement
{
	
	public static Ocllib.Set<SwitchStatement> allInstances = new Ocllib.Set<SwitchStatement>(SwitchStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Statement> getStatements();
	
}
