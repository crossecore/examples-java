package java_;
public interface LabeledStatement 
 extends NamedElement,Statement
{
	
	public static Ocllib.Set<LabeledStatement> allInstances = new Ocllib.Set<LabeledStatement>(LabeledStatement.class);
	
	
	Statement getBody();
	void setBody(Statement value);
	Ocllib.Set<BreakStatement> getUsagesInBreakStatements();
	Ocllib.Set<ContinueStatement> getUsagesInContinueStatements();
	
}
