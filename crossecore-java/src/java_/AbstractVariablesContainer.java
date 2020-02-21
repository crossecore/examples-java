package java_;
public interface AbstractVariablesContainer 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<AbstractVariablesContainer> allInstances_ = new com.crossecore.ocl.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
		
	public static com.crossecore.ocl.QuickSet<AbstractVariablesContainer> allInstances(){
		
		com.crossecore.ocl.QuickSet<AbstractVariablesContainer> result = new com.crossecore.ocl.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
		result.addAll(AbstractVariablesContainer.allInstances_);
		
		result.addAll(VariableDeclarationStatement.allInstances_);
		result.addAll(VariableDeclarationExpression.allInstances_);
		result.addAll(FieldDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<AbstractVariablesContainer> allInstances = new com.crossecore.ocl.QuickSet<AbstractVariablesContainer>(AbstractVariablesContainer.class);
	
	
	TypeAccess getType();
	void setType(TypeAccess value);
	com.crossecore.ocl.OrderedSet<VariableDeclarationFragment> getFragments();
	
}
