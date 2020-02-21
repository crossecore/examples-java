package java_;
public interface CastExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<CastExpression> allInstances_ = new com.crossecore.ocl.QuickSet<CastExpression>(CastExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<CastExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<CastExpression> result = new com.crossecore.ocl.QuickSet<CastExpression>(CastExpression.class);
		result.addAll(CastExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<CastExpression> allInstances = new com.crossecore.ocl.QuickSet<CastExpression>(CastExpression.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	TypeAccess getType();
	void setType(TypeAccess value);
	
}
