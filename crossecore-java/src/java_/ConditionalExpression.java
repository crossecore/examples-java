package java_;
public interface ConditionalExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<ConditionalExpression> allInstances = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
	/*
	public static Ocllib.QuickSet<ConditionalExpression> allInstances_ = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
	
	public static Ocllib.QuickSet<ConditionalExpression> allInstancesClosure = new Ocllib.QuickSet<ConditionalExpression>(ConditionalExpression.class);
		
	public static Ocllib.QuickSet<ConditionalExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ConditionalExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getElseExpression();
	void setElseExpression(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Expression getThenExpression();
	void setThenExpression(Expression value);
	
}
