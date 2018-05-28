package java_;
public interface VariableDeclarationStatement 
 extends Statement,AbstractVariablesContainer
{
	
	public static Ocllib.Set<VariableDeclarationStatement> allInstances = new Ocllib.Set<VariableDeclarationStatement>(VariableDeclarationStatement.class);
	
	int getExtraArrayDimensions();
	void setExtraArrayDimensions(int value);
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
