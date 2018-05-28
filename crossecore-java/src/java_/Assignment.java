package java_;
public interface Assignment 
 extends Expression
{
	
	public static Ocllib.Set<Assignment> allInstances = new Ocllib.Set<Assignment>(Assignment.class);
	
	
	Expression getLeftHandSide();
	void setLeftHandSide(Expression value);
	AssignmentKind getOperator();
	void setOperator(AssignmentKind value);
	
	Expression getRightHandSide();
	void setRightHandSide(Expression value);
	
}
