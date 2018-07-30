package java_;
public interface ThisExpression 
 extends AbstractTypeQualifiedExpression
{
	
	public static Ocllib.QuickSet<ThisExpression> allInstances = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
	
	/*
	public static Ocllib.QuickSet<ThisExpression> allInstances_ = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
	
	public static Ocllib.QuickSet<ThisExpression> allInstancesClosure = new Ocllib.QuickSet<ThisExpression>(ThisExpression.class);
		
	public static Ocllib.QuickSet<ThisExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractTypeQualifiedExpression.allInstances_);
			allInstancesClosure.addAll(ThisExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
}
