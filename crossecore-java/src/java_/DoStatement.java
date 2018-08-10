package java_;
public interface DoStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<DoStatement> allInstances_ = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
	
		
	public static Ocllib.QuickSet<DoStatement> allInstances(){
		
		Ocllib.QuickSet<DoStatement> result = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
		result.addAll(DoStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<DoStatement> allInstances = new Ocllib.QuickSet<DoStatement>(DoStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getBody();
	void setBody(Statement value);
	
}
