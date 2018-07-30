package java_;
public interface SwitchCase 
 extends Statement
{
	
	public static Ocllib.QuickSet<SwitchCase> allInstances = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
	
	/*
	public static Ocllib.QuickSet<SwitchCase> allInstances_ = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
	
	public static Ocllib.QuickSet<SwitchCase> allInstancesClosure = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
		
	public static Ocllib.QuickSet<SwitchCase> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(SwitchCase.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	boolean isDefault();
	void setDefault(boolean value);
	//public boolean isDefault();
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
