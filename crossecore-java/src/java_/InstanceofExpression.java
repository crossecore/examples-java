package java_;
public interface InstanceofExpression 
 extends Expression
{
	
	public static Ocllib.Set<InstanceofExpression> allInstances = new Ocllib.Set<InstanceofExpression>(InstanceofExpression.class);
	
	
	TypeAccess getRightOperand();
	void setRightOperand(TypeAccess value);
	
	Expression getLeftOperand();
	void setLeftOperand(Expression value);
	
}
