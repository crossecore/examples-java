package java_;
public interface CatchClause 
 extends Statement
{
	
	public static Ocllib.Set<CatchClause> allInstances = new Ocllib.Set<CatchClause>(CatchClause.class);
	
	
	SingleVariableDeclaration getException();
	void setException(SingleVariableDeclaration value);
	
	Block getBody();
	void setBody(Block value);
	
}
