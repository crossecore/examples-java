package java_;
public interface VariableDeclarationStatement 
 extends Statement,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances_ = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
		
	public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances(){
		
		Ocllib.QuickSet<VariableDeclarationStatement> result = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
		result.addAll(VariableDeclarationStatement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<VariableDeclarationStatement> allInstances = new Ocllib.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
