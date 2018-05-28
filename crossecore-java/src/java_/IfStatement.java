package java_;
public interface IfStatement 
 extends Statement
{
	
	public static Ocllib.Set<IfStatement> allInstances = new Ocllib.Set<IfStatement>(IfStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	
	Statement getThenStatement();
	void setThenStatement(Statement value);
	
	Statement getElseStatement();
	void setElseStatement(Statement value);
	
}
