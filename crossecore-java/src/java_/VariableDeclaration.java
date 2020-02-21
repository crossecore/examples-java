package java_;
public interface VariableDeclaration 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<VariableDeclaration> allInstances_ = new com.crossecore.ocl.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
		
	public static com.crossecore.ocl.QuickSet<VariableDeclaration> allInstances(){
		
		com.crossecore.ocl.QuickSet<VariableDeclaration> result = new com.crossecore.ocl.QuickSet<VariableDeclaration>(VariableDeclaration.class);
		result.addAll(VariableDeclaration.allInstances_);
		
		result.addAll(VariableDeclarationFragment.allInstances_);
		result.addAll(EnumConstantDeclaration.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(SingleVariableDeclaration.allInstances_);
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<VariableDeclaration> allInstances = new com.crossecore.ocl.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Expression getInitializer();
	void setInitializer(Expression value);
	com.crossecore.ocl.Set<SingleVariableAccess> getUsageInVariableAccess();
	
}
