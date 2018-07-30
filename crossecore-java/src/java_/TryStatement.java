package java_;
public interface TryStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<TryStatement> allInstances = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
	
	/*
	public static Ocllib.QuickSet<TryStatement> allInstances_ = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
	
	public static Ocllib.QuickSet<TryStatement> allInstancesClosure = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
		
	public static Ocllib.QuickSet<TryStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(TryStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Block getBody();
	void setBody(Block value);
	
	Block getFinally();
	void setFinally(Block value);
	Ocllib.OrderedSet<CatchClause> getCatchClauses();
	
}
