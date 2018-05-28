package java_;
public interface SingleVariableAccess 
 extends Expression
{
	
	public static Ocllib.Set<SingleVariableAccess> allInstances = new Ocllib.Set<SingleVariableAccess>(SingleVariableAccess.class);
	
	
	VariableDeclaration getVariable();
	void setVariable(VariableDeclaration value);
	
	Expression getQualifier();
	void setQualifier(Expression value);
	
}
