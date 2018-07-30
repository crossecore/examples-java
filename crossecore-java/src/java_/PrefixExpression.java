package java_;
public interface PrefixExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<PrefixExpression> allInstances = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
	
	/*
	public static Ocllib.QuickSet<PrefixExpression> allInstances_ = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
	
	public static Ocllib.QuickSet<PrefixExpression> allInstancesClosure = new Ocllib.QuickSet<PrefixExpression>(PrefixExpression.class);
		
	public static Ocllib.QuickSet<PrefixExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(PrefixExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	PrefixExpressionKind getOperator();
	void setOperator(PrefixExpressionKind value);
	
	Expression getOperand();
	void setOperand(Expression value);
	
}
