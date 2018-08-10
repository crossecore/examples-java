package java_;
public interface SingleVariableDeclaration 
 extends VariableDeclaration
{
	
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances_ = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
		
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances(){
		
		Ocllib.QuickSet<SingleVariableDeclaration> result = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
		result.addAll(SingleVariableDeclaration.allInstances_);
		
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
	
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
