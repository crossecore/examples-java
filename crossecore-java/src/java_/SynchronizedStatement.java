package java_;
public interface SynchronizedStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<SynchronizedStatement> allInstances = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
	/*
	public static Ocllib.QuickSet<SynchronizedStatement> allInstances_ = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
	public static Ocllib.QuickSet<SynchronizedStatement> allInstancesClosure = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
		
	public static Ocllib.QuickSet<SynchronizedStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(SynchronizedStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Block getBody();
	void setBody(Block value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
