package java_;
public interface SynchronizedStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<SynchronizedStatement> allInstances_ = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
		
	public static Ocllib.QuickSet<SynchronizedStatement> allInstances(){
		
		Ocllib.QuickSet<SynchronizedStatement> result = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
		result.addAll(SynchronizedStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SynchronizedStatement> allInstances = new Ocllib.QuickSet<SynchronizedStatement>(SynchronizedStatement.class);
	
	
	Block getBody();
	void setBody(Block value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
