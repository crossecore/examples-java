package java_;
public interface SingleVariableDeclaration 
 extends VariableDeclaration
{
	
	public static Ocllib.Set<SingleVariableDeclaration> allInstances = new Ocllib.Set<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
	AbstractMethodDeclaration getMethodDeclaration();
	void setMethodDeclaration(AbstractMethodDeclaration value);
	
	CatchClause getCatchClause();
	void setCatchClause(CatchClause value);
	
	EnhancedForStatement getEnhancedForStatement();
	void setEnhancedForStatement(EnhancedForStatement value);
	
}
