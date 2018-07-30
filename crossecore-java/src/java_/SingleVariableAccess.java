package java_;
public interface SingleVariableAccess 
 extends Expression
{
	
	public static Ocllib.QuickSet<SingleVariableAccess> allInstances = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
	/*
	public static Ocllib.QuickSet<SingleVariableAccess> allInstances_ = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
	
	public static Ocllib.QuickSet<SingleVariableAccess> allInstancesClosure = new Ocllib.QuickSet<SingleVariableAccess>(SingleVariableAccess.class);
		
	public static Ocllib.QuickSet<SingleVariableAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(SingleVariableAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	VariableDeclaration getVariable();
	void setVariable(VariableDeclaration value);
	
	Expression getQualifier();
	void setQualifier(Expression value);
	
}
