package java_;
public interface ThrowStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ThrowStatement> allInstances_ = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
	
		
	public static Ocllib.QuickSet<ThrowStatement> allInstances(){
		
		Ocllib.QuickSet<ThrowStatement> result = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
		result.addAll(ThrowStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ThrowStatement> allInstances = new Ocllib.QuickSet<ThrowStatement>(ThrowStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
