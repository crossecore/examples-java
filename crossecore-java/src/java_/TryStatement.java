package java_;
public interface TryStatement 
 extends Statement
{
	
	public static Ocllib.Set<TryStatement> allInstances = new Ocllib.Set<TryStatement>(TryStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Block getFinally();
	void setFinally(Block value);
	Ocllib.OrderedSet<CatchClause> getCatchClauses();
	
}
