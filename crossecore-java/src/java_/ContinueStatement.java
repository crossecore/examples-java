package java_;
public interface ContinueStatement 
 extends Statement
{
	
	public static Ocllib.QuickSet<ContinueStatement> allInstances_ = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
	
		
	public static Ocllib.QuickSet<ContinueStatement> allInstances(){
		
		Ocllib.QuickSet<ContinueStatement> result = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
		result.addAll(ContinueStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ContinueStatement> allInstances = new Ocllib.QuickSet<ContinueStatement>(ContinueStatement.class);
	
	
	LabeledStatement getLabel();
	void setLabel(LabeledStatement value);
	
}
