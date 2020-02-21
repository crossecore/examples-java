package java_;
public interface Assignment 
 extends Expression
{
	
	public static com.crossecore.ocl.QuickSet<Assignment> allInstances_ = new com.crossecore.ocl.QuickSet<Assignment>(Assignment.class);
	
		
	public static com.crossecore.ocl.QuickSet<Assignment> allInstances(){
		
		com.crossecore.ocl.QuickSet<Assignment> result = new com.crossecore.ocl.QuickSet<Assignment>(Assignment.class);
		result.addAll(Assignment.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Assignment> allInstances = new com.crossecore.ocl.QuickSet<Assignment>(Assignment.class);
	
	
	Expression getLeftHandSide();
	void setLeftHandSide(Expression value);
	AssignmentKind getOperator();
	void setOperator(AssignmentKind value);
	
	Expression getRightHandSide();
	void setRightHandSide(Expression value);
	
}
