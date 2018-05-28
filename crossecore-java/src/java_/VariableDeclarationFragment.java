package java_;
public interface VariableDeclarationFragment 
 extends VariableDeclaration
{
	
	public static Ocllib.Set<VariableDeclarationFragment> allInstances = new Ocllib.Set<VariableDeclarationFragment>(VariableDeclarationFragment.class);
	
	
	AbstractVariablesContainer getVariablesContainer();
	void setVariablesContainer(AbstractVariablesContainer value);
	
}
