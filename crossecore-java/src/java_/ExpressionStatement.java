package java_;
public interface ExpressionStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ExpressionStatement> allInstances_ = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
		
	public static Ocllib.QuickSet<ExpressionStatement> allInstances(){
		
		Ocllib.QuickSet<ExpressionStatement> result = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
		result.addAll(ExpressionStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ExpressionStatement> allInstances = new Ocllib.QuickSet<ExpressionStatement>(ExpressionStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
