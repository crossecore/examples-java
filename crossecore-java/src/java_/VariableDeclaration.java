package java_;
public interface VariableDeclaration 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<VariableDeclaration> allInstances = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
	/*
	public static Ocllib.QuickSet<VariableDeclaration> allInstances_ = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
	
	public static Ocllib.QuickSet<VariableDeclaration> allInstancesClosure = new Ocllib.QuickSet<VariableDeclaration>(VariableDeclaration.class);
		
	public static Ocllib.QuickSet<VariableDeclaration> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(VariableDeclaration.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Expression getInitializer();
	void setInitializer(Expression value);
	Ocllib.Set<SingleVariableAccess> getUsageInVariableAccess();
	
}
