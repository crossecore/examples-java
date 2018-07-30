package java_;
public interface SwitchStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<SwitchStatement> allInstances = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
	
	/*
	public static Ocllib.QuickSet<SwitchStatement> allInstances_ = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
	
	public static Ocllib.QuickSet<SwitchStatement> allInstancesClosure = new Ocllib.QuickSet<SwitchStatement>(SwitchStatement.class);
		
	public static Ocllib.QuickSet<SwitchStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(SwitchStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Expression getExpression();
	void setExpression(Expression value);
	Ocllib.OrderedSet<Statement> getStatements();
	
}
