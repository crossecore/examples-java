package java_;
public interface InstanceofExpression 
 extends Expression
{
	
	public static Ocllib.QuickSet<InstanceofExpression> allInstances = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
	/*
	public static Ocllib.QuickSet<InstanceofExpression> allInstances_ = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
	
	public static Ocllib.QuickSet<InstanceofExpression> allInstancesClosure = new Ocllib.QuickSet<InstanceofExpression>(InstanceofExpression.class);
		
	public static Ocllib.QuickSet<InstanceofExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(InstanceofExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getRightOperand();
	void setRightOperand(TypeAccess value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	
}
