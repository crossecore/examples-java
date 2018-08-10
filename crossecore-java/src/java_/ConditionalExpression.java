package java_;
public interface ConditionalExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<ConditionalExpression> allInstances_ = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
		
	public static Ocllib.QuickSet<ConditionalExpression> allInstances(){
		
		Ocllib.QuickSet<ConditionalExpression> result = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
		result.addAll(ConditionalExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ConditionalExpression> allInstances = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
	
	Expression getElseExpression();
	void setElseExpression(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Expression getThenExpression();
	void setThenExpression(Expression value);
	
}
