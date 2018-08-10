package java_;
public interface LabeledStatement 
 extends NamedElement,Statement
{
	
	public static Ocllib.QuickSet<LabeledStatement> allInstances_ = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
	
		
	public static Ocllib.QuickSet<LabeledStatement> allInstances(){
		
		Ocllib.QuickSet<LabeledStatement> result = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
		result.addAll(LabeledStatement.allInstances_);
		
		result.addAll(UnresolvedLabeledStatement.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<LabeledStatement> allInstances = new Ocllib.QuickSet<LabeledStatement>(LabeledStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	Ocllib.Set<BreakStatement> getUsagesInBreakStatements();
	Ocllib.Set<ContinueStatement> getUsagesInContinueStatements();
	
}
