package java_;
public interface VariableDeclaration 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<VariableDeclaration> allInstances_ = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
		
	public static Ocllib.QuickSet<VariableDeclaration> allInstances(){
		
		Ocllib.QuickSet<VariableDeclaration> result = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
		result.addAll(VariableDeclaration.allInstances_);
		
		result.addAll(UnresolvedSingleVariableDeclaration.allInstances_);
		result.addAll(VariableDeclarationFragment.allInstances_);
		result.addAll(UnresolvedVariableDeclarationFragment.allInstances_);
		result.addAll(SingleVariableDeclaration.allInstances_);
		result.addAll(EnumConstantDeclaration.allInstances_);
		
		return result;
	}
	
	//public static Ocllib.QuickSet<VariableDeclaration> allInstances = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Expression getInitializer();
	void setInitializer(Expression value);
	Ocllib.Set<SingleVariableAccess> getUsageInVariableAccess();
	
}
