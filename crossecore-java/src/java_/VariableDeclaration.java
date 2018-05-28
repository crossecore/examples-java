package java_;
public interface VariableDeclaration 
 extends NamedElement
{
	
	public static Ocllib.Set<VariableDeclaration> allInstances = new Ocllib.Set<VariableDeclaration>(VariableDeclaration.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Expression getInitializer();
	void setInitializer(Expression value);
	Ocllib.Set<SingleVariableAccess> getUsageInVariableAccess();
	
}
