package java_;
public interface ParenthesizedExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstances_ = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
		
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstances(){
		
		Ocllib.QuickSet<ParenthesizedExpression> result = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
		result.addAll(ParenthesizedExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ParenthesizedExpression> allInstances = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
