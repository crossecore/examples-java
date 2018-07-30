package java_;
public interface VariableDeclarationStatement 
 extends Statement,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
	/*
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances_ = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstancesClosure = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
		
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Statement.allInstances_);
			allInstancesClosure.addAll(AbstractVariablesContainer.allInstances_);
			allInstancesClosure.addAll(VariableDeclarationStatement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
