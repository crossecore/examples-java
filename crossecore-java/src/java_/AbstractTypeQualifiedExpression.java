package java_;
public interface AbstractTypeQualifiedExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances_ = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
		
	public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances(){
		
		Ocllib.QuickSet<AbstractTypeQualifiedExpression> result = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
		result.addAll(AbstractTypeQualifiedExpression.allInstances_);
		
		result.addAll(ThisExpression.allInstances_);
		result.addAll(SuperFieldAccess.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AbstractTypeQualifiedExpression> allInstances = new Ocllib.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
