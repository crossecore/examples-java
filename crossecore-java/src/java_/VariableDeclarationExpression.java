package java_;
public interface VariableDeclarationExpression 
 extends Expression,AbstractVariablesContainer
{
	
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
	/*
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances_ = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
	
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstancesClosure = new Ocllib.QuickSet<VariableDeclarationExpression>(VariableDeclarationExpression.class);
		
	public static Ocllib.QuickSet<VariableDeclarationExpression> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(Expression.allInstances_);
			allInstancesClosure.addAll(AbstractVariablesContainer.allInstances_);
			allInstancesClosure.addAll(VariableDeclarationExpression.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Modifier getModifier();
	void setModifier(Modifier value);
	Ocllib.OrderedSet<Annotation> getAnnotations();
	
}
