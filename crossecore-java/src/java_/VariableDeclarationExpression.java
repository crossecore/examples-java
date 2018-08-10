package java_;
public interface VariableDeclarationExpression 
 extends Expression,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances_ = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
		
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances(){
		
		Ocllib.QuickSet<VariableDeclarationExpression> result = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
		result.addAll(VariableDeclarationExpression.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
