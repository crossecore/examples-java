package java_;
public interface SwitchStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<SwitchStatement> allInstances_ = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
	
		
	public static Ocllib.QuickSet<SwitchStatement> allInstances(){
		
		Ocllib.QuickSet<SwitchStatement> result = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
		result.addAll(SwitchStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SwitchStatement> allInstances = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Statement> getStatements();
	
}
