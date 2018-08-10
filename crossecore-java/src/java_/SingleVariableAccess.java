package java_;
public interface SingleVariableAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<SingleVariableAccess> allInstances_ = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
		
	public static Ocllib.QuickSet<SingleVariableAccess> allInstances(){
		
		Ocllib.QuickSet<SingleVariableAccess> result = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
		result.addAll(SingleVariableAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SingleVariableAccess> allInstances = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
	
	VariableDeclaration getVariable();
	void setVariable(VariableDeclaration value);
	
	Expression getQualifier();
	void setQualifier(Expression value);
	
}
