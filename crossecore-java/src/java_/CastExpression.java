package java_;
public interface CastExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<CastExpression> allInstances_ = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
	
		
	public static Ocllib.QuickSet<CastExpression> allInstances(){
		
		Ocllib.QuickSet<CastExpression> result = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
		result.addAll(CastExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<CastExpression> allInstances = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
