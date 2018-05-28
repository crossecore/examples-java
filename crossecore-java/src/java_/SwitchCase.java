package java_;
public interface SwitchCase 
 extends Statement
{
	
	public static Ocllib.Set<SwitchCase> allInstances = new Ocllib.Set<SwitchCase>(SwitchCase.class);
	
	boolean isDefault();
	void setDefault(boolean value);
	//public boolean isDefault();
	
	Expression getExpression();
	void setExpression(Expression value);
	
}
