package java_;
public interface InstanceofExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<InstanceofExpression> allInstances_ = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
		
	public static Ocllib.QuickSet<InstanceofExpression> allInstances(){
		
		Ocllib.QuickSet<InstanceofExpression> result = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
		result.addAll(InstanceofExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<InstanceofExpression> allInstances = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
	
	TypeAccess getRightOperand();
	void setRightOperand(TypeAccess value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	
}
