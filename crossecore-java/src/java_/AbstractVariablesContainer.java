package java_;
public interface AbstractVariablesContainer 
 extends ASTNode
{
	
	public static Ocllib.Set<AbstractVariablesContainer> allInstances = new Ocllib.Set<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<VariableDeclarationFragment> getFragments();
	
}
