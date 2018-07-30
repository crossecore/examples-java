package java_;
public interface SingleVariableDeclaration 
 extends VariableDeclaration
{
	
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances_ = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstancesClosure = new Ocllib.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
		
	public static Ocllib.QuickSet<SingleVariableDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
			allInstancesClosure.addAll(SingleVariableDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
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
