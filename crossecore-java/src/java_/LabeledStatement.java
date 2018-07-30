package java_;
public interface LabeledStatement 
 extends NamedElement,Statement
{
	
	public static Ocllib.QuickSet<LabeledStatement> allInstances = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
	
	/*
	public static Ocllib.QuickSet<LabeledStatement> allInstances_ = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
	
	public static Ocllib.QuickSet<LabeledStatement> allInstancesClosure = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
		
	public static Ocllib.QuickSet<LabeledStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(LabeledStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Statement getBody();
	void setBody(Statement value);
	Ocllib.Set<BreakStatement> getUsagesInBreakStatements();
	Ocllib.Set<ContinueStatement> getUsagesInContinueStatements();
	
}
