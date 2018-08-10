package java_;
public interface TryStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<TryStatement> allInstances_ = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
	
		
	public static Ocllib.QuickSet<TryStatement> allInstances(){
		
		Ocllib.QuickSet<TryStatement> result = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
		result.addAll(TryStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TryStatement> allInstances = new Ocllib.QuickSet<TryStatement>(TryStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Block getFinally();
	void setFinally(Block value);
	Ocllib.OrderedSet<CatchClause> getCatchClauses();
	
}
