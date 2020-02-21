package java_;
public interface ThisExpression 
 extends AbstractTypeQualifiedExpression
{
	
	public static com.crossecore.ocl.QuickSet<ThisExpression> allInstances_ = new com.crossecore.ocl.QuickSet<ThisExpression>(ThisExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<ThisExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<ThisExpression> result = new com.crossecore.ocl.QuickSet<ThisExpression>(ThisExpression.class);
		result.addAll(ThisExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ThisExpression> allInstances = new com.crossecore.ocl.QuickSet<ThisExpression>(ThisExpression.class);
	
	
}
