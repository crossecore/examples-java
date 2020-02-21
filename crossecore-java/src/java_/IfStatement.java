package java_;
public interface IfStatement 
 extends Statement
{
	
	public static com.crossecore.ocl.QuickSet<IfStatement> allInstances_ = new com.crossecore.ocl.QuickSet<IfStatement>(IfStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<IfStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<IfStatement> result = new com.crossecore.ocl.QuickSet<IfStatement>(IfStatement.class);
		result.addAll(IfStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<IfStatement> allInstances = new com.crossecore.ocl.QuickSet<IfStatement>(IfStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getThenStatement();
	void setThenStatement(Statement value);
	
	Statement getElseStatement();
	void setElseStatement(Statement value);
	
}
