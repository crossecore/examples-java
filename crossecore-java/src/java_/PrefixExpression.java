package java_;
public interface PrefixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<PrefixExpression> allInstances_ = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
	
		
	public static Ocllib.QuickSet<PrefixExpression> allInstances(){
		
		Ocllib.QuickSet<PrefixExpression> result = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
		result.addAll(PrefixExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PrefixExpression> allInstances = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
	
	PrefixExpressionKind getOperator();
	void setOperator(PrefixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
