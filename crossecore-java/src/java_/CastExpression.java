package java_;
public interface CastExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<CastExpression> allInstances = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
	
	/*
	public static Ocllib.QuickSet<CastExpression> allInstances_ = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
	
	public static Ocllib.QuickSet<CastExpression> allInstancesClosure = new Ocllib.QuickSet<CastExpression>(CastExpression.class);
		
	public static Ocllib.QuickSet<CastExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(CastExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
