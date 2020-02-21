package java_;
public interface InstanceofExpression 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<InstanceofExpression> allInstances_ = new com.crossecore.ocl.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
		
	public static com.crossecore.ocl.QuickSet<InstanceofExpression> allInstances(){
		
		com.crossecore.ocl.QuickSet<InstanceofExpression> result = new com.crossecore.ocl.QuickSet<InstanceofExpression>(InstanceofExpression.class);
		result.addAll(InstanceofExpression.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<InstanceofExpression> allInstances = new com.crossecore.ocl.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
	
	TypeAccess getRightOperand();
	void setRightOperand(TypeAccess value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	
}
