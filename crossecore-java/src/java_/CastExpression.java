package java_;
public interface CastExpression 
 extends Expression
{
	
	public static Ocllib.Set<CastExpression> allInstances = new Ocllib.Set<CastExpression>(CastExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
