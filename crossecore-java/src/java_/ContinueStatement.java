package java_;
public interface ContinueStatement 
 extends Statement
{
	
	public static Ocllib.Set<ContinueStatement> allInstances = new Ocllib.Set<ContinueStatement>(ContinueStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
