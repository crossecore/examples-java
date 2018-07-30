package java_;
public interface BreakStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<BreakStatement> allInstances = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
	
	/*
	public static Ocllib.QuickSet<BreakStatement> allInstances_ = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
	
	public static Ocllib.QuickSet<BreakStatement> allInstancesClosure = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
		
	public static Ocllib.QuickSet<BreakStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(BreakStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
