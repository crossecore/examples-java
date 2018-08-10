package java_;
public interface ThisExpression 
 extends AbstractTypeQualifiedExpression
{
	
	public static Ocllib.QuickSet<ThisExpression> allInstances_ = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
	
		
	public static Ocllib.QuickSet<ThisExpression> allInstances(){
		
		Ocllib.QuickSet<ThisExpression> result = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
		result.addAll(ThisExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ThisExpression> allInstances = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
	
	
}
