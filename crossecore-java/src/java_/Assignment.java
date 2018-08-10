package java_;
public interface Assignment 
 extends Expression
{
	
	public static Ocllib.QuickSet<Assignment> allInstances_ = new Ocllib.QuickSet<Assignment>(Assignment.class);
	
		
	public static Ocllib.QuickSet<Assignment> allInstances(){
		
		Ocllib.QuickSet<Assignment> result = new Ocllib.QuickSet<Assignment>(Assignment.class);
		result.addAll(Assignment.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Assignment> allInstances = new Ocllib.QuickSet<Assignment>(Assignment.class);
	
	
	Expression getLeftHandSide();
	void setLeftHandSide(Expression value);
	AssignmentKind getOperator();
	void setOperator(AssignmentKind value);
	
	Expression getRightHandSide();
	void setRightHandSide(Expression value);
	
}
