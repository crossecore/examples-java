package java_;
public interface AbstractVariablesContainer 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances_ = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
		
	public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances(){
		
		Ocllib.QuickSet<AbstractVariablesContainer> result = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
		result.addAll(AbstractVariablesContainer.allInstances_);
		
		result.addAll(FieldDeclaration.allInstances_);
		result.addAll(VariableDeclarationStatement.allInstances_);
		result.addAll(VariableDeclarationExpression.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<AbstractVariablesContainer> allInstances = new Ocllib.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	Ocllib.OrderedSet<VariableDeclarationFragment> getFragments();
	
}
