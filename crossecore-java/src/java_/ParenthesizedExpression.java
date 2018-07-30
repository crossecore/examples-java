package java_;
public interface ParenthesizedExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstances = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
	/*
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstances_ = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
	
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstancesClosure = new Ocllib.QuickSet<ParenthesizedExpression>(ParenthesizedExpression.class);
		
	public static Ocllib.QuickSet<ParenthesizedExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(ParenthesizedExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
