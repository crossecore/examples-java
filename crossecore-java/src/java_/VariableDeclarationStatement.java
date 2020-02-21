package java_;
public interface VariableDeclarationStatement 
 extends Statement,AbstractVariablesContainer
{
	
	public static com.crossecore.ocl.QuickSet<VariableDeclarationStatement> allInstances_ = new com.crossecore.ocl.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
		
	public static com.crossecore.ocl.QuickSet<VariableDeclarationStatement> allInstances(){
		
		com.crossecore.ocl.QuickSet<VariableDeclarationStatement> result = new com.crossecore.ocl.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
		result.addAll(VariableDeclarationStatement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<VariableDeclarationStatement> allInstances = new com.crossecore.ocl.QuickSet<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	com.crossecore.ocl.OrderedSet<Annotation> getAnnotations();
	
}
