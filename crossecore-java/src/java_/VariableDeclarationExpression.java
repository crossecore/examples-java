package java_;
public interface VariableDeclarationExpression 
 extends Expression,AbstractVariablesContainer
{
	
	public static Ocllib.Set<VariableDeclarationExpression> allInstances = new Ocllib.Set<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
