package java_;
public interface ContinueStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ContinueStatement> allInstances = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
	
	/*
	public static Ocllib.QuickSet<ContinueStatement> allInstances_ = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
	
	public static Ocllib.QuickSet<ContinueStatement> allInstancesClosure = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
		
	public static Ocllib.QuickSet<ContinueStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(ContinueStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
