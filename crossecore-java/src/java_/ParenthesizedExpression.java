package java_;
public interface ParenthesizedExpression 
 extends Expression
{
	
	public static Ocllib.Set<ParenthesizedExpression> allInstances = new Ocllib.Set<ParenthesizedExpression>(ParenthesizedExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
