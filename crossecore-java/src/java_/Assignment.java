package java_;
public interface Assignment 
 extends Expression
{
	
	public static Ocllib.QuickSet<Assignment> allInstances = new Ocllib.QuickSet<Assignment>(Assignment.class);
	
	/*
	public static Ocllib.QuickSet<Assignment> allInstances_ = new Ocllib.QuickSet<Assignment>(Assignment.class);
	
	public static Ocllib.QuickSet<Assignment> allInstancesClosure = new Ocllib.QuickSet<Assignment>(Assignment.class);
		
	public static Ocllib.QuickSet<Assignment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(Assignment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getLeftHandSide();
	void setLeftHandSide(Expression value);
	AssignmentKind getOperator();
	void setOperator(AssignmentKind value);
	
	Expression getRightHandSide();
	void setRightHandSide(Expression value);
	
}
