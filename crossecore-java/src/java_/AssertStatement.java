package java_;
public interface AssertStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<AssertStatement> allInstances_ = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
	
		
	public static Ocllib.QuickSet<AssertStatement> allInstances(){
		
		Ocllib.QuickSet<AssertStatement> result = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
		result.addAll(AssertStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AssertStatement> allInstances = new Ocllib.QuickSet<AssertStatement>(AssertStatement.class);
	
	
	Expression getMessage();
	void setMessage(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
