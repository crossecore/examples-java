package java_;
public interface AbstractVariablesContainer 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
	/*
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances_ = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstancesClosure = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
		
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(AbstractVariablesContainer.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<VariableDeclarationFragment> getFragments();
	
}
