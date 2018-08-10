package java_;
public interface SwitchCase 
 extends Statement
{
	
	public static Ocllib.QuickSet<SwitchCase> allInstances_ = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
	
		
	public static Ocllib.QuickSet<SwitchCase> allInstances(){
		
		Ocllib.QuickSet<SwitchCase> result = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
		result.addAll(SwitchCase.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SwitchCase> allInstances = new Ocllib.QuickSet<SwitchCase>(SwitchCase.class);
	
	boolean isDefault();
	void setDefault(boolean value);
	//public boolean isDefault();
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
