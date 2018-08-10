package java_;
public interface CatchClause 
 extends Statement
{
	
	public static Ocllib.QuickSet<CatchClause> allInstances_ = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
	
		
	public static Ocllib.QuickSet<CatchClause> allInstances(){
		
		Ocllib.QuickSet<CatchClause> result = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
		result.addAll(CatchClause.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<CatchClause> allInstances = new Ocllib.QuickSet<CatchClause>(CatchClause.class);
	
	
	SingleVariableDeclaration getException();
	void setException(SingleVariableDeclaration value);
	
	Block getBody();
	void setBody(Block value);
	
}
