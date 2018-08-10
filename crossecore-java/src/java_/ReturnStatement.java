package java_;
public interface ReturnStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ReturnStatement> allInstances_ = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
	
		
	public static Ocllib.QuickSet<ReturnStatement> allInstances(){
		
		Ocllib.QuickSet<ReturnStatement> result = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
		result.addAll(ReturnStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ReturnStatement> allInstances = new Ocllib.QuickSet<ReturnStatement>(ReturnStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
