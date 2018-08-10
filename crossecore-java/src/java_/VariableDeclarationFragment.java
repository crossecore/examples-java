package java_;
public interface VariableDeclarationFragment 
 extends VariableDeclaration
{
	
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances_ = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
		
	public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances(){
		
		Ocllib.QuickSet<VariableDeclarationFragment> result = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
		result.addAll(VariableDeclarationFragment.allInstances_);
		
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<VariableDeclarationFragment> allInstances = new Ocllib.QuickSet<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
	
	AbstractVariablesContainer getVariablesContainer();
	void setVariablesContainer(AbstractVariablesContainer value);
	
}
