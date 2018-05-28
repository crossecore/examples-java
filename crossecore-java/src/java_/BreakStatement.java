package java_;
public interface BreakStatement 
 extends Statement
{
	
	public static Ocllib.Set<BreakStatement> allInstances = new Ocllib.Set<BreakStatement>(BreakStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
