package java_;
public interface IfStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<IfStatement> allInstances = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
	
	/*
	public static Ocllib.QuickSet<IfStatement> allInstances_ = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
	
	public static Ocllib.QuickSet<IfStatement> allInstancesClosure = new Ocllib.QuickSet<IfStatement>(IfStatement.class);
		
	public static Ocllib.QuickSet<IfStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(IfStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getThenStatement();
	void setThenStatement(Statement value);
	
	Statement getElseStatement();
	void setElseStatement(Statement value);
	
}
