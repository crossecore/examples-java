package java_;
public interface AbstractTypeQualifiedExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression> allInstances_ = new com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression> result = new com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
		result.addAll(AbstractTypeQualifiedExpression.allInstances_);
		
		result.addAll(SuperFieldAccess.allInstances_);
		result.addAll(SuperMethodInvocation.allInstances_);
		result.addAll(ThisExpression.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression> allInstances = new com.crossecore.ocl.QuickSet<AbstractTypeQualifiedExpression>(AbstractTypeQualifiedExpression.class);
	
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
