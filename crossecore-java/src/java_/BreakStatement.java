package java_;
public interface BreakStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<BreakStatement> allInstances_ = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
	
		
	public static Ocllib.QuickSet<BreakStatement> allInstances(){
		
		Ocllib.QuickSet<BreakStatement> result = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
		result.addAll(BreakStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<BreakStatement> allInstances = new Ocllib.QuickSet<BreakStatement>(BreakStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
