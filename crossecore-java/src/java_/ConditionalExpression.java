package java_;
public interface ConditionalExpression 
 extends Expression
{
	
	public static Ocllib.Set<ConditionalExpression> allInstances = new Ocllib.Set<ConditionalExpression>(ConditionalExpression.class);
	
	
	Expression getElseExpression();
	void setElseExpression(Expression value);
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Expression getThenExpression();
	void setThenExpression(Expression value);
	
}
