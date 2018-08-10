package java_;
public interface EnhancedForStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<EnhancedForStatement> allInstances_ = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
		
	public static Ocllib.QuickSet<EnhancedForStatement> allInstances(){
		
		Ocllib.QuickSet<EnhancedForStatement> result = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
		result.addAll(EnhancedForStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<EnhancedForStatement> allInstances = new Ocllib.QuickSet<EnhancedForStatement>(EnhancedForStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	SingleVariableDeclaration getParameter();
	void setParameter(SingleVariableDeclaration value);
	
}
