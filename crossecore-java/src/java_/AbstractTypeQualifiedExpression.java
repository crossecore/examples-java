package java_;
public interface AbstractTypeQualifiedExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
	/*
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances_ = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstancesClosure = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
		
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractTypeQualifiedExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
