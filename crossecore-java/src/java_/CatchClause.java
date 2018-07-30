package java_;
public interface CatchClause 
 extends Statement
{
	
	public static Ocllib.QuickSet<CatchClause> allInstances = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
	
	/*
	public static Ocllib.QuickSet<CatchClause> allInstances_ = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
	
	public static Ocllib.QuickSet<CatchClause> allInstancesClosure = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
		
	public static Ocllib.QuickSet<CatchClause> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(CatchClause.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	SingleVariableDeclaration getException();
	void setException(SingleVariableDeclaration value);
	
	Block getBody();
	void setBody(Block value);
	
}
