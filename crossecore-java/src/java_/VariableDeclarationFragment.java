package java_;
public interface VariableDeclarationFragment 
 extends VariableDeclaration
{
	
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
	/*
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances_ = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstancesClosure = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
		
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
			allInstancesClosure.addAll(VariableDeclarationFragment.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	AbstractVariablesContainer getVariablesContainer();
	void setVariablesContainer(AbstractVariablesContainer value);
	
}
