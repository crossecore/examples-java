package java_;
public interface IfStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<IfStatement> allInstances_ = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
	
		
	public static Ocllib.QuickSet<IfStatement> allInstances(){
		
		Ocllib.QuickSet<IfStatement> result = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
		result.addAll(IfStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<IfStatement> allInstances = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getThenStatement();
	void setThenStatement(Statement value);
	
	Statement getElseStatement();
	void setElseStatement(Statement value);
	
}
