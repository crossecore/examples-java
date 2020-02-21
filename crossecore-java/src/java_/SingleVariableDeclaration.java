package java_;
public interface SingleVariableDeclaration 
 extends VariableDeclaration
{
	
	public static com.crossecore.ocl.QuickSet<SingleVariableDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<SingleVariableDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<SingleVariableDeclaration> result = new com.crossecore.ocl.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
		result.addAll(SingleVariableDeclaration.allInstances_);
		
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<SingleVariableDeclaration> allInstances = new com.crossecore.ocl.QuickSet<SingleVariableDeclaration>(SingleVariableDeclaration.class);
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	boolean isVarargs();
	void setVarargs(boolean value);
	//public boolean isVarargs();
	
	TypeAccess getType();
	void setType(TypeAccess value);
	com.crossecore.ocl.OrderedSet<Annotation> getAnnotations();
	
	AbstractMethodDeclaration getMethodDeclaration();
	void setMethodDeclaration(AbstractMethodDeclaration value);
	
	CatchClause getCatchClause();
	void setCatchClause(CatchClause value);
	
	EnhancedForStatement getEnhancedForStatement();
	void setEnhancedForStatement(EnhancedForStatement value);
	
}
